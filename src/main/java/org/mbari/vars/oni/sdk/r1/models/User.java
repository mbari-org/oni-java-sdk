package org.mbari.vars.oni.sdk.r1.models;

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

import org.mbari.vars.oni.sdk.kiota.models.UserAccount;
import org.mbari.vars.oni.sdk.kiota.models.UserAccountCreate;
import org.mbari.vars.oni.sdk.kiota.models.UserAccountUpdate;

/**
 * @author Brian Schlining
 * @since 2017-05-11T13:37:00
 */
public class User {

    private String username;
    private String firstName;
    private String lastName;
    private String affiliation;
    private String email;
    private String password;
    private String role;


    public User(String userName, String password, String role, String firstName, String lastName, String affiliation, String email) {
        this.username = userName;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.affiliation = affiliation;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static User fromKiota(UserAccount userAccount) {
        return new User(userAccount.getUsername(),
                userAccount.getPassword(),
                userAccount.getRole(),
                userAccount.getFirstName(),
                userAccount.getLastName(),
                userAccount.getAffiliation(),
                userAccount.getEmail());
    }

    public UserAccount toKiota() {
        var userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setFirstName(firstName);
        userAccount.setLastName(lastName);
        userAccount.setAffiliation(affiliation);
        userAccount.setEmail(email);
        return userAccount;
    }

    public UserAccountCreate toKiotaCreate() {
        var userAccountCreate = new UserAccountCreate();
        userAccountCreate.setUsername(username);
        userAccountCreate.setPassword(password);
        userAccountCreate.setRole(role);
        userAccountCreate.setFirstName(firstName);
        userAccountCreate.setLastName(lastName);
        userAccountCreate.setAffiliation(affiliation);
        userAccountCreate.setEmail(email);
        return userAccountCreate;
    }

    public UserAccountUpdate toKiotaUpdate() {
        var userAccountUpdate = new UserAccountUpdate();
        // userAccountUpdate.setUsername(username);
        userAccountUpdate.setRole(role);
        userAccountUpdate.setFirstName(firstName);
        userAccountUpdate.setLastName(lastName);
        userAccountUpdate.setAffiliation(affiliation);
        userAccountUpdate.setEmail(email);
        return userAccountUpdate;
    }

}
