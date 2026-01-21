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
import java.util.UUID;

/**
 * @author Brian Schlining
 * @since 2019-06-05T16:39:00
 */
public class ConceptAssociationRequest {
    private String linkName;
    private List<UUID> videoReferenceUuids;

    public ConceptAssociationRequest(String linkName, List<UUID> videoReferenceUuids) {
        this.linkName = linkName;
        this.videoReferenceUuids = videoReferenceUuids;
    }

    public String getLinkName() {
        return linkName;
    }

    public List<UUID> getVideoReferenceUuids() {
        return videoReferenceUuids;
    }
}
