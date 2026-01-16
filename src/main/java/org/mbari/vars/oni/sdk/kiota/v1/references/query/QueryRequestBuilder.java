package org.mbari.vars.oni.sdk.kiota.v1.references.query;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.references.query.citation.CitationRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.references.query.doi.DoiRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/references/query
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueryRequestBuilder extends BaseRequestBuilder {
    /**
     * The citation property
     * @return a {@link CitationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CitationRequestBuilder citation() {
        return new CitationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The doi property
     * @return a {@link DoiRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DoiRequestBuilder doi() {
        return new DoiRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link QueryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/references/query", pathParameters);
    }
    /**
     * Instantiates a new {@link QueryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/references/query", rawUrl);
    }
}
