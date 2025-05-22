package org.mbari.vars.oni.sdk.r1;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.mbari.vars.oni.sdk.OniFactory;
import org.mbari.vars.oni.sdk.kiota.Oni;
import org.mbari.vars.oni.sdk.r1.models.Concept;
import org.mbari.vars.oni.sdk.r1.models.ConceptAssociationTemplate;
import org.mbari.vars.oni.sdk.r1.models.ConceptDetails;
import org.mbari.vars.oni.sdk.r1.models.PreferenceNode;
import org.mbari.vars.oni.sdk.r1.models.User;

public class OniKiotaClient implements ConceptService, UserService, PreferencesService {

    private final Oni oni;
    protected final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public OniKiotaClient(Oni oni) {
        this.oni = oni;
    }

    public OniKiotaClient(URI baseUri, String accessToken) {
        this(OniFactory.create(baseUri.toString(), accessToken));
    }

    public OniKiotaClient(URI baseUri) {
        this(OniFactory.create(baseUri.toString()));
    }

    @Override
    public CompletableFuture<Concept> findRoot() {
        return CompletableFuture.supplyAsync(() -> {
            var reponse = oni.v1()
                .concept()
                .query()
                .root()
                .get();
            return Concept.fromKiota(reponse);
        }, executor);
    }

    @Override
    public CompletableFuture<Optional<ConceptDetails>> findDetails(String name) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .concept()
                .byName(name)
                .get();
            if (response == null) {
                return Optional.empty();
            }
            return Optional.of(ConceptDetails.fromKiota(response));
        }, executor);
    }

    @Override
    public CompletableFuture<ConceptDetails> findRootDetails() {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .concept()
                .query()
                .root()
                .get();
            if (response == null) {
                return null;
            }
            return ConceptDetails.fromKiota(response);
        }, executor);
    }

    @Override
    public CompletableFuture<Optional<Concept>> findParent(String name) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .concept()
                .byName(name)
                .get();
            if (response == null) {
                return Optional.empty();
            }
            return Optional.of(Concept.fromKiota(response));
        }, executor);
    }


    @Override
    public CompletableFuture<List<String>> findAllNames() {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .concept()
                .get();
            if (response == null) {
                return List.of();
            }
            return response;
        }, executor);
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findAllTemplates() {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .links()
                .get();
            if (response == null) {
                return List.of();
            }
            return response.stream()
                .map(ConceptAssociationTemplate::fromKiota)
                .toList();
        }, executor);
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .links()
                .byName(name)
                .get();
            if (response == null) {
                return List.of();
            }
            return response.stream()
                .map(ConceptAssociationTemplate::fromKiota)
                .toList();
        }, executor);
    }

    @Override
    public CompletableFuture<List<ConceptAssociationTemplate>> findTemplates(String name, String linkname) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .links()
                .byName(name)
                .using()
                .byLinkName(linkname)
                .get();
            if (response == null) {
                return List.of();
            }
            return response.stream()
                .map(ConceptAssociationTemplate::fromKiota)
                .toList();
        }, executor);
    }

    @Override
    public CompletableFuture<Optional<Concept>> findConcept(String name) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .concept()
                .byName(name)
                .get();
            if (response == null) {
                return Optional.empty();
            }
            return Optional.of(Concept.fromKiota(response));
        }, executor);
    }

    @Override
    public CompletableFuture<List<User>> findAllUsers() {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .users()
                .get();
            if (response == null) {
                return List.of();
            }
            return response.stream()
                .map(User::fromKiota)
                .toList();
        }, executor);
    }

    @Override
    public CompletableFuture<User> create(User user) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .users()
                .post(user.toKiotaCreate());
            if (response == null) {
                return null;
            }
            return User.fromKiota(response);
        }, executor);
    }

    @Override
    public CompletableFuture<Optional<User>> update(User user) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .users()
                .byName(user.getUsername())
                .put(user.toKiotaUpdate());
            if (response == null) {
                return Optional.empty();
            }
            return Optional.of(User.fromKiota(response));
        }, executor);
    }

    @Override
    public CompletableFuture<PreferenceNode> create(PreferenceNode node) {
        return CompletableFuture.supplyAsync(() -> {
            var prefNode = oni.v1()
                .prefs()
                .post(node.toKiota());
            if (prefNode == null) {
                return null;
            }
            return PreferenceNode.fromKiota(prefNode);
        }, executor);
    }

    @Override
    public CompletableFuture<Optional<PreferenceNode>> update(PreferenceNode node) {
        return CompletableFuture.supplyAsync(() -> {
            var prefNode = oni.v1()
                .prefs()
                .put(node.toKiotaUpdate());
            if (prefNode == null) {
                return Optional.empty();
            }
            return Optional.of(PreferenceNode.fromKiota(prefNode));
        }, executor);
    }

    @Override
    public CompletableFuture<Void> delete(PreferenceNode node) {
        return CompletableFuture.runAsync(() -> {
            oni.v1()
                .prefs()
                .delete(requestConfiguration -> {
                    requestConfiguration.queryParameters.name = node.getName();
                    requestConfiguration.queryParameters.key = node.getKey();
                });
        }, executor);
    }

    @Override
    public CompletableFuture<List<PreferenceNode>> findByName(String nodeName) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .prefs()
                .get(requestConfiguration -> {
                    requestConfiguration.queryParameters.name = nodeName;
                });
            if (response == null) {
                return List.of();
            }
            return response.stream()
                .map(PreferenceNode::fromKiota)
                .toList();
        }, executor);
    }

    @Override
    public CompletableFuture<List<PreferenceNode>> findByNameLike(String prefix) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .prefs()
                .startswith()
                .get(requestConfiguration -> {
                    requestConfiguration.queryParameters.prefix = prefix;
                });
            if (response == null) {
                return List.of();
            }
            return response.stream()
                .map(PreferenceNode::fromKiota)
                .toList();
        }, executor);
    }

    @Override
    public CompletableFuture<Optional<PreferenceNode>> findByNameAndKey(String nodeName, String key) {
        return CompletableFuture.supplyAsync(() -> {
            var response = oni.v1()
                .prefs()
                .get(requestConfiguration -> {
                    requestConfiguration.queryParameters.name = nodeName;
                    requestConfiguration.queryParameters.key = key;
                });
            if (response == null) {
                return Optional.empty();
            }
            return response.stream()
                .map(PreferenceNode::fromKiota)
                .findFirst();
        }, executor);
    }


    
}
