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

import org.mbari.vars.oni.sdk.kiota.models.Link;

/**
 * @author Brian Schlining
 * @since 2017-05-11T15:56:00
 */
public class ConceptDescriptor {

    private String linkName;
    private String toConcept;
    private String linkValue;

    public ConceptDescriptor(String linkName, String toConcept, String linkValue) {
        this.linkName = linkName;
        this.toConcept = toConcept;
        this.linkValue = linkValue;
    }

    public String getLinkName() {
        return linkName;
    }

    public String getToConcept() {
        return toConcept;
    }

    public String getLinkValue() {
        return linkValue;
    }

    public static ConceptDescriptor fromKiota(Link kiota) {
        return new ConceptDescriptor(kiota.getLinkName(), kiota.getToConcept(), kiota.getLinkValue());
    }
}
