package org.mbari.vars.oni.sdk.r1;

import org.mbari.vars.oni.sdk.kiota.models.*;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.item.LinktemplatesDeleteResponse;

import java.util.concurrent.CompletableFuture;

public interface LinkTemplateService {

    CompletableFuture<Count> countLinkTemplates();
    CompletableFuture<PageSeqExtendedLink> listAllLinkTemplates(int limit, int offset);
    CompletableFuture<ExtendedLink> createLinkTemplate(LinkCreate linkCreate);
    CompletableFuture<ExtendedLink> updateLinkTemplate(Long id, LinkUpdate linkUpdate);
    CompletableFuture<LinktemplatesDeleteResponse> deleteLinkTemplate(Long linkId);

}
