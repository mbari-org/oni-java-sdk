package org.mbari.vars.oni.sdk.r1.models;

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
