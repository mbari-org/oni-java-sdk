package org.mbari.vars.oni.sdk.r1;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.mbari.vars.oni.sdk.kiota.models.*;
import org.mbari.vars.oni.sdk.kiota.v1.linkrealizations.item.LinkrealizationsDeleteResponse;

public interface LinkRealizationService {

    CompletableFuture<List<ExtendedLink>> findLinkRealizationsByConceptName(String conceptId);

    CompletableFuture<List<ExtendedLink>> findLinkRealizationsByLinkName(String linkName);

    CompletableFuture<List<ExtendedLink>> findLinkRealizationsByPrototype(Link link);

    CompletableFuture<Count> countLinkRealizations();

    CompletableFuture<PageSeqExtendedLink> listAllLinkRealizations(int limit, int offset);

    CompletableFuture<ExtendedLink> createLinkRealization(LinkCreate linkCreate);

    CompletableFuture<ExtendedLink> updateLinkRealization(Long id, LinkUpdate linkUpdate);

    CompletableFuture<LinkrealizationsDeleteResponse> deleteLinkRealization(Long linkId);

    CompletableFuture<ExtendedLink> findLinkRealizationById(Long linkId);


    
}
