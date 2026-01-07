package org.mbari.vars.oni.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Reference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The citation property
     */
    private String citation;
    /**
     * The concepts property
     */
    private java.util.List<String> concepts;
    /**
     * The doi property
     */
    private String doi;
    /**
     * The id property
     */
    private Long id;
    /**
     * The lastUpdated property
     */
    private String lastUpdated;
    /**
     * Instantiates a new {@link Reference} and sets the default values.
     */
    public Reference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Reference}
     */
    @jakarta.annotation.Nonnull
    public static Reference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Reference();
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
     * Gets the citation property value. The citation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCitation() {
        return this.citation;
    }
    /**
     * Gets the concepts property value. The concepts property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getConcepts() {
        return this.concepts;
    }
    /**
     * Gets the doi property value. The doi property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDoi() {
        return this.doi;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("citation", (n) -> { this.setCitation(n.getStringValue()); });
        deserializerMap.put("concepts", (n) -> { this.setConcepts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("doi", (n) -> { this.setDoi(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("lastUpdated", (n) -> { this.setLastUpdated(n.getStringValue()); });
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
     * Gets the lastUpdated property value. The lastUpdated property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdated() {
        return this.lastUpdated;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("citation", this.getCitation());
        writer.writeCollectionOfPrimitiveValues("concepts", this.getConcepts());
        writer.writeStringValue("doi", this.getDoi());
        writer.writeLongValue("id", this.getId());
        writer.writeStringValue("lastUpdated", this.getLastUpdated());
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
     * Sets the citation property value. The citation property
     * @param value Value to set for the citation property.
     */
    public void setCitation(@jakarta.annotation.Nullable final String value) {
        this.citation = value;
    }
    /**
     * Sets the concepts property value. The concepts property
     * @param value Value to set for the concepts property.
     */
    public void setConcepts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.concepts = value;
    }
    /**
     * Sets the doi property value. The doi property
     * @param value Value to set for the doi property.
     */
    public void setDoi(@jakarta.annotation.Nullable final String value) {
        this.doi = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the lastUpdated property value. The lastUpdated property
     * @param value Value to set for the lastUpdated property.
     */
    public void setLastUpdated(@jakarta.annotation.Nullable final String value) {
        this.lastUpdated = value;
    }
}
