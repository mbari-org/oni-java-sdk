package org.mbari.vars.oni.sdk.kiota.v1.references;

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
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.models.BadRequest;
import org.mbari.vars.oni.sdk.kiota.models.NotFound;
import org.mbari.vars.oni.sdk.kiota.models.PageSeqReference;
import org.mbari.vars.oni.sdk.kiota.models.Reference;
import org.mbari.vars.oni.sdk.kiota.models.ServerError;
import org.mbari.vars.oni.sdk.kiota.models.Unauthorized;
import org.mbari.vars.oni.sdk.kiota.v1.references.add.AddRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.references.item.ReferencesItemRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.references.query.QueryRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.references.remove.RemoveRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/references
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReferencesRequestBuilder extends BaseRequestBuilder {
    /**
     * The add property
     * @return a {@link AddRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddRequestBuilder add() {
        return new AddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The query property
     * @return a {@link QueryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public QueryRequestBuilder query() {
        return new QueryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The remove property
     * @return a {@link RemoveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveRequestBuilder remove() {
        return new RemoveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.references.item collection
     * @param id Unique identifier of the item
     * @return a {@link ReferencesItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReferencesItemRequestBuilder byId(@jakarta.annotation.Nonnull final Long id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new ReferencesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ReferencesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReferencesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/references{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ReferencesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReferencesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/references{?limit*,offset*}", rawUrl);
    }
    /**
     * Find all references
     * @return a {@link PageSeqReference}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PageSeqReference get() {
        return get(null);
    }
    /**
     * Find all references
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PageSeqReference}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PageSeqReference get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PageSeqReference::createFromDiscriminatorValue);
    }
    /**
     * Create a new reference
     * @param body The request body
     * @return a {@link Reference}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Reference post(@jakarta.annotation.Nonnull final Reference body) {
        return post(body, null);
    }
    /**
     * Create a new reference
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Reference}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Reference post(@jakarta.annotation.Nonnull final Reference body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("401", Unauthorized::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Reference::createFromDiscriminatorValue);
    }
    /**
     * Find all references
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Find all references
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new reference
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Reference body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new reference
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Reference body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReferencesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReferencesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Find all references
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Limit for paging
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Offset for paging
         */
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
