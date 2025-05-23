package org.mbari.vars.oni.sdk.r1.models;

import org.mbari.vars.oni.sdk.kiota.models.Link;

/**
 * @author Brian Schlining
 * @since 2017-05-11T15:56:00
 */
public class ConceptDescriptor {

    private String linkName;
    private String toConcept;
    private String linkValue;

    public ConceptDescriptor(String linkName, String toConcept, String linkValue) {
        this.linkName = linkName;
        this.toConcept = toConcept;
        this.linkValue = linkValue;
    }

    public String getLinkName() {
        return linkName;
    }

    public String getToConcept() {
        return toConcept;
    }

    public String getLinkValue() {
        return linkValue;
    }

    public static ConceptDescriptor fromKiota(Link kiota) {
        return new ConceptDescriptor(kiota.getLinkName(), kiota.getToConcept(), kiota.getLinkValue());
    }
}
