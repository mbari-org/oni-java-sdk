package org.mbari.vars.oni.sdk.kiota.models;

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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RawConcept implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The aphiaId property
     */
    private Long aphiaId;
    /**
     * The children property
     */
    private java.util.List<RawConcept> children;
    /**
     * The id property
     */
    private Long id;
    /**
     * The metadata property
     */
    private RawConceptMetadata metadata;
    /**
     * The names property
     */
    private java.util.List<RawConceptName> names;
    /**
     * The rankLevel property
     */
    private String rankLevel;
    /**
     * The rankName property
     */
    private String rankName;
    /**
     * Instantiates a new {@link RawConcept} and sets the default values.
     */
    public RawConcept() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RawConcept}
     */
    @jakarta.annotation.Nonnull
    public static RawConcept createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RawConcept();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the aphiaId property value. The aphiaId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAphiaId() {
        return this.aphiaId;
    }
    /**
     * Gets the children property value. The children property
     * @return a {@link java.util.List<RawConcept>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RawConcept> getChildren() {
        return this.children;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("aphiaId", (n) -> { this.setAphiaId(n.getLongValue()); });
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(RawConcept::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(RawConceptMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("names", (n) -> { this.setNames(n.getCollectionOfObjectValues(RawConceptName::createFromDiscriminatorValue)); });
        deserializerMap.put("rankLevel", (n) -> { this.setRankLevel(n.getStringValue()); });
        deserializerMap.put("rankName", (n) -> { this.setRankName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return this.id;
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a {@link RawConceptMetadata}
     */
    @jakarta.annotation.Nullable
    public RawConceptMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the names property value. The names property
     * @return a {@link java.util.List<RawConceptName>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RawConceptName> getNames() {
        return this.names;
    }
    /**
     * Gets the rankLevel property value. The rankLevel property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRankLevel() {
        return this.rankLevel;
    }
    /**
     * Gets the rankName property value. The rankName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRankName() {
        return this.rankName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("aphiaId", this.getAphiaId());
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeLongValue("id", this.getId());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeCollectionOfObjectValues("names", this.getNames());
        writer.writeStringValue("rankLevel", this.getRankLevel());
        writer.writeStringValue("rankName", this.getRankName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the aphiaId property value. The aphiaId property
     * @param value Value to set for the aphiaId property.
     */
    public void setAphiaId(@jakarta.annotation.Nullable final Long value) {
        this.aphiaId = value;
    }
    /**
     * Sets the children property value. The children property
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<RawConcept> value) {
        this.children = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final RawConceptMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the names property value. The names property
     * @param value Value to set for the names property.
     */
    public void setNames(@jakarta.annotation.Nullable final java.util.List<RawConceptName> value) {
        this.names = value;
    }
    /**
     * Sets the rankLevel property value. The rankLevel property
     * @param value Value to set for the rankLevel property.
     */
    public void setRankLevel(@jakarta.annotation.Nullable final String value) {
        this.rankLevel = value;
    }
    /**
     * Sets the rankName property value. The rankName property
     * @param value Value to set for the rankName property.
     */
    public void setRankName(@jakarta.annotation.Nullable final String value) {
        this.rankName = value;
    }
}
