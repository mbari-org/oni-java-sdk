package org.mbari.vars.oni.sdk.kiota.v1.linkrealizations.query.linkname;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.linkrealizations.query.linkname.item.WithLinkNameItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/linkrealizations/query/linkname
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LinknameRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.linkrealizations.query.linkname.item collection
     * @param linkName Unique identifier of the item
     * @return a {@link WithLinkNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLinkNameItemRequestBuilder byLinkName(@jakarta.annotation.Nonnull final String linkName) {
        Objects.requireNonNull(linkName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("linkName", linkName);
        return new WithLinkNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LinknameRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LinknameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linkrealizations/query/linkname", pathParameters);
    }
    /**
     * Instantiates a new {@link LinknameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LinknameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linkrealizations/query/linkname", rawUrl);
    }
}
