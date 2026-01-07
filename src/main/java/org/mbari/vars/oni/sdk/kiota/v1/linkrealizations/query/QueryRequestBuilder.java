package org.mbari.vars.oni.sdk.kiota.v1.linkrealizations.query;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.linkrealizations.query.linkname.LinknameRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/linkrealizations/query
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueryRequestBuilder extends BaseRequestBuilder {
    /**
     * The linkname property
     * @return a {@link LinknameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LinknameRequestBuilder linkname() {
        return new LinknameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link QueryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linkrealizations/query", pathParameters);
    }
    /**
     * Instantiates a new {@link QueryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linkrealizations/query", rawUrl);
    }
}
