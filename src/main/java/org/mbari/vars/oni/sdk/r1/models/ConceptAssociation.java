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

import java.util.UUID;

/**
 * @author Brian Schlining
 * @since 2019-06-05T16:40:00
 */
public class ConceptAssociation {

    private UUID uuid;
    private UUID videoReferenceUuid;
    private String concept;
    private String linkName;
    private String toConcept;
    private String linkValue;
    private String mimeType;

    public ConceptAssociation(UUID uuid, UUID videoReferenceUuid,
                              String concept, String linkName, String toConcept,
                              String linkValue, String mimeType) {
        this.uuid = uuid;
        this.videoReferenceUuid = videoReferenceUuid;
        this.concept = concept;
        this.linkName = linkName;
        this.toConcept = toConcept;
        this.linkValue = linkValue;
        this.mimeType = mimeType;
    }

    public UUID getUuid() {
        return uuid;
    }

    public UUID getVideoReferenceUuid() {
        return videoReferenceUuid;
    }

    public String getConcept() {
        return concept;
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

    public String getMimeType() {
        return mimeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConceptAssociation that = (ConceptAssociation) o;

        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    public Association asAssociation() {
        return new Association(linkName, toConcept, linkValue, mimeType, uuid);
    }
}
