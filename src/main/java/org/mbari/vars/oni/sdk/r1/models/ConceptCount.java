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

/**
 * {"concept":"Nanomia", "count":"55"}
 * 
 * @author Brian Schlining
 * @since 2019-03-08T14:52:00
 */
public class ConceptCount {
    private String concept;
    private Integer count;

    public ConceptCount(String concept, Integer count) {
        this.concept = concept;
        this.count = count;
    }

    public String getConcept() {
        return concept;
    }

    public Integer getCount() {
        return count;
    }
}
