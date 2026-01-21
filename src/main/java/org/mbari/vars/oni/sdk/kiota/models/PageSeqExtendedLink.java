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
public class PageSeqExtendedLink implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The content property
     */
    private java.util.List<ExtendedLink> content;
    /**
     * The limit property
     */
    private Integer limit;
    /**
     * The offset property
     */
    private Integer offset;
    /**
     * Instantiates a new {@link PageSeqExtendedLink} and sets the default values.
     */
    public PageSeqExtendedLink() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PageSeqExtendedLink}
     */
    @jakarta.annotation.Nonnull
    public static PageSeqExtendedLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PageSeqExtendedLink();
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
     * Gets the content property value. The content property
     * @return a {@link java.util.List<ExtendedLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtendedLink> getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("content", (n) -> { this.setContent(n.getCollectionOfObjectValues(ExtendedLink::createFromDiscriminatorValue)); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. The limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. The offset property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("content", this.getContent());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("offset", this.getOffset());
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
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final java.util.List<ExtendedLink> value) {
        this.content = value;
    }
    /**
     * Sets the limit property value. The limit property
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
}
