package org.mbari.vars.oni.sdk.kiota.v1.reference.add.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.reference.add.item.to.ToRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/reference/add/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The to property
     * @return a {@link ToRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ToRequestBuilder to() {
        return new ToRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AddItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/reference/add/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link AddItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/reference/add/{id}", rawUrl);
    }
}
