package org.mbari.vars.oni.sdk.kiota.v1.reference.remove.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.reference.remove.item.from.FromRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/reference/remove/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoveItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The from property
     * @return a {@link FromRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FromRequestBuilder from() {
        return new FromRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link RemoveItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RemoveItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/reference/remove/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link RemoveItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RemoveItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/reference/remove/{id}", rawUrl);
    }
}
