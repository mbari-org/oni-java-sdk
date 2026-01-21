package org.mbari.vars.oni.sdk.kiota.v1.prefs;

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
import org.mbari.vars.oni.sdk.kiota.models.PrefNode;
import org.mbari.vars.oni.sdk.kiota.models.PrefNodeUpdate;
import org.mbari.vars.oni.sdk.kiota.models.ServerError;
import org.mbari.vars.oni.sdk.kiota.models.Unauthorized;
import org.mbari.vars.oni.sdk.kiota.v1.prefs.startswith.StartswithRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/prefs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrefsRequestBuilder extends BaseRequestBuilder {
    /**
     * The startswith property
     * @return a {@link StartswithRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StartswithRequestBuilder startswith() {
        return new StartswithRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PrefsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrefsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/prefs?name={name}{&key*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PrefsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrefsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/prefs?name={name}{&key*}", rawUrl);
    }
    /**
     * Delete a prefNode
     * @return a {@link PrefsDeleteResponse}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PrefsDeleteResponse delete() {
        return delete(null);
    }
    /**
     * Delete a prefNode
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrefsDeleteResponse}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PrefsDeleteResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("401", Unauthorized::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrefsDeleteResponse::createFromDiscriminatorValue);
    }
    /**
     * Get all prefNode names matching a node name and key
     * @return a {@link java.util.List<PrefNode>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrefNode> get() {
        return get(null);
    }
    /**
     * Get all prefNode names matching a node name and key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<PrefNode>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrefNode> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, PrefNode::createFromDiscriminatorValue);
    }
    /**
     * Create a new prefNode
     * @param body The request body
     * @return a {@link PrefNode}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PrefNode post(@jakarta.annotation.Nonnull final PrefNode body) {
        return post(body, null);
    }
    /**
     * Create a new prefNode
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrefNode}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PrefNode post(@jakarta.annotation.Nonnull final PrefNode body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("401", Unauthorized::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrefNode::createFromDiscriminatorValue);
    }
    /**
     * Update a prefNode. Can be called using form body or json body. If name and key are not in the request body, they must be in the query parameters.
     * @param body The request body
     * @return a {@link PrefNode}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PrefNode put(@jakarta.annotation.Nonnull final PrefNodeUpdate body) {
        return put(body, null);
    }
    /**
     * Update a prefNode. Can be called using form body or json body. If name and key are not in the request body, they must be in the query parameters.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrefNode}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PrefNode put(@jakarta.annotation.Nonnull final PrefNodeUpdate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("401", Unauthorized::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrefNode::createFromDiscriminatorValue);
    }
    /**
     * Delete a prefNode
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a prefNode
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/v1/prefs?key={key}&name={name}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get all prefNode names matching a node name and key
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get all prefNode names matching a node name and key
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
     * Create a new prefNode
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrefNode body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new prefNode
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrefNode body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/v1/prefs", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Update a prefNode. Can be called using form body or json body. If name and key are not in the request body, they must be in the query parameters.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final PrefNodeUpdate body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a prefNode. Can be called using form body or json body. If name and key are not in the request body, they must be in the query parameters.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final PrefNodeUpdate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, "{+baseurl}/v1/prefs{?key*,name*}", pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PrefsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrefsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrefsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Delete a prefNode
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteQueryParameters implements QueryParameters {
        /**
         * Key of the prefNode
         */
        @jakarta.annotation.Nullable
        public String key;
        /**
         * Name of the prefNode
         */
        @jakarta.annotation.Nullable
        public String name;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("key", key);
            allQueryParams.put("name", name);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public DeleteQueryParameters queryParameters = new DeleteQueryParameters();
    }
    /**
     * Get all prefNode names matching a node name and key
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Key of the prefNode
         */
        @jakarta.annotation.Nullable
        public String key;
        /**
         * Name of the prefNode
         */
        @jakarta.annotation.Nullable
        public String name;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("key", key);
            allQueryParams.put("name", name);
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
    /**
     * Update a prefNode. Can be called using form body or json body. If name and key are not in the request body, they must be in the query parameters.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutQueryParameters implements QueryParameters {
        /**
         * Key of the prefNode. If not already in the request body
         */
        @jakarta.annotation.Nullable
        public String key;
        /**
         * Name of the prefNode. If not already in the request body
         */
        @jakarta.annotation.Nullable
        public String name;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("key", key);
            allQueryParams.put("name", name);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PutQueryParameters queryParameters = new PutQueryParameters();
    }
}
