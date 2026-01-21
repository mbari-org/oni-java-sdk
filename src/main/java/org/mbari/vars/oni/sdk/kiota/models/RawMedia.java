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
public class RawMedia implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The caption property
     */
    private String caption;
    /**
     * The credit property
     */
    private String credit;
    /**
     * The id property
     */
    private Long id;
    /**
     * The primaryMedia property
     */
    private Boolean primaryMedia;
    /**
     * The type property
     */
    private String type;
    /**
     * The url property
     */
    private String url;
    /**
     * Instantiates a new {@link RawMedia} and sets the default values.
     */
    public RawMedia() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RawMedia}
     */
    @jakarta.annotation.Nonnull
    public static RawMedia createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RawMedia();
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
     * Gets the caption property value. The caption property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaption() {
        return this.caption;
    }
    /**
     * Gets the credit property value. The credit property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCredit() {
        return this.credit;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("caption", (n) -> { this.setCaption(n.getStringValue()); });
        deserializerMap.put("credit", (n) -> { this.setCredit(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("primaryMedia", (n) -> { this.setPrimaryMedia(n.getBooleanValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
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
     * Gets the primaryMedia property value. The primaryMedia property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPrimaryMedia() {
        return this.primaryMedia;
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the url property value. The url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("caption", this.getCaption());
        writer.writeStringValue("credit", this.getCredit());
        writer.writeLongValue("id", this.getId());
        writer.writeBooleanValue("primaryMedia", this.getPrimaryMedia());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the caption property value. The caption property
     * @param value Value to set for the caption property.
     */
    public void setCaption(@jakarta.annotation.Nullable final String value) {
        this.caption = value;
    }
    /**
     * Sets the credit property value. The credit property
     * @param value Value to set for the credit property.
     */
    public void setCredit(@jakarta.annotation.Nullable final String value) {
        this.credit = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the primaryMedia property value. The primaryMedia property
     * @param value Value to set for the primaryMedia property.
     */
    public void setPrimaryMedia(@jakarta.annotation.Nullable final Boolean value) {
        this.primaryMedia = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
