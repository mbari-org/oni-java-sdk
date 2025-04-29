package org.mbari.vars.oni.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConceptNameCreate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The author property
     */
    private String author;
    /**
     * The name property
     */
    private String name;
    /**
     * The nameType property
     */
    private String nameType;
    /**
     * The newName property
     */
    private String newName;
    /**
     * Instantiates a new {@link ConceptNameCreate} and sets the default values.
     */
    public ConceptNameCreate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConceptNameCreate}
     */
    @jakarta.annotation.Nonnull
    public static ConceptNameCreate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConceptNameCreate();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("author", (n) -> { this.setAuthor(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("nameType", (n) -> { this.setNameType(n.getStringValue()); });
        deserializerMap.put("newName", (n) -> { this.setNewName(n.getStringValue()); });
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
     * Gets the nameType property value. The nameType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameType() {
        return this.nameType;
    }
    /**
     * Gets the newName property value. The newName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewName() {
        return this.newName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("author", this.getAuthor());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("nameType", this.getNameType());
        writer.writeStringValue("newName", this.getNewName());
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
     * Sets the nameType property value. The nameType property
     * @param value Value to set for the nameType property.
     */
    public void setNameType(@jakarta.annotation.Nullable final String value) {
        this.nameType = value;
    }
    /**
     * Sets the newName property value. The newName property
     * @param value Value to set for the newName property.
     */
    public void setNewName(@jakarta.annotation.Nullable final String value) {
        this.newName = value;
    }
}
