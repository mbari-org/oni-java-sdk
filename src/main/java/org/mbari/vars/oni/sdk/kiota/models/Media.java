package org.mbari.vars.oni.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Media implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The caption property
     */
    private String caption;
    /**
     * The conceptName property
     */
    private String conceptName;
    /**
     * The credit property
     */
    private String credit;
    /**
     * The id property
     */
    private Long id;
    /**
     * The isPrimary property
     */
    private Boolean isPrimary;
    /**
     * The mimeType property
     */
    private String mimeType;
    /**
     * The url property
     */
    private String url;
    /**
     * Instantiates a new {@link Media} and sets the default values.
     */
    public Media() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Media}
     */
    @jakarta.annotation.Nonnull
    public static Media createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Media();
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
     * Gets the conceptName property value. The conceptName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConceptName() {
        return this.conceptName;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("caption", (n) -> { this.setCaption(n.getStringValue()); });
        deserializerMap.put("conceptName", (n) -> { this.setConceptName(n.getStringValue()); });
        deserializerMap.put("credit", (n) -> { this.setCredit(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("isPrimary", (n) -> { this.setIsPrimary(n.getBooleanValue()); });
        deserializerMap.put("mimeType", (n) -> { this.setMimeType(n.getStringValue()); });
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
     * Gets the isPrimary property value. The isPrimary property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPrimary() {
        return this.isPrimary;
    }
    /**
     * Gets the mimeType property value. The mimeType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMimeType() {
        return this.mimeType;
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
        writer.writeStringValue("conceptName", this.getConceptName());
        writer.writeStringValue("credit", this.getCredit());
        writer.writeLongValue("id", this.getId());
        writer.writeBooleanValue("isPrimary", this.getIsPrimary());
        writer.writeStringValue("mimeType", this.getMimeType());
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
     * Sets the conceptName property value. The conceptName property
     * @param value Value to set for the conceptName property.
     */
    public void setConceptName(@jakarta.annotation.Nullable final String value) {
        this.conceptName = value;
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
     * Sets the isPrimary property value. The isPrimary property
     * @param value Value to set for the isPrimary property.
     */
    public void setIsPrimary(@jakarta.annotation.Nullable final Boolean value) {
        this.isPrimary = value;
    }
    /**
     * Sets the mimeType property value. The mimeType property
     * @param value Value to set for the mimeType property.
     */
    public void setMimeType(@jakarta.annotation.Nullable final String value) {
        this.mimeType = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
