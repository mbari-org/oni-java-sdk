package org.mbari.vars.oni.sdk.r1;

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

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.mbari.vars.oni.sdk.r1.models.Concept;
import org.mbari.vars.oni.sdk.r1.models.ConceptAssociationTemplate;
import org.mbari.vars.oni.sdk.r1.models.ConceptDetails;
import org.mbari.vars.oni.sdk.r1.models.PreferenceNode;
import org.mbari.vars.oni.sdk.r1.models.User;

public class NoopConceptService implements ConceptService, UserService, PreferencesService {

    @Override
    public CompletableFuture<PreferenceNode> create(PreferenceNode node) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`create` is not implemented"));
    }

    @Override
    public CompletableFuture<Optional<PreferenceNode>> update(PreferenceNode node) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`update` is not implemented"));
    }

    @Override
    public CompletableFuture<Void> delete(PreferenceNode node) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`delete` is not implemented"));
    }

    @Override
    public CompletableFuture<List<PreferenceNode>> findByName(String nodeName) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByName` is not implemented"));
    }

    @Override
    public CompletableFuture<List<PreferenceNode>> findByNameLike(String nodeName) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByNameLike` is not implemented"));
    }

    @Override
    public CompletableFuture<Optional<PreferenceNode>> findByNameAndKey(String nodeName, String key) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByNameAndKey` is not implemented"));
    }

    @Override
    public CompletableFuture<List<User>> findAllUsers() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAllUsers` is not implemented"));
    }

    @Override
    public CompletableFuture<User> create(User user) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`create` is not implemented"));
    }

    @Override
    public CompletableFuture<Optional<User>> update(User user) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`update` is not implemented"));
    }

    @Override
    public CompletableFuture<Concept> findRoot() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findRoot` is not implemented"));
    }

    @Override
    public CompletableFuture<Optional<ConceptDetails>> findDetails(String name) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findDetails` is not implemented"));
    }

    @Override
    public CompletableFuture<ConceptDetails> findRootDetails() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findRootDetails` is not implemented"));
    }

    @Override
    public CompletableFuture<Optional<Concept>> findParent(String name) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findParent` is not implemented"));
    }

    @Override
    public CompletableFuture<List<String>> findAllNames() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAllNames` is not implemented"));
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findAllTemplates() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAllTemplates` is not implemented"));
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findTemplates` is not implemented"));
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name, String linkname) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findTemplates` is not implemented"));
    }

    @Override
    public CompletableFuture<Optional<Concept>> findConcept(String name) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findConcept` is not implemented"));
    }

    @Override
    public CompletableFuture<Optional<User>> findByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByUsername'");
    }

    @Override
    public CompletableFuture<Optional<User>> changePassword(String user, String oldPassword, String newPassword) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changePassword'");
    }

    
}
