package org.mbari.vars.oni.sdk.r1.models;

import java.util.*;
import java.util.stream.Collectors;

import org.mbari.vars.oni.sdk.kiota.models.ConceptMetadata;
import org.mbari.vars.oni.sdk.kiota.models.SerdeConcept;

/**
 * @author Brian Schlining
 * @since 2017-05-11T15:51:00
 */
public class Concept {
    private String name;
    private String rank;
    private List<String> alternativeNames;
    private List<Concept> children;
    private ConceptDetails conceptDetails;

    public Concept(String name, String rank, List<String> alternativeNames, List<Concept> children) {
        this.name = name;
        this.rank = rank;
        this.alternativeNames = Collections.unmodifiableList(alternativeNames.stream()
            .sorted(String.CASE_INSENSITIVE_ORDER)
            .collect(Collectors.toList()));

        this.children = Collections.unmodifiableList(children.stream()
                    .sorted((a, b) -> a.getName().compareToIgnoreCase(b.getName()))
                    .collect(Collectors.toList()));
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public List<String> getAlternativeNames() {
        Set<String> alternateNames = new HashSet<>();
        if (alternativeNames != null) {
            alternateNames.addAll(alternativeNames);
        }
        if (getConceptDetails() != null) {
            alternateNames.addAll(getConceptDetails().getAlternateNames());
        }
        return new ArrayList<>(alternateNames);
//        return  alternativeNames;
    }

    public List<Concept> getChildren() {
        if (children == null) {
            children = Collections.emptyList();
        }
        return children;
    }

    public void clearChildren() {
        children = Collections.emptyList();
    }

    public ConceptDetails getConceptDetails() {
        return conceptDetails;
    }

    public void setConceptDetails(ConceptDetails conceptDetails) {
        this.conceptDetails = conceptDetails;
    }

    /**
     * @return An alphabetical listing of all descendants of this concept
     */
    public List<String> flatten() {
        return flatten(this);
    }

    private static List<String> flatten(Concept concept) {
        List<String> accum = new ArrayList<>();
        flatten(concept, accum);
        accum.sort(String::compareToIgnoreCase);
        return accum;
    }

    private static void flatten(Concept concept, List<String> accum) {
        accum.add(concept.getName());
        accum.addAll(concept.getAlternativeNames());
        concept.getChildren()
                .forEach(c -> flatten(c, accum));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Concept concept = (Concept) o;

        return name.equals(concept.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static Concept fromKiota(org.mbari.vars.oni.sdk.kiota.models.SerdeConcept kiotaConcept) {
        List<Concept> children = kiotaConcept.getChildren()
                .stream()
                .map(Concept::fromKiota)
                .collect(Collectors.toList());

        return new Concept(kiotaConcept.getName(),
                kiotaConcept.getRank(),
                kiotaConcept.getAlternativeNames(),
                children);
    }

    public static Concept fromKiota(ConceptMetadata kiota) {

        return new Concept(kiota.getName(),
                kiota.getRank(),
                kiota.getAlternateNames(),
                List.of());
    }

    public SerdeConcept toKiota() {
        List<SerdeConcept> kiotaChildren = children.stream()
                .map(Concept::toKiota)
                .collect(Collectors.toList());
        var kiota = new SerdeConcept();
        kiota.setName(name);
        kiota.setRank(rank);
        kiota.setAlternativeNames(alternativeNames);
        kiota.setChildren(kiotaChildren);

        return kiota;
    }
}
