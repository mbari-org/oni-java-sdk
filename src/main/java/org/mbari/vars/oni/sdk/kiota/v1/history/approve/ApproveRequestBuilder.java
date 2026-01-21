package org.mbari.vars.oni.sdk.kiota.v1.history.approve;

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
import org.mbari.vars.oni.sdk.kiota.v1.history.approve.item.WithP1ItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/history/approve
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApproveRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.history.approve.item collection
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
     * Instantiates a new {@link ApproveRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApproveRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/history/approve", pathParameters);
    }
    /**
     * Instantiates a new {@link ApproveRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApproveRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/history/approve", rawUrl);
    }
}
