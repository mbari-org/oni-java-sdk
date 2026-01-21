package org.mbari.vars.oni.sdk.kiota.v1;

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
import org.mbari.vars.oni.sdk.kiota.v1.auth.AuthRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.concept.ConceptRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.health.HealthRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.history.HistoryRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.linkrealizations.LinkrealizationsRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.links.LinksRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.LinktemplatesRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.media.MediaRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.names.NamesRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.phylogeny.PhylogenyRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.prefs.PrefsRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.raw.RawRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.references.ReferencesRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.users.UsersRequestBuilder;
/**
 * Builds and executes requests for operations under /v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The auth property
     * @return a {@link AuthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthRequestBuilder auth() {
        return new AuthRequestBuilder(pathParameters, requestAdapter);
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
     * The health property
     * @return a {@link HealthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HealthRequestBuilder health() {
        return new HealthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The history property
     * @return a {@link HistoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HistoryRequestBuilder history() {
        return new HistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The linkrealizations property
     * @return a {@link LinkrealizationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LinkrealizationsRequestBuilder linkrealizations() {
        return new LinkrealizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The links property
     * @return a {@link LinksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LinksRequestBuilder links() {
        return new LinksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The linktemplates property
     * @return a {@link LinktemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LinktemplatesRequestBuilder linktemplates() {
        return new LinktemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The media property
     * @return a {@link MediaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MediaRequestBuilder media() {
        return new MediaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The names property
     * @return a {@link NamesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The phylogeny property
     * @return a {@link PhylogenyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhylogenyRequestBuilder phylogeny() {
        return new PhylogenyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The prefs property
     * @return a {@link PrefsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrefsRequestBuilder prefs() {
        return new PrefsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The raw property
     * @return a {@link RawRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RawRequestBuilder raw() {
        return new RawRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The references property
     * @return a {@link ReferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReferencesRequestBuilder references() {
        return new ReferencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The users property
     * @return a {@link UsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1", rawUrl);
    }
}
