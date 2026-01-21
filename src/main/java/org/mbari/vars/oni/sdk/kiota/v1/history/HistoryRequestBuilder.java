package org.mbari.vars.oni.sdk.kiota.v1.history;

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

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.history.approve.ApproveRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.history.approved.ApprovedRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.history.concept.ConceptRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.history.item.WithP1ItemRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.history.pending.PendingRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.history.reject.RejectRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/history
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HistoryRequestBuilder extends BaseRequestBuilder {
    /**
     * The approve property
     * @return a {@link ApproveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApproveRequestBuilder approve() {
        return new ApproveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The approved property
     * @return a {@link ApprovedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApprovedRequestBuilder approved() {
        return new ApprovedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The concept property
     * @return a {@link ConceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConceptRequestBuilder concept() {
        return new ConceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The pending property
     * @return a {@link PendingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PendingRequestBuilder pending() {
        return new PendingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The reject property
     * @return a {@link RejectRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RejectRequestBuilder reject() {
        return new RejectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.history.item collection
     * @param p1 Unique identifier of the item
     * @return a {@link WithP1ItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithP1ItemRequestBuilder byP1(@jakarta.annotation.Nonnull final Long p1) {
        Objects.requireNonNull(p1);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("p1", p1);
        return new WithP1ItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link HistoryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HistoryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/history", pathParameters);
    }
    /**
     * Instantiates a new {@link HistoryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HistoryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/history", rawUrl);
    }
}
