package org.mbari.vars.oni.sdk.r1.models;

import org.mbari.vars.oni.sdk.kiota.models.PrefNode;
import org.mbari.vars.oni.sdk.kiota.models.PrefNodeUpdate;

/**
 * @author Brian Schlining
 * @since 2017-05-11T13:12:00
 */
public class PreferenceNode {

    private final String name;
    private final String key;
    private String value;

    public PreferenceNode(String name, String key, String value) {
        // Preconditions.checkNotNull(name);
        // Preconditions.checkNotNull(key);
        // Preconditions.checkNotNull(key);
        this.name = name;
        this.key = key;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        // Preconditions.checkNotNull(value);
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 5;

        hash = 61 * hash + ((this.name != null) ? this.name.hashCode() : 0);
        hash = 61 * hash + ((this.key != null) ? this.key.hashCode() : 0);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final PreferenceNode other = (PreferenceNode) obj;

        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if ((this.key == null) ? (other.key != null) : !this.key.equals(other.key)) {
            return false;
        }

        return true;
    }

    public PrefNode toKiota() {
        PrefNode node = new PrefNode();
        node.setName(name);
        node.setKey(key);
        node.setValue(value);
        return node;
    }

    public PrefNodeUpdate toKiotaUpdate() {
        PrefNodeUpdate node = new PrefNodeUpdate();
        node.setName(name);
        node.setKey(key);
        node.setValue(value);
        return node;
    }

    public static PreferenceNode fromKiota(PrefNode node) {
        return new PreferenceNode(node.getName(), node.getKey(), node.getValue());
    }


}
