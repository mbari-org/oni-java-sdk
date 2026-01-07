package org.mbari.vars.oni.sdk.kiota.v1.linktemplates.query;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.query.forescaped.ForRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/linktemplates/query
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueryRequestBuilder extends BaseRequestBuilder {
    /**
     * The for property
     * @return a {@link ForRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ForRequestBuilder forEscaped() {
        return new ForRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link QueryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linktemplates/query", pathParameters);
    }
    /**
     * Instantiates a new {@link QueryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linktemplates/query", rawUrl);
    }
}
