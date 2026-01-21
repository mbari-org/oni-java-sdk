package org.mbari.vars.oni.sdk.r1.models;

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

import java.net.URI;
import java.net.URL;

/**
 * @author Brian Schlining
 * @since 2017-05-11T15:54:00
 */
public class ConceptMedia {
    private URL url;
    private String caption;
    private String credit;
    private String mimeType;
    private boolean isPrimary = false;

    public ConceptMedia(URL url, String caption, String credit, String mimeType, boolean isPrimary) {
        this.url = url;
        this.caption = caption;
        this.credit = credit;
        this.mimeType = mimeType;
        this.isPrimary = isPrimary;
    }

    public URL getUrl() {
        return url;
    }

    public String getCaption() {
        return caption;
    }

    public String getCredit() {
        return credit;
    }

    public String getMimeType() {
        return mimeType;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public static ConceptMedia fromKiota(org.mbari.vars.oni.sdk.kiota.models.Media kiota) {
        URL url = null;
        try {
            url = URI.create(kiota.getUrl()).toURL();
        } catch (Exception e) {
            // Do nothing
        }

        return new ConceptMedia(
                url,
                kiota.getCaption(),
                kiota.getCredit(),
                kiota.getMimeType(),
                kiota.getIsPrimary().booleanValue()
        );
    }

}
