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


/**
 * @author Brian Schlining
 * @since 2017-05-11T16:55:00
 */
public class ConceptAssociationTemplate implements Details {
    private String linkName;
    private String toConcept;
    private String linkValue;

    public static final ConceptAssociationTemplate NIL = new ConceptAssociationTemplate(Association.VALUE_NIL,
            Association.VALUE_NIL, Association.VALUE_NIL);

    public ConceptAssociationTemplate(String linkName, String toConcept,  String linkValue) {
        this.linkName = linkName;
        this.toConcept = toConcept;
        this.linkValue = linkValue;
    }

    public ConceptAssociationTemplate(Details details) {
        this(details.getLinkName(), details.getToConcept(), details.getLinkValue());
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

    @Override
    public String toString() {
        String s = linkName + " | "  + toConcept + " | " + linkValue;
        if (s.length() > 80) {
            s = s.substring(0, 80) + "...";
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConceptAssociationTemplate that = (ConceptAssociationTemplate) o;

        if (!linkName.equals(that.linkName)) return false;
        if (!toConcept.equals(that.toConcept)) return false;
        return linkValue.equals(that.linkValue);
    }

    @Override
    public int hashCode() {
        int result = linkName.hashCode();
        result = 31 * result + toConcept.hashCode();
        result = 31 * result + linkValue.hashCode();
        return result;
    }


    public static ConceptAssociationTemplate fromKiota(
            org.mbari.vars.oni.sdk.kiota.models.Link kiota) {
        return new ConceptAssociationTemplate(kiota.getLinkName(), kiota.getToConcept(), kiota.getLinkValue());
    }

    


}
