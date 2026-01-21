package org.mbari.vars.oni.sdk.kiota.v1.phylogeny;

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
import org.mbari.vars.oni.sdk.kiota.v1.phylogeny.basic.BasicRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.phylogeny.down.DownRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.phylogeny.siblings.SiblingsRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.phylogeny.taxa.TaxaRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.phylogeny.up.UpRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/phylogeny
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhylogenyRequestBuilder extends BaseRequestBuilder {
    /**
     * The basic property
     * @return a {@link BasicRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BasicRequestBuilder basic() {
        return new BasicRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The down property
     * @return a {@link DownRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DownRequestBuilder down() {
        return new DownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The siblings property
     * @return a {@link SiblingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SiblingsRequestBuilder siblings() {
        return new SiblingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The taxa property
     * @return a {@link TaxaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaxaRequestBuilder taxa() {
        return new TaxaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The up property
     * @return a {@link UpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpRequestBuilder up() {
        return new UpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PhylogenyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PhylogenyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/phylogeny", pathParameters);
    }
    /**
     * Instantiates a new {@link PhylogenyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PhylogenyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/phylogeny", rawUrl);
    }
}
