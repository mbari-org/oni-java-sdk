package org.mbari.vars.oni.sdk;

/*-
 * #%L
 * org.mbari.vars:oni-java-sdk
 * %%
 * Copyright (C) 2025 - 2026 Monterey Bay Aquarium Research Institute
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.microsoft.kiota.authentication.AccessTokenProvider;
import com.microsoft.kiota.authentication.AllowedHostsValidator;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;

import java.net.URI;
import java.time.Instant;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import org.mbari.vars.oni.sdk.kiota.models.AuthorizationSC;

public class OniAccessTokenProvider implements AccessTokenProvider {

    // https://github.com/microsoft/kiota-java/blob/main/components/abstractions/src/main/java/com/microsoft/kiota/authentication/BaseBearerTokenAuthenticationProvider.java
    // https://github.com/microsoft/kiota-java/blob/main/components/abstractions/src/main/java/com/microsoft/kiota/authentication/AccessTokenProvider.java#L10


    private static final System.Logger log = System.getLogger(OniAccessTokenProvider.class.getName());
    private final AllowedHostsValidator hostValidator;
    private final URI authUrl;
    private final String apiKey;
    private String token;
    private DecodedJWT jwt;
    private static final JsonParseNodeFactory jsonParseNodeFactory = new JsonParseNodeFactory();

    public OniAccessTokenProvider(String authUrl, String apiKey) {
        this.authUrl = URI.create(authUrl);
        var allowedHosts = Set.of(baseUrltoAllowedHost(authUrl));
        this.hostValidator = new AllowedHostsValidator();
        this.hostValidator.setAllowedHosts(allowedHosts);
        this.apiKey = apiKey;
    }

    public static String baseUrltoAllowedHost(String baseUrl) {
        // Regular expression to extract hostname
        String regex = "^(?://[^:]+://)?([^/?]+)";
        Pattern pattern = Pattern.compile(regex);

        // Match the URL against the pattern
        Matcher matcher = pattern.matcher(baseUrl);

        if (matcher.find()) {
            return matcher.group(1);
        } else {
            throw new RuntimeException("Invalid URL: " + baseUrl);
        }
    }

    public String doTokenRequest(URI uri) throws Exception {
        var loggingInterceptor = new HttpLoggingInterceptor(s -> log.log(System.Logger.Level.DEBUG, s));
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        var client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        var request = new Request.Builder()
                .post(RequestBody.create(new byte[0]))
                .url(uri.toURL())
                .addHeader("Authorization", "APIKEY " + apiKey)
                .build();
        log.log(System.Logger.Level.DEBUG, "Requesting token from " + uri);
        try (var response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                // https://github.com/microsoft/kiota-java/blob/main/components/serialization/json/src/test/java/com/microsoft/kiota/serialization/JsonParseNodeTests.java
                var body = response.body().byteStream();
                var parseNode = jsonParseNodeFactory.getParseNode("application/json", body);
                var entity = parseNode.getObjectValue(AuthorizationSC::createFromDiscriminatorValue);
                return entity.getAccessToken();
            }
        }
        return null;
    }

    public String authorize() {
        if (jwt == null || isExpired(jwt)) {
            try {
                token = doTokenRequest(authUrl);
                jwt = JWT.decode(token);
            } catch (Exception e) {
                log.log(System.Logger.Level.ERROR, "Failed to authorize", e);
                return "";
            }
        }
        return token;
    }

    private boolean isExpired(DecodedJWT jwt) {
        try {
            Instant iat = jwt.getExpiresAt().toInstant();
            return iat.isBefore(Instant.now());
        }
        catch (Exception e) {
            return true;
        }
    }


    @NotNull
    @Override
    public String getAuthorizationToken(@NotNull URI uri, @Nullable Map<String, Object> additionalAuthenticationContext) {
        return authorize();
    }

    @NotNull
    @Override
    public AllowedHostsValidator getAllowedHostsValidator() {
        return hostValidator;
    }
}

