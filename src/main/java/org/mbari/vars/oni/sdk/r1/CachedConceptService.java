package org.mbari.vars.oni.sdk.r1;

/*-
 * #%L
 * org.mbari.vars:oni-java-sdk
 * %%
 * Copyright (C) 2025 - 2026 Monterey Bay Aquarium Research Institute
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.github.benmanes.caffeine.cache.AsyncLoadingCache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.mbari.vars.oni.sdk.r1.models.Concept;
import org.mbari.vars.oni.sdk.r1.models.ConceptAssociationTemplate;
import org.mbari.vars.oni.sdk.r1.models.ConceptDetails;

/**
 * @author Brian Schlining
 * @since 2018-03-06T15:13:00
 */
public class CachedConceptService implements ConceptService {

    private final ConceptService conceptService;
    private volatile String rootName;

    // This list is unmodifiable. It gets set to a populated list as needed in `findAllNames`
    private volatile List<String> allNames = Collections.emptyList();

    private final AsyncLoadingCache<String, Optional<Concept>> conceptCache;
    private final AsyncLoadingCache<String, List<ConceptAssociationTemplate>> templateCache;
    private final AsyncLoadingCache<String, Optional<Concept>> phylogenyDownCache;

    private final ReentrantLock rootLock = new ReentrantLock();
    private final ReentrantLock allNamesLock = new ReentrantLock();

    private static final Logger log = System.getLogger(CachedConceptService.class.getName());


    public CachedConceptService(ConceptService conceptService) {
        this.conceptService = conceptService;

        conceptCache = Caffeine.newBuilder()
                .expireAfterWrite(120, TimeUnit.MINUTES)
                .maximumSize(20000)
                .buildAsync((key, executor) -> loadConcept(key));
        templateCache = Caffeine.newBuilder()
                .expireAfterWrite(120, TimeUnit.MINUTES)
                .maximumSize(20000)
                .buildAsync((key, executor) -> conceptService.findTemplates(key));

        phylogenyDownCache = Caffeine.newBuilder()
                .expireAfterWrite(120, TimeUnit.MINUTES)
                .maximumSize(20000)
                .buildAsync((key, executor) -> conceptService.findPhylogenyDown(key));
        findRoot();
    }

    public synchronized void clear() {
        rootName = null;
        allNames = Collections.emptyList();
        conceptCache.synchronous().invalidateAll();
        templateCache.synchronous().invalidateAll();
        phylogenyDownCache.synchronous().invalidateAll();
    }

    private CompletableFuture<Optional<Concept>> loadConcept(String name) {
        return conceptService.findConcept(name)
                .thenApply(this::cacheConcept);
    }

    private Optional<Concept> cacheConcept(Optional<Concept> concept) {
        return concept.map(c -> {
            conceptCache.synchronous().put(c.getName(), concept);
            for (String altName : c.getAlternativeNames()) {
                conceptCache.synchronous().put(altName, concept);
            }
            return c;
        });
    }


    @Override
    public CompletableFuture<Concept> findRoot() {
        rootLock.lock();
        try {   
            if (rootName == null) {

                // Does the look twice. It is known. 
                // Get the root name, then get it again to cache it.
                return conceptService.findRoot()
                        .thenApply(c -> cacheConcept(Optional.ofNullable(c)))
                        .thenCompose(root -> {
                            if (root.isEmpty()) {
                                return CompletableFuture.failedFuture(new RuntimeException("No root was found in the kB"));
                            }
                            else {
                                var r = root.get();
                                return findPhylogenyDown(r.getName())
                                    .thenApply(opt -> {
                                        if (opt.isEmpty()) {
                                            log.log(Level.WARNING,"Failed to load KB tree");
                                        }
                                        else {
                                            var tree = opt.get();
                                            rootName = tree.getName();
                                            cacheChildrenPhylogeny(tree);

                                        }
                                        return r;
                                    });

                            }
                        });
            }
            else {
                return conceptCache.get(rootName)
                        .thenApply(Optional::get);
            }
        }
        finally {
            rootLock.unlock();
        }
    }

    private void cacheChildrenPhylogeny(Concept concept) {
        if (concept != null) {
            concept.getChildren().forEach(c -> {
                var opt = Optional.of(c);
                phylogenyDownCache.synchronous().put(c.getName(), opt);
                c.getAlternativeNames().forEach(altName -> phylogenyDownCache.synchronous().put(altName, opt));
                conceptCache.synchronous().put(c.getName(), opt);
                cacheChildrenPhylogeny(c);
            });
        }
    }

    @Override
    public CompletableFuture<Optional<Concept>> findParent(String name) {
        return conceptService.findParent(name);
    }


    @Override
    public CompletableFuture<Optional<ConceptDetails>> findDetails(String name) {
        return conceptCache.get(name)
                .thenApply(opt -> opt.map(c -> c.getConceptDetails()));
    }

    @Override
    public CompletableFuture<ConceptDetails> findRootDetails() {
        return findRoot()
            .thenApply(c -> c.getConceptDetails());
    }

    @Override
    public CompletableFuture<List<String>> findAllNames() {
        if (allNames.isEmpty()) {
            try {
                allNamesLock.lock();
                if (allNames.isEmpty()) {
                    return conceptService.findAllNames()
                            .thenApply(ns -> {
                                allNames = Collections.unmodifiableList(ns);
                                return allNames;
                            });
                }
                else {
                    return CompletableFuture.completedFuture(allNames);
                }
            }
            finally {
                allNamesLock.unlock();
            }
        }
        else {
            return CompletableFuture.completedFuture(allNames);
        }
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findAllTemplates() {
        return conceptService.findAllTemplates();
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name) {
        return templateCache.get(name);
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name, String linkname) {
        return conceptService.findTemplates(name, linkname);
    }

    @Override
    public CompletableFuture<Optional<Concept>> findConcept(String name) {
        return conceptCache.get(name);
    };

    @Override
    public CompletableFuture<Optional<Concept>> findPhylogenyDown(String name) {
        return phylogenyDownCache.get(name);
    }

}
