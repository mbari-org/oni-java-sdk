package org.mbari.vars.oni.sdk.kiota.v1.users.role;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.oni.sdk.kiota.v1.users.role.item.WithRoleItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/users/role
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.oni.sdk.kiota.v1.users.role.item collection
     * @param role Unique identifier of the item
     * @return a {@link WithRoleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithRoleItemRequestBuilder byRole(@jakarta.annotation.Nonnull final String role) {
        Objects.requireNonNull(role);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("role", role);
        return new WithRoleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link RoleRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RoleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/users/role", pathParameters);
    }
    /**
     * Instantiates a new {@link RoleRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RoleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/users/role", rawUrl);
    }
}
