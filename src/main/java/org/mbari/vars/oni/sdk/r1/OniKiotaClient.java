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

public class OniKiotaClient implements ConceptService{

    private final Oni oni;
    protected final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public OniKiotaClient(Oni oni) {
        this.oni = oni;
    }

    public OniKiotaClient(URI baseUri, String accessToken) {
        this(OniFactory.create(baseUri.toString(), accessToken));
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


    
}
