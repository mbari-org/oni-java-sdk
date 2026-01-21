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
public class RawConceptMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The id property
     */
    private Long id;
    /**
     * The linkRealizations property
     */
    private java.util.List<RawLink> linkRealizations;
    /**
     * The linkTemplates property
     */
    private java.util.List<RawLink> linkTemplates;
    /**
     * The media property
     */
    private java.util.List<RawMedia> media;
    /**
     * Instantiates a new {@link RawConceptMetadata} and sets the default values.
     */
    public RawConceptMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RawConceptMetadata}
     */
    @jakarta.annotation.Nonnull
    public static RawConceptMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RawConceptMetadata();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("linkRealizations", (n) -> { this.setLinkRealizations(n.getCollectionOfObjectValues(RawLink::createFromDiscriminatorValue)); });
        deserializerMap.put("linkTemplates", (n) -> { this.setLinkTemplates(n.getCollectionOfObjectValues(RawLink::createFromDiscriminatorValue)); });
        deserializerMap.put("media", (n) -> { this.setMedia(n.getCollectionOfObjectValues(RawMedia::createFromDiscriminatorValue)); });
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
     * Gets the linkRealizations property value. The linkRealizations property
     * @return a {@link java.util.List<RawLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RawLink> getLinkRealizations() {
        return this.linkRealizations;
    }
    /**
     * Gets the linkTemplates property value. The linkTemplates property
     * @return a {@link java.util.List<RawLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RawLink> getLinkTemplates() {
        return this.linkTemplates;
    }
    /**
     * Gets the media property value. The media property
     * @return a {@link java.util.List<RawMedia>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RawMedia> getMedia() {
        return this.media;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("id", this.getId());
        writer.writeCollectionOfObjectValues("linkRealizations", this.getLinkRealizations());
        writer.writeCollectionOfObjectValues("linkTemplates", this.getLinkTemplates());
        writer.writeCollectionOfObjectValues("media", this.getMedia());
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the linkRealizations property value. The linkRealizations property
     * @param value Value to set for the linkRealizations property.
     */
    public void setLinkRealizations(@jakarta.annotation.Nullable final java.util.List<RawLink> value) {
        this.linkRealizations = value;
    }
    /**
     * Sets the linkTemplates property value. The linkTemplates property
     * @param value Value to set for the linkTemplates property.
     */
    public void setLinkTemplates(@jakarta.annotation.Nullable final java.util.List<RawLink> value) {
        this.linkTemplates = value;
    }
    /**
     * Sets the media property value. The media property
     * @param value Value to set for the media property.
     */
    public void setMedia(@jakarta.annotation.Nullable final java.util.List<RawMedia> value) {
        this.media = value;
    }
}
