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
public class Link implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The id property
     */
    private Long id;
    /**
     * The linkName property
     */
    private String linkName;
    /**
     * The linkValue property
     */
    private String linkValue;
    /**
     * The toConcept property
     */
    private String toConcept;
    /**
     * Instantiates a new {@link Link} and sets the default values.
     */
    public Link() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Link}
     */
    @jakarta.annotation.Nonnull
    public static Link createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Link();
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
        deserializerMap.put("linkName", (n) -> { this.setLinkName(n.getStringValue()); });
        deserializerMap.put("linkValue", (n) -> { this.setLinkValue(n.getStringValue()); });
        deserializerMap.put("toConcept", (n) -> { this.setToConcept(n.getStringValue()); });
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
     * Gets the linkName property value. The linkName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkName() {
        return this.linkName;
    }
    /**
     * Gets the linkValue property value. The linkValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkValue() {
        return this.linkValue;
    }
    /**
     * Gets the toConcept property value. The toConcept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToConcept() {
        return this.toConcept;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("id", this.getId());
        writer.writeStringValue("linkName", this.getLinkName());
        writer.writeStringValue("linkValue", this.getLinkValue());
        writer.writeStringValue("toConcept", this.getToConcept());
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
     * Sets the linkName property value. The linkName property
     * @param value Value to set for the linkName property.
     */
    public void setLinkName(@jakarta.annotation.Nullable final String value) {
        this.linkName = value;
    }
    /**
     * Sets the linkValue property value. The linkValue property
     * @param value Value to set for the linkValue property.
     */
    public void setLinkValue(@jakarta.annotation.Nullable final String value) {
        this.linkValue = value;
    }
    /**
     * Sets the toConcept property value. The toConcept property
     * @param value Value to set for the toConcept property.
     */
    public void setToConcept(@jakarta.annotation.Nullable final String value) {
        this.toConcept = value;
    }
}
