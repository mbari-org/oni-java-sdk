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
public class LinkRenameToConceptResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The count property
     */
    private Integer count;
    /**
     * The newConcept property
     */
    private String newConcept;
    /**
     * The oldConcept property
     */
    private String oldConcept;
    /**
     * Instantiates a new {@link LinkRenameToConceptResponse} and sets the default values.
     */
    public LinkRenameToConceptResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LinkRenameToConceptResponse}
     */
    @jakarta.annotation.Nonnull
    public static LinkRenameToConceptResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LinkRenameToConceptResponse();
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
     * Gets the count property value. The count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("newConcept", (n) -> { this.setNewConcept(n.getStringValue()); });
        deserializerMap.put("oldConcept", (n) -> { this.setOldConcept(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newConcept property value. The newConcept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewConcept() {
        return this.newConcept;
    }
    /**
     * Gets the oldConcept property value. The oldConcept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldConcept() {
        return this.oldConcept;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("newConcept", this.getNewConcept());
        writer.writeStringValue("oldConcept", this.getOldConcept());
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
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Integer value) {
        this.count = value;
    }
    /**
     * Sets the newConcept property value. The newConcept property
     * @param value Value to set for the newConcept property.
     */
    public void setNewConcept(@jakarta.annotation.Nullable final String value) {
        this.newConcept = value;
    }
    /**
     * Sets the oldConcept property value. The oldConcept property
     * @param value Value to set for the oldConcept property.
     */
    public void setOldConcept(@jakarta.annotation.Nullable final String value) {
        this.oldConcept = value;
    }
}
