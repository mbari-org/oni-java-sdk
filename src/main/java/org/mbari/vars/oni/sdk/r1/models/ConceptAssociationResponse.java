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

import java.util.List;

/**
 * @author Brian Schlining
 * @since 2019-06-05T16:44:00
 */
public class ConceptAssociationResponse {
    private ConceptAssociationRequest conceptAssociationRequest;
    private List<ConceptAssociation> conceptAssociations;

    public ConceptAssociationResponse(ConceptAssociationRequest conceptAssociationRequest,
                                      List<ConceptAssociation> conceptAssociations) {
        this.conceptAssociationRequest = conceptAssociationRequest;
        this.conceptAssociations = conceptAssociations;
    }

    public ConceptAssociationRequest getConceptAssociationRequest() {
        return conceptAssociationRequest;
    }

    public List<ConceptAssociation> getConceptAssociations() {
        return conceptAssociations;
    }
}
