package org.mbari.vars.oni.sdk.kiota.v1.linktemplates.toconcept;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.toconcept.count.CountRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.toconcept.item.WithToConceptItemRequestBuilder;
import org.mbari.vars.oni.sdk.kiota.v1.linktemplates.toconcept.rename.RenameRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/linktemplates/toconcept
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ToconceptRequestBuilder extends BaseRequestBuilder {
    /**
     * The count property
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The rename property
     * @return a {@link RenameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RenameRequestBuilder rename() {
        return new RenameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.linktemplates.toconcept.item collection
     * @param toConcept Unique identifier of the item
     * @return a {@link WithToConceptItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithToConceptItemRequestBuilder byToConcept(@jakarta.annotation.Nonnull final String toConcept) {
        Objects.requireNonNull(toConcept);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("toConcept", toConcept);
        return new WithToConceptItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ToconceptRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ToconceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linktemplates/toconcept", pathParameters);
    }
    /**
     * Instantiates a new {@link ToconceptRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ToconceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/linktemplates/toconcept", rawUrl);
    }
}
