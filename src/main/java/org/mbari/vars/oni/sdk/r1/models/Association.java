package org.mbari.vars.oni.sdk.r1.models;

import java.time.Instant;
import java.util.*;
import java.util.function.Function;


/**
 * @author Brian Schlining
 * @since 2017-05-11T13:29:00
 */
public class Association implements Cloneable, Details {
    private UUID uuid;
    private String linkName;
    private String toConcept;
    private String linkValue;
    private String mimeType;
    private Instant lastUpdatedTime;

    public static final String VALUE_NIL = "nil";
    public static final String VALUE_SELF = "self";
    public static final Association NIL = new Association(VALUE_NIL, VALUE_NIL, VALUE_NIL);
    public static final String NAME_LOCALIZATION = "bounding box";
    public static final String MIME_TYPE_DEFAULT = "text/plain";

    public Association(String linkName, String toConcept, String linkValue, String mimeType) {
        this.linkName = linkName;
        this.toConcept = toConcept == null ? VALUE_NIL : toConcept;
        this.linkValue = linkValue == null ? VALUE_NIL : linkValue;
        this.mimeType = mimeType == null ? MIME_TYPE_DEFAULT : mimeType;
    }

    public Association(String linkName, String toConcept, String linkValue) {
        this(linkName, toConcept, linkValue, MIME_TYPE_DEFAULT);
    }

    public Association(String linkName, String toConcept, String linkValue, String mimeType, UUID uuid) {
        this(linkName, toConcept, linkValue, mimeType);
        this.uuid = uuid;
    }

    public Association(String linkName, String toConcept, String linkValue, String mimeType, UUID uuid, Instant lastUpdatedTime) {
        this(linkName, toConcept, linkValue, mimeType);
        this.uuid = uuid;
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Association(Association a) {
        uuid = a.uuid;
        linkName = a.linkName;
        toConcept = a.toConcept;
        linkValue = a.linkValue;
        mimeType = a.mimeType;
    }


    public Association(UUID uuid, Association a) {
        this.uuid = uuid;
        linkName = a.linkName;
        toConcept = a.toConcept;
        linkValue = a.linkValue;
        mimeType = a.mimeType;
    }

    /**
     * Create a standard text only Association from a generic details object
     * @param d
     * @return
     */
    public static Association fromDetails(Details d) {
        return new Association(d.getLinkName(), d.getToConcept(), d.getLinkValue());
    }

    public void resetUuid() {
        uuid = null;
    }


    public UUID getUuid() {
        return uuid;
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

    public String getMimeType() {
        return mimeType;
    }


    public Instant getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    @Override
    public String toString() {
        return linkName + " | "  + toConcept + " | " + linkValue;
    }

    public static Optional<Association> parse(String s) {
        Optional<Association> a = Optional.empty();
        try {
            List<String> ss = Arrays.stream(s.split("[|]"))
                    .map(String::trim)
                    .toList();
            if (ss.size() == 3) {
                a = Optional.of(new Association(ss.get(0), ss.get(1), ss.get(2)));
            }
        }
        catch (Exception e) {
            // Do nothing
        }
        return a;
    }


    /**
     * Function to convert an association containing an identity reference to
     * a integer. Note that this handles cases where the identity ref
     * isn't an integer as sometimes happens.
     */
    public static final Function<Association, Optional<Integer>> ASSOCATION_TO_IDENTITY_REF_NUM = (a) -> {
        try {
            return Optional.of(Integer.parseInt(a.getLinkValue()));
        }
        catch (Exception e) {
            return Optional.empty();
        }
    };

    /**
     * Comparator for identity reference associations. Typically the linkvalue
     * is an integer, but we have to handle the cases where it's not an int.
     */
    public static final Comparator<Association> IDENTITY_REF_NUM_COMPARATOR = (a, b) -> {
        Optional<Integer> as = ASSOCATION_TO_IDENTITY_REF_NUM.apply(a);
        Optional<Integer> bs = ASSOCATION_TO_IDENTITY_REF_NUM.apply(b);
        if (as.isPresent() && bs.isPresent()) {
            return as.get().compareTo(bs.get());
        }
        else {
            return a.getLinkValue().compareTo(b.getLinkValue());
        }
    };

    public static final Comparator<Association> ALPHABETICAL_COMPARATOR = Comparator.comparing(Association::toString);
}
