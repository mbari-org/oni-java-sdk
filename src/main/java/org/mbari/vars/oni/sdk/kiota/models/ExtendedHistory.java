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
public class ExtendedHistory implements AdditionalDataHolder, Parsable {
    /**
     * The action property
     */
    private String action;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The approved property
     */
    private Boolean approved;
    /**
     * The concept property
     */
    private String concept;
    /**
     * The creationTimestamp property
     */
    private String creationTimestamp;
    /**
     * The creatorName property
     */
    private String creatorName;
    /**
     * The field property
     */
    private String field;
    /**
     * The id property
     */
    private Long id;
    /**
     * The newValue property
     */
    private String newValue;
    /**
     * The oldValue property
     */
    private String oldValue;
    /**
     * The processedTimestamp property
     */
    private String processedTimestamp;
    /**
     * The processorName property
     */
    private String processorName;
    /**
     * Instantiates a new {@link ExtendedHistory} and sets the default values.
     */
    public ExtendedHistory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtendedHistory}
     */
    @jakarta.annotation.Nonnull
    public static ExtendedHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtendedHistory();
    }
    /**
     * Gets the action property value. The action property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAction() {
        return this.action;
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
     * Gets the approved property value. The approved property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getApproved() {
        return this.approved;
    }
    /**
     * Gets the concept property value. The concept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConcept() {
        return this.concept;
    }
    /**
     * Gets the creationTimestamp property value. The creationTimestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Gets the creatorName property value. The creatorName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatorName() {
        return this.creatorName;
    }
    /**
     * Gets the field property value. The field property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getField() {
        return this.field;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("action", (n) -> { this.setAction(n.getStringValue()); });
        deserializerMap.put("approved", (n) -> { this.setApproved(n.getBooleanValue()); });
        deserializerMap.put("concept", (n) -> { this.setConcept(n.getStringValue()); });
        deserializerMap.put("creationTimestamp", (n) -> { this.setCreationTimestamp(n.getStringValue()); });
        deserializerMap.put("creatorName", (n) -> { this.setCreatorName(n.getStringValue()); });
        deserializerMap.put("field", (n) -> { this.setField(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("newValue", (n) -> { this.setNewValue(n.getStringValue()); });
        deserializerMap.put("oldValue", (n) -> { this.setOldValue(n.getStringValue()); });
        deserializerMap.put("processedTimestamp", (n) -> { this.setProcessedTimestamp(n.getStringValue()); });
        deserializerMap.put("processorName", (n) -> { this.setProcessorName(n.getStringValue()); });
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
     * Gets the newValue property value. The newValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewValue() {
        return this.newValue;
    }
    /**
     * Gets the oldValue property value. The oldValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldValue() {
        return this.oldValue;
    }
    /**
     * Gets the processedTimestamp property value. The processedTimestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessedTimestamp() {
        return this.processedTimestamp;
    }
    /**
     * Gets the processorName property value. The processorName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessorName() {
        return this.processorName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("action", this.getAction());
        writer.writeBooleanValue("approved", this.getApproved());
        writer.writeStringValue("concept", this.getConcept());
        writer.writeStringValue("creationTimestamp", this.getCreationTimestamp());
        writer.writeStringValue("creatorName", this.getCreatorName());
        writer.writeStringValue("field", this.getField());
        writer.writeLongValue("id", this.getId());
        writer.writeStringValue("newValue", this.getNewValue());
        writer.writeStringValue("oldValue", this.getOldValue());
        writer.writeStringValue("processedTimestamp", this.getProcessedTimestamp());
        writer.writeStringValue("processorName", this.getProcessorName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final String value) {
        this.action = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the approved property value. The approved property
     * @param value Value to set for the approved property.
     */
    public void setApproved(@jakarta.annotation.Nullable final Boolean value) {
        this.approved = value;
    }
    /**
     * Sets the concept property value. The concept property
     * @param value Value to set for the concept property.
     */
    public void setConcept(@jakarta.annotation.Nullable final String value) {
        this.concept = value;
    }
    /**
     * Sets the creationTimestamp property value. The creationTimestamp property
     * @param value Value to set for the creationTimestamp property.
     */
    public void setCreationTimestamp(@jakarta.annotation.Nullable final String value) {
        this.creationTimestamp = value;
    }
    /**
     * Sets the creatorName property value. The creatorName property
     * @param value Value to set for the creatorName property.
     */
    public void setCreatorName(@jakarta.annotation.Nullable final String value) {
        this.creatorName = value;
    }
    /**
     * Sets the field property value. The field property
     * @param value Value to set for the field property.
     */
    public void setField(@jakarta.annotation.Nullable final String value) {
        this.field = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the newValue property value. The newValue property
     * @param value Value to set for the newValue property.
     */
    public void setNewValue(@jakarta.annotation.Nullable final String value) {
        this.newValue = value;
    }
    /**
     * Sets the oldValue property value. The oldValue property
     * @param value Value to set for the oldValue property.
     */
    public void setOldValue(@jakarta.annotation.Nullable final String value) {
        this.oldValue = value;
    }
    /**
     * Sets the processedTimestamp property value. The processedTimestamp property
     * @param value Value to set for the processedTimestamp property.
     */
    public void setProcessedTimestamp(@jakarta.annotation.Nullable final String value) {
        this.processedTimestamp = value;
    }
    /**
     * Sets the processorName property value. The processorName property
     * @param value Value to set for the processorName property.
     */
    public void setProcessorName(@jakarta.annotation.Nullable final String value) {
        this.processorName = value;
    }
}
