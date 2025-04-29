package org.mbari.vars.oni.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SerdeConcept implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The alternativeNames property
     */
    private java.util.List<String> alternativeNames;
    /**
     * The aphiaId property
     */
    private Long aphiaId;
    /**
     * The children property
     */
    private java.util.List<SerdeConcept> children;
    /**
     * The name property
     */
    private String name;
    /**
     * The rank property
     */
    private String rank;
    /**
     * Instantiates a new {@link SerdeConcept} and sets the default values.
     */
    public SerdeConcept() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SerdeConcept}
     */
    @jakarta.annotation.Nonnull
    public static SerdeConcept createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SerdeConcept();
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
     * Gets the alternativeNames property value. The alternativeNames property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlternativeNames() {
        return this.alternativeNames;
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
     * @return a {@link java.util.List<SerdeConcept>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SerdeConcept> getChildren() {
        return this.children;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("alternativeNames", (n) -> { this.setAlternativeNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("aphiaId", (n) -> { this.setAphiaId(n.getLongValue()); });
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(SerdeConcept::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("rank", (n) -> { this.setRank(n.getStringValue()); });
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
     * Gets the rank property value. The rank property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRank() {
        return this.rank;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("alternativeNames", this.getAlternativeNames());
        writer.writeLongValue("aphiaId", this.getAphiaId());
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("rank", this.getRank());
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
     * Sets the alternativeNames property value. The alternativeNames property
     * @param value Value to set for the alternativeNames property.
     */
    public void setAlternativeNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.alternativeNames = value;
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
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<SerdeConcept> value) {
        this.children = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the rank property value. The rank property
     * @param value Value to set for the rank property.
     */
    public void setRank(@jakarta.annotation.Nullable final String value) {
        this.rank = value;
    }
}
