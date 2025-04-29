package org.mbari.vars.oni.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MediaCreate implements AdditionalDataHolder, Parsable {
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
     * The isPrimary property
     */
    private Boolean isPrimary;
    /**
     * The mediaType property
     */
    private String mediaType;
    /**
     * The url property
     */
    private String url;
    /**
     * Instantiates a new {@link MediaCreate} and sets the default values.
     */
    public MediaCreate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MediaCreate}
     */
    @jakarta.annotation.Nonnull
    public static MediaCreate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaCreate();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("caption", (n) -> { this.setCaption(n.getStringValue()); });
        deserializerMap.put("conceptName", (n) -> { this.setConceptName(n.getStringValue()); });
        deserializerMap.put("credit", (n) -> { this.setCredit(n.getStringValue()); });
        deserializerMap.put("isPrimary", (n) -> { this.setIsPrimary(n.getBooleanValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the mediaType property value. The mediaType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMediaType() {
        return this.mediaType;
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
        writer.writeBooleanValue("isPrimary", this.getIsPrimary());
        writer.writeStringValue("mediaType", this.getMediaType());
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
     * Sets the isPrimary property value. The isPrimary property
     * @param value Value to set for the isPrimary property.
     */
    public void setIsPrimary(@jakarta.annotation.Nullable final Boolean value) {
        this.isPrimary = value;
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final String value) {
        this.mediaType = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
