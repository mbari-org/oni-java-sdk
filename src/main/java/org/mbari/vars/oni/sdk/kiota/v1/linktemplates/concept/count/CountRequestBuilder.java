package org.mbari.vars.oni.sdk.kiota.v1.linktemplates.concept.count;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.concept.count.item.WithConceptNameItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/linktemplates/concept/count
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CountRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.linktemplates.concept.count.item collection
     * @param conceptName Unique identifier of the item
     * @return a {@link WithConceptNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithConceptNameItemRequestBuilder byConceptName(@jakarta.annotation.Nonnull final String conceptName) {
        Objects.requireNonNull(conceptName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conceptName", conceptName);
        return new WithConceptNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CountRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CountRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linktemplates/concept/count", pathParameters);
    }
    /**
     * Instantiates a new {@link CountRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CountRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linktemplates/concept/count", rawUrl);
    }
}
