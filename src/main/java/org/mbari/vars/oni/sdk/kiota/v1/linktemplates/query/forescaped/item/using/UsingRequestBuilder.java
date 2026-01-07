package org.mbari.vars.oni.sdk.kiota.v1.linktemplates.query.forescaped.item.using;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.query.forescaped.item.using.item.WithLinkNameItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/linktemplates/query/for/{conceptName}/using
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsingRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.linktemplates.query.for.item.using.item collection
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
     * Instantiates a new {@link UsingRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linktemplates/query/for/{conceptName}/using", pathParameters);
    }
    /**
     * Instantiates a new {@link UsingRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linktemplates/query/for/{conceptName}/using", rawUrl);
    }
}
