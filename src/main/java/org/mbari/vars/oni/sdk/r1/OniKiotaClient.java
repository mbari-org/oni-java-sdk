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

import java.net.URI;
import java.util.List;
import java.util.Optional;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

import org.mbari.vars.oni.sdk.OniFactory;
import org.mbari.vars.oni.sdk.kiota.Oni;
import org.mbari.vars.oni.sdk.kiota.models.*;
import org.mbari.vars.oni.sdk.kiota.v1.linkrealizations.item.LinkrealizationsDeleteResponse;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.item.LinktemplatesDeleteResponse;
import org.mbari.vars.oni.sdk.r1.models.Concept;
import org.mbari.vars.oni.sdk.r1.models.ConceptAssociationTemplate;
import org.mbari.vars.oni.sdk.r1.models.ConceptDetails;
import org.mbari.vars.oni.sdk.r1.models.PreferenceNode;
import org.mbari.vars.oni.sdk.r1.models.User;

public class OniKiotaClient implements ConceptService, UserService, PreferencesService,
        LinkRealizationService, LinkTemplateService {

    private final Oni oni;
    protected final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public OniKiotaClient(Oni oni) {
        this.oni = oni;
    }

    public OniKiotaClient(URI baseUri, String accessToken) {
        this(OniFactory.create(baseUri.toString(), accessToken));
    }

    public OniKiotaClient(URI baseUri) {
        this(OniFactory.create(baseUri.toString()));
    }

    public Oni getOni() {
        return oni;
    }

    @Override
    public CompletableFuture<Concept> findRoot() {
        return findOneOrNull(() -> {
            var reponse = oni.v1()
                    .concept()
                    .query()
                    .root()
                    .get();
            return Concept.fromKiota(reponse);
        });
    }

    @Override
    public CompletableFuture<Optional<ConceptDetails>> findDetails(String name) {
        return findOne(() -> oni.v1()
                .concept()
                .byName(name)
                .get()).thenApply(opt -> opt.map(ConceptDetails::fromKiota));
    }

    @Override
    public CompletableFuture<ConceptDetails> findRootDetails() {
        return findOneOrNull(() -> oni.v1()
                .concept()
                .query()
                .root()
                .get()).thenApply(ConceptDetails::fromKiota);
    }

    @Override
    public CompletableFuture<Optional<Concept>> findParent(String name) {
        return findOne(() -> oni.v1()
                .concept()
                .parent()
                .byName(name)
                .get()).thenApply(opt -> opt.map(Concept::fromKiota));
    }

    @Override
    public CompletableFuture<List<String>> findAllNames() {
        return findMany(() -> oni.v1()
                .concept()
                .get());
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findAllTemplates() {
        return findMany(() -> oni.v1()
                .links()
                .get()).thenApply(list -> list.stream()
                        .map(ConceptAssociationTemplate::fromKiota)
                        .toList());
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name) {
        return findMany(() -> oni.v1()
                .links()
                .byName(name)
                .get()).thenApply(list -> list.stream()
                        .map(ConceptAssociationTemplate::fromKiota)
                        .toList());
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name, String linkname) {
        return findMany(() -> oni.v1()
                .links()
                .byName(name)
                .using()
                .byLinkName(linkname)
                .get()).thenApply(list -> list.stream()
                        .map(ConceptAssociationTemplate::fromKiota)
                        .toList());
    }

    @Override
    public CompletableFuture<Optional<Concept>> findConcept(String name) {
        return findOne(() -> oni.v1()
                .concept()
                .byName(name)
                .get()).thenApply(opt -> opt.map(Concept::fromKiota));
    }

    @Override
    public CompletableFuture<Optional<Concept>> findPhylogenyDown(String name) {
        return findOne(() -> oni.v1()
                .phylogeny()
                .down()
                .byName(name)
                .get()).thenApply(opt -> opt.map(Concept::fromKiota));
    }

    @Override
    public CompletableFuture<List<User>> findAllUsers() {
        return findMany(() -> oni.v1()
                .users()
                .get()).thenApply(list -> list.stream()
                        .map(User::fromKiota)
                        .toList());
    }

    @Override
    public CompletableFuture<User> create(User user) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                    .users()
                    .post(user.toKiotaCreate());
            if (response == null) {
                return null;
            }
            return User.fromKiota(response);
        }, executor);
    }

    @Override
    public CompletableFuture<Optional<User>> update(User user) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                    .users()
                    .byName(user.getUsername())
                    .put(user.toKiotaUpdate());
            if (response == null) {
                return Optional.empty();
            }
            return Optional.of(User.fromKiota(response));
        }, executor);
    }

    @Override
    public CompletableFuture<PreferenceNode> create(PreferenceNode node) {
        return CompletableFuture.supplyAsync(() -> {
            var prefNode = oni.v1()
                    .prefs()
                    .post(node.toKiota());
            if (prefNode == null) {
                return null;
            }
            return PreferenceNode.fromKiota(prefNode);
        }, executor);
    }

    @Override
    public CompletableFuture<Optional<PreferenceNode>> update(PreferenceNode node) {
        return CompletableFuture.supplyAsync(() -> {
            var prefNode = oni.v1()
                    .prefs()
                    .put(node.toKiotaUpdate());
            if (prefNode == null) {
                return Optional.empty();
            }
            return Optional.of(PreferenceNode.fromKiota(prefNode));
        }, executor);
    }

    @Override
    public CompletableFuture<Void> delete(PreferenceNode node) {
        return CompletableFuture.runAsync(() -> {
            oni.v1()
                    .prefs()
                    .delete(requestConfiguration -> {
                        requestConfiguration.queryParameters.name = node.getName();
                        requestConfiguration.queryParameters.key = node.getKey();
                    });
        }, executor);
    }

    @Override
    public CompletableFuture<List<PreferenceNode>> findByName(String nodeName) {
        return findMany(() -> oni.v1()
                .prefs()
                .get(requestConfiguration -> {
                    requestConfiguration.queryParameters.name = nodeName;
                })).thenApply(list -> list.stream()
                        .map(PreferenceNode::fromKiota)
                        .toList());
    }

    @Override
    public CompletableFuture<List<PreferenceNode>> findByNameLike(String prefix) {
        return findMany(() -> oni.v1()
                .prefs()
                .startswith()
                .get(requestConfiguration -> {
                    requestConfiguration.queryParameters.prefix = prefix;
                })).thenApply(list -> list.stream()
                        .map(PreferenceNode::fromKiota)
                        .toList());
    }

    @Override
    public CompletableFuture<Optional<PreferenceNode>> findByNameAndKey(String nodeName, String key) {
        return findMany(() -> oni.v1()
                .prefs()
                .get(requestConfiguration -> {
                    requestConfiguration.queryParameters.name = nodeName;
                    requestConfiguration.queryParameters.key = key;
                })).thenApply(list -> list.stream()
                        .map(PreferenceNode::fromKiota)
                        .findFirst());
    }

    @Override
    public CompletableFuture<List<ExtendedLink>> findLinkRealizationsByConceptName(String conceptId) {
        return findMany(() -> oni.v1()
                .linkrealizations()
                .concept()
                .byConceptName(conceptId)
                .get()

        );
    }

    @Override
    public CompletableFuture<List<ExtendedLink>> findLinkRealizationsByLinkName(String linkName) {
        return findMany(() -> oni.v1()
                .linkrealizations()
                .query()
                .linkname()
                .byLinkName(linkName)
                .get());
    }

    @Override
    public CompletableFuture<List<ExtendedLink>> findLinkRealizationsByPrototype(Link link) {
        return findMany(() -> oni.v1()
                .linkrealizations()
                .prototype()
                .post(link));
    }

    @Override
    public CompletableFuture<Count> countLinkRealizations() {
        return findOneOrNull(() -> oni.v1()
                .linkrealizations()
                .count()
                .get());
    }

    @Override
    public CompletableFuture<PageSeqExtendedLink> listAllLinkRealizations(int limit, int offset) {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linkrealizations()
                .get(requestConfiguration -> {
                    requestConfiguration.queryParameters.limit = limit;
                    requestConfiguration.queryParameters.offset = offset;
                }), executor);
        }

    @Override
    public CompletableFuture<ExtendedLink> createLinkRealization(LinkCreate linkCreate) {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linkrealizations()
                .post(linkCreate)

                , executor);
    }

    @Override
    public CompletableFuture<ExtendedLink> updateLinkRealization(Long id, LinkUpdate linkUpdate) {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linkrealizations()
                .byId(id)
                .put(linkUpdate), executor);
    }

    @Override
    public CompletableFuture<LinkrealizationsDeleteResponse> deleteLinkRealization(Long linkId) {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linkrealizations()
                .byId(linkId)
                .delete(), executor);
    }

    @Override
    public CompletableFuture<ExtendedLink> findLinkRealizationById(Long linkId) {
        return findOneOrNull(() -> oni.v1()
                .linkrealizations()
                .byId(linkId)
                .get() );
    }

    @Override
    public CompletableFuture<Count> countLinkTemplates() {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linktemplates()
                .count()
                .get(), executor);
    }

    @Override
    public CompletableFuture<PageSeqExtendedLink> listAllLinkTemplates(int limit, int offset) {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linktemplates()
                .get(requestConfiguration -> {
                    requestConfiguration.queryParameters.limit = limit;
                    requestConfiguration.queryParameters.offset = offset;
                }), executor);
    }

    @Override
    public CompletableFuture<ExtendedLink> createLinkTemplate(LinkCreate linkCreate) {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linktemplates()
                .post(linkCreate), executor);
    }

    @Override
    public CompletableFuture<ExtendedLink> updateLinkTemplate(Long id, LinkUpdate linkUpdate) {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linktemplates()
                .byId(id)
                .put(linkUpdate), executor);
    }

    @Override
    public CompletableFuture<LinktemplatesDeleteResponse> deleteLinkTemplate(Long linkId) {
        return CompletableFuture.supplyAsync(() -> oni.v1()
                .linktemplates()
                .byId(linkId)
                .delete(), executor);
    }

    @Override
    public CompletableFuture<Optional<User>> findByUsername(String username) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                var response = oni.v1()
                        .users()
                        .byName(username)
                        .get();
                if (response == null) {
                    return Optional.empty();
                }
                return Optional.of(User.fromKiota(response));
            } catch (Exception e) {
                e.printStackTrace();
                return Optional.empty();
            }
        }, executor);

    }

    @Override
    public CompletableFuture<Optional<User>> changePassword(String user, String oldPassword, String newPassword) {
        return findByUsername(user).thenApplyAsync((opt) -> {
            if (opt.isPresent()) {
                var us = opt.get();
                var kiotaUser = us.toKiotaUpdate();
                kiotaUser.setPassword(newPassword);
                try {
                    var response = oni.v1()
                            .users()
                            .byName(user)
                            .put(kiotaUser);
                    return Optional.of(User.fromKiota(response));
                } catch (Exception e) {
                    e.printStackTrace();
                    return Optional.<User>empty();
                }
            }
            return Optional.empty();
        }, executor);
    }

    /**
     * Helper method that executes a supplier and wraps the result in an Optional.
     * <p>
     * Handles {@link NotFound} exceptions by returning an empty Optional instead
     * of propagating the exception. Executes asynchronously using virtual threads.
     * </p>
     *
     * @param <A>      the type of the result
     * @param supplier the supplier to execute
     * @return a CompletableFuture containing an Optional with the result, or empty
     *         if not found
     */
    private <A> CompletableFuture<Optional<A>> findOne(Supplier<A> supplier) {
        return findOneOrNull(supplier).thenApply(Optional::ofNullable);
    }

    /**
     * Helper method that executes a supplier and returns null on NotFound.
     * <p>
     * Handles {@link NotFound} exceptions by returning null instead of propagating
     * the exception. This simplifies error handling for callers who expect nullable
     * results. Executes asynchronously using virtual threads.
     * </p>
     *
     * @param <A>      the type of the result
     * @param supplier the supplier to execute
     * @return a CompletableFuture containing the result, or null if not found
     */
    private <A> CompletableFuture<A> findOneOrNull(Supplier<A> supplier) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return supplier.get();
            } catch (NotFound e) {
                return null;
            }
        }, executor);
    }

    /**
     * Helper method that executes a supplier and returns an empty list on NotFound.
     * <p>
     * Handles {@link NotFound} exceptions by returning an empty list instead of
     * propagating the exception. This simplifies error handling for callers who
     * expect list results. Executes asynchronously using virtual threads.
     * </p>
     *
     * @param <A>      the type of elements in the result list
     * @param supplier the supplier to execute
     * @return a CompletableFuture containing the result list, or an empty list if
     *         not found
     */
    private <A> CompletableFuture<List<A>> findMany(Supplier<List<A>> supplier) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return supplier.get();
            } catch (NotFound e) {
                return List.of();
            }
        }, executor);
    }
}
