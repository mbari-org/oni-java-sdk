package org.mbari.vars.oni.sdk.kiota.v1.reference.remove.item.from;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.reference.remove.item.from.item.WithConceptItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/reference/remove/{id}/from
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FromRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.reference.remove.item.from.item collection
     * @param concept Unique identifier of the item
     * @return a {@link WithConceptItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithConceptItemRequestBuilder byConcept(@jakarta.annotation.Nonnull final String concept) {
        Objects.requireNonNull(concept);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("concept", concept);
        return new WithConceptItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link FromRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FromRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/reference/remove/{id}/from", pathParameters);
    }
    /**
     * Instantiates a new {@link FromRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FromRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/reference/remove/{id}/from", rawUrl);
    }
}
