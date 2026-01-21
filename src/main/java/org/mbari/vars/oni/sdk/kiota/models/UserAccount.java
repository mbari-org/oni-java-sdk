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
public class UserAccount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The affiliation property
     */
    private String affiliation;
    /**
     * The email property
     */
    private String email;
    /**
     * The firstName property
     */
    private String firstName;
    /**
     * The id property
     */
    private Long id;
    /**
     * The isEncrypted property
     */
    private Boolean isEncrypted;
    /**
     * The lastName property
     */
    private String lastName;
    /**
     * The password property
     */
    private String password;
    /**
     * The role property
     */
    private String role;
    /**
     * The username property
     */
    private String username;
    /**
     * Instantiates a new {@link UserAccount} and sets the default values.
     */
    public UserAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserAccount}
     */
    @jakarta.annotation.Nonnull
    public static UserAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAccount();
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
     * Gets the affiliation property value. The affiliation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAffiliation() {
        return this.affiliation;
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("affiliation", (n) -> { this.setAffiliation(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getLongValue()); });
        deserializerMap.put("isEncrypted", (n) -> { this.setIsEncrypted(n.getBooleanValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. The firstName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
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
     * Gets the isEncrypted property value. The isEncrypted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this.isEncrypted;
    }
    /**
     * Gets the lastName property value. The lastName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the password property value. The password property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the role property value. The role property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Gets the username property value. The username property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("affiliation", this.getAffiliation());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeLongValue("id", this.getId());
        writer.writeBooleanValue("isEncrypted", this.getIsEncrypted());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("role", this.getRole());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the affiliation property value. The affiliation property
     * @param value Value to set for the affiliation property.
     */
    public void setAffiliation(@jakarta.annotation.Nullable final String value) {
        this.affiliation = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the firstName property value. The firstName property
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final Long value) {
        this.id = value;
    }
    /**
     * Sets the isEncrypted property value. The isEncrypted property
     * @param value Value to set for the isEncrypted property.
     */
    public void setIsEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.isEncrypted = value;
    }
    /**
     * Sets the lastName property value. The lastName property
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
