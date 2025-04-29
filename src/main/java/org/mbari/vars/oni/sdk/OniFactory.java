package org.mbari.vars.oni.sdk;

import java.util.Arrays;

import org.mbari.vars.oni.sdk.kiota.Oni;

import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.KiotaClientFactory;
import com.microsoft.kiota.http.OkHttpRequestAdapter;

import okhttp3.logging.HttpLoggingInterceptor;

public class OniFactory {

    private static final System.Logger log = System.getLogger(OniFactory.class.getName());

    public static Oni create(String baseUrl, String apiKey) {
        
        // Set up the authentication provider
        var tokenProvider = new OniAccessTokenProvider(baseUrl + "/v1/auth", apiKey);
        var authProvider = new BaseBearerTokenAuthenticationProvider(tokenProvider);

        // Set up the request adapter. This is where we configure the HTTP client and add logging if needed
        var interceptors = KiotaClientFactory.createDefaultInterceptors();
        if (log.isLoggable(System.Logger.Level.DEBUG)) {
            log.log(System.Logger.Level.DEBUG, "Creating new Oni instance with base URL: " + baseUrl);
            var loggingInterceptor = new HttpLoggingInterceptor(s -> log.log(System.Logger.Level.DEBUG, s));
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            loggingInterceptor.redactHeader("Authorization");
            interceptors = Arrays.copyOf(interceptors, interceptors.length + 1);
            interceptors[interceptors.length - 1] = loggingInterceptor;
        }
        var client = KiotaClientFactory.create(interceptors).build();
        var adapter = new OkHttpRequestAdapter(authProvider, null, null, client);
        adapter.setBaseUrl(baseUrl);

        // Create the Annosaurus instance
        return new Oni(adapter);
    }
    
}
