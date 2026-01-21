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
public class ConceptCreate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The aphiaId property
     */
    private Long aphiaId;
    /**
     * The author property
     */
    private String author;
    /**
     * The name property
     */
    private String name;
    /**
     * The parentName property
     */
    private String parentName;
    /**
     * The rankLevel property
     */
    private String rankLevel;
    /**
     * The rankName property
     */
    private String rankName;
    /**
     * Instantiates a new {@link ConceptCreate} and sets the default values.
     */
    public ConceptCreate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConceptCreate}
     */
    @jakarta.annotation.Nonnull
    public static ConceptCreate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConceptCreate();
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
     * Gets the author property value. The author property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthor() {
        return this.author;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("aphiaId", (n) -> { this.setAphiaId(n.getLongValue()); });
        deserializerMap.put("author", (n) -> { this.setAuthor(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("parentName", (n) -> { this.setParentName(n.getStringValue()); });
        deserializerMap.put("rankLevel", (n) -> { this.setRankLevel(n.getStringValue()); });
        deserializerMap.put("rankName", (n) -> { this.setRankName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the parentName property value. The parentName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentName() {
        return this.parentName;
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
        writer.writeStringValue("author", this.getAuthor());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("parentName", this.getParentName());
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
     * Sets the author property value. The author property
     * @param value Value to set for the author property.
     */
    public void setAuthor(@jakarta.annotation.Nullable final String value) {
        this.author = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the parentName property value. The parentName property
     * @param value Value to set for the parentName property.
     */
    public void setParentName(@jakarta.annotation.Nullable final String value) {
        this.parentName = value;
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
