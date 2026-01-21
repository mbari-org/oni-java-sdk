package org.mbari.vars.oni.sdk.r1.models;

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

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Brian Schlining
 * @since 2017-05-11T15:53:00
 */
public class ConceptDetails { 
    private String name;
    private String rank;
    private String author;
    private List<String> alternateNames;
    private List<ConceptMedia> media;
    private List<ConceptDescriptor> descriptors;

    public ConceptDetails(String name,
                          String rank,
                          String author,
                          List<String> alternateNames,
                          List<ConceptMedia> media,
                          List<ConceptDescriptor> descriptors) {
        this.name = name;
        this.alternateNames = alternateNames.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toUnmodifiableList());
        this.media = Collections.unmodifiableList(media);
        this.descriptors = Collections.unmodifiableList(descriptors);
    }

    public String getName() {
        return name;
    }

    public List<String> getAlternateNames() {
        return alternateNames;
    }

    public List<ConceptMedia> getMedia() {
        return media;
    }

    public List<ConceptDescriptor> getDescriptors() {
        return descriptors;
    }

    public String getRank() {
        return rank;
    }

    public String getAuthor() {
        return author;
    }

    public static ConceptDetails fromKiota(org.mbari.vars.oni.sdk.kiota.models.ConceptMetadata kiotaConceptDetails) {
        return new ConceptDetails(
                kiotaConceptDetails.getName(),
                kiotaConceptDetails.getRank(),
                kiotaConceptDetails.getAuthor(),
                kiotaConceptDetails.getAlternateNames(),
                kiotaConceptDetails.getMedia().stream()
                        .map(ConceptMedia::fromKiota)
                        .collect(Collectors.toList()),
                kiotaConceptDetails.getLinkRealizations().stream()
                        .map(ConceptDescriptor::fromKiota)
                        .collect(Collectors.toList())
        );
    }
}
