package org.mbari.vars.oni.sdk.r1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;

import org.junit.jupiter.api.Test;

public class OniKiotaClientIT {

    @Test
    public void testFindRoot() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var root = client.findRoot().join();
        assertNotNull(root);
        assertEquals("object", root.getName());
    }

    @Test
    public void testFindRootDetails() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var root = client.findRootDetails().join();
        assertNotNull(root);
        assertEquals("object", root.getName());
    }

    @Test
    public void testFindDetails() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var details = client.findDetails("Nanomia").join();
        assertNotNull(details);
        assertEquals("Nanomia", details.get().getName());
    }

    @Test
    public void testFindParent() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var opt = client.findParent("Nanomia").join();
        assertNotNull(opt);
        assertTrue(opt.isPresent());
        var parent = opt.get();
        assertEquals("Nanomia", parent.getName());
    }

    @Test
    public void testFindAllNames() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var names = client.findAllNames().join();
        assertNotNull(names);
        assertTrue(names.size() > 0);
    }

    @Test
    public void testFindAllTemplates() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var templates = client.findAllTemplates().join();
        assertNotNull(templates);
        assertTrue(templates.size() > 0);
    }

    @Test
    public void testFindTemplates() {

        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var templates = client.findTemplates("Nanomia").join();
        assertNotNull(templates);
        assertTrue(templates.size() > 0);
    }

    @Test
    public void testFindTemplatesByLinkName() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var templates = client.findTemplates("Nanomia", "eating").join();
        assertNotNull(templates);
        assertTrue(templates.size() > 0);
    }

    @Test
    public void testFindConcept() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var opt = client.findConcept("Pandalus platyceros").join();
        assertNotNull(opt);
        assertTrue(opt.isPresent());
        var concept = opt.get();
        assertEquals("Pandalus platyceros", concept.getName());
    }




}
