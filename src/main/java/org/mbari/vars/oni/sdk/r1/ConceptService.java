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


import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.mbari.vars.oni.sdk.r1.models.Concept;
import org.mbari.vars.oni.sdk.r1.models.ConceptAssociationTemplate;
import org.mbari.vars.oni.sdk.r1.models.ConceptDetails;

/**
 * @author Brian Schlining
 * @since 2017-05-11T15:41:00
 */
public interface ConceptService {

    /**
     * Find the root concept
     * @return The root concept
     */
    CompletableFuture<Concept> findRoot();

    /**
     * Retrieves details about a specific node, such as alternate names and media.
     * @param name The name of the node to search for, can be primary or other
     * @return The details for the Concept
     */
    CompletableFuture<Optional<ConceptDetails>> findDetails(String name);

    /**
     * Find the details for the root concept
     * @return The details for the root concept
     */
    CompletableFuture<ConceptDetails> findRootDetails();

    /**
     * Find the parent of a concept. 
     * @param name The name of the concept to find the parent of
     * @return The parent of the concept, if it exists
     */
    CompletableFuture<Optional<Concept>> findParent(String name);

    /**
     *
     * @return A list of all concept names found in the knowledgebase.
     */
    CompletableFuture<List<String>> findAllNames();

    /**
     * Find all linkTemplates in the knowledgebase. These are used to create associations between concepts in annotation applications.
     * @return A list of all linkTemplates
     */
    CompletableFuture<List<ConceptAssociationTemplate>> findAllTemplates();

    /**
     * Finda linkTemplates that can be applied to a concept. These are used to create associations between concepts in annotation applications.
     * @param name The name of the concept to find applicable linkTemplates for
     * @return A list of linkTemplates that can be applied to the concept
     */
    CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name);

    /**
     * Find linkTemplates that can be applied to a concept via a specific link. These are used to create associations between concepts in annotation applications.
     * @param name The name of the concept to find applicable linkTemplates for
     * @param linkname The name of the link to find applicable linkTemplates for
     * @return A list of linkTemplates that can be applied to the concept via the provided link
     */
    CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name, String linkname);
    /**
     * Fetch a concept (and it's metadata) by name. The name can be either the primary name or an alternate name.
     * @param name The name of the concept to find
     * @return The concept, if it exists
     */
    CompletableFuture<Optional<Concept>> findConcept(String name);

    /**
     * Find a branch of the concept tree from the provided name on down
     * @param name The name of the concept to find the phylogeny for
     * @return The concept and all of its descendants, if it exists
     */
    CompletableFuture<Optional<Concept>> findPhylogenyDown(String name);


}
