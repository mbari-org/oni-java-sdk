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
