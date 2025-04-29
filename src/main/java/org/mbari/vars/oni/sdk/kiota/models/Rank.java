package org.mbari.vars.oni.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Rank implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The rankLevel property
     */
    private String rankLevel;
    /**
     * The rankName property
     */
    private String rankName;
    /**
     * Instantiates a new {@link Rank} and sets the default values.
     */
    public Rank() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Rank}
     */
    @jakarta.annotation.Nonnull
    public static Rank createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Rank();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("rankLevel", (n) -> { this.setRankLevel(n.getStringValue()); });
        deserializerMap.put("rankName", (n) -> { this.setRankName(n.getStringValue()); });
        return deserializerMap;
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
