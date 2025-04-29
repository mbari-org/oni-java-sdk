package org.mbari.vars.oni.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConceptMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The alternateNames property
     */
    private java.util.List<String> alternateNames;
    /**
     * The aphiaId property
     */
    private Long aphiaId;
    /**
     * The author property
     */
    private String author;
    /**
     * The id property
     */
    private Long id;
    /**
     * The linkRealizations property
     */
    private java.util.List<Link> linkRealizations;
    /**
     * The media property
     */
    private java.util.List<Media> media;
    /**
     * The name property
     */
    private String name;
    /**
     * The rank property
     */
    private String rank;
    /**
     * The rankLevel property
     */
    private String rankLevel;
    /**
     * The rankName property
     */
    private String rankName;
    /**
     * The references property
     */
    private java.util.List<Reference> references;
    /**
     * Instantiates a new {@link ConceptMetadata} and sets the default values.
     */
    public ConceptMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConceptMetadata}
     */
    @jakarta.annotation.Nonnull
    public static ConceptMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConceptMetadata();
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
     * Gets the alternateNames property value. The alternateNames property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlternateNames() {
        return this.alternateNames;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("alternateNames", (n) -> { this.setAlternateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("aphiaId", (n) -> { this.setAphiaId(n.getLongValue()); });
        deserializerMap.put("author", (n) -> { this.setAuthor(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("linkRealizations", (n) -> { this.setLinkRealizations(n.getCollectionOfObjectValues(Link::createFromDiscriminatorValue)); });
        deserializerMap.put("media", (n) -> { this.setMedia(n.getCollectionOfObjectValues(Media::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("rank", (n) -> { this.setRank(n.getStringValue()); });
        deserializerMap.put("rankLevel", (n) -> { this.setRankLevel(n.getStringValue()); });
        deserializerMap.put("rankName", (n) -> { this.setRankName(n.getStringValue()); });
        deserializerMap.put("references", (n) -> { this.setReferences(n.getCollectionOfObjectValues(Reference::createFromDiscriminatorValue)); });
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
     * Gets the linkRealizations property value. The linkRealizations property
     * @return a {@link java.util.List<Link>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Link> getLinkRealizations() {
        return this.linkRealizations;
    }
    /**
     * Gets the media property value. The media property
     * @return a {@link java.util.List<Media>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Media> getMedia() {
        return this.media;
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
     * Gets the references property value. The references property
     * @return a {@link java.util.List<Reference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Reference> getReferences() {
        return this.references;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("alternateNames", this.getAlternateNames());
        writer.writeLongValue("aphiaId", this.getAphiaId());
        writer.writeStringValue("author", this.getAuthor());
        writer.writeLongValue("id", this.getId());
        writer.writeCollectionOfObjectValues("linkRealizations", this.getLinkRealizations());
        writer.writeCollectionOfObjectValues("media", this.getMedia());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("rank", this.getRank());
        writer.writeStringValue("rankLevel", this.getRankLevel());
        writer.writeStringValue("rankName", this.getRankName());
        writer.writeCollectionOfObjectValues("references", this.getReferences());
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
     * Sets the alternateNames property value. The alternateNames property
     * @param value Value to set for the alternateNames property.
     */
    public void setAlternateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.alternateNames = value;
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the linkRealizations property value. The linkRealizations property
     * @param value Value to set for the linkRealizations property.
     */
    public void setLinkRealizations(@jakarta.annotation.Nullable final java.util.List<Link> value) {
        this.linkRealizations = value;
    }
    /**
     * Sets the media property value. The media property
     * @param value Value to set for the media property.
     */
    public void setMedia(@jakarta.annotation.Nullable final java.util.List<Media> value) {
        this.media = value;
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
    /**
     * Sets the references property value. The references property
     * @param value Value to set for the references property.
     */
    public void setReferences(@jakarta.annotation.Nullable final java.util.List<Reference> value) {
        this.references = value;
    }
}
