package org.mbari.vars.oni.sdk.r1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.mbari.vars.oni.sdk.etc.jdk.Strings;
import org.mbari.vars.oni.sdk.r1.models.PreferenceNode;

public class OniKiotaClientIT {

    @Test
    public void testFindRoot() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var root = client.findRoot().join();
        assertNotNull(root);
        assertEquals("object", root.getName());
    }

    @Test
    public void testFindRootRO() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"));
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

    @Test
    public void testFindAllUsers() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var users = client.findAllUsers().join();
        assertNotNull(users);
        assertTrue(users.size() > 0);
    }

    @Test
    public void testCreatePreferenceNode() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var node = new PreferenceNode(Strings.random(6), Strings.random(8), Strings.random(10));
        var prefNode = client.create(node).join();
        assertNotNull(prefNode);
        assertEquals(node.getName(), prefNode.getName());
        assertEquals(node.getKey(), prefNode.getKey());
        assertEquals(node.getValue(), prefNode.getValue());

        // Test findByName 
        var byName = client.findByName(prefNode.getName()).join();
        assertNotNull(byName);
        assertTrue(byName.size() == 1);

        // Test findByNameLike
        var byNameLike = client.findByNameLike(prefNode.getName().substring(0, 5)).join();
        assertNotNull(byNameLike);
        assertTrue(byNameLike.size() > 0);

        // Test findByNameAndKey
        var byNameAndKey = client.findByNameAndKey(prefNode.getName(), prefNode.getKey()).join();
        assertNotNull(byNameAndKey);
        assertTrue(byNameAndKey.isPresent());
        var foundNode = byNameAndKey.get();
        assertEquals(prefNode.getName(), foundNode.getName());
        assertEquals(prefNode.getKey(), foundNode.getKey());
        assertEquals(prefNode.getValue(), foundNode.getValue());
    }

    @Test
    public void testUpdatePreferenceNode() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var node = new PreferenceNode(Strings.random(6), Strings.random(8), Strings.random(10));
        var prefNode = client.create(node).join();
        assertNotNull(prefNode);
        var nodeUpdate = new PreferenceNode(prefNode.getName(), prefNode.getKey(), Strings.random(10));
        var opt = client.update(nodeUpdate).join();
        assertTrue(opt.isPresent());
        var updatedNode = opt.get();
        assertNotNull(updatedNode);
        assertEquals(nodeUpdate.getName(), updatedNode.getName());
        assertEquals(nodeUpdate.getKey(), updatedNode.getKey());
        assertEquals(nodeUpdate.getValue(), updatedNode.getValue());
        var opt2 = client.findByNameAndKey(nodeUpdate.getName(), nodeUpdate.getKey()).join();
        assertTrue(opt2.isPresent());
        var updatedNode2 = opt2.get();
        assertNotNull(updatedNode2);
        assertEquals(nodeUpdate.getName(), updatedNode2.getName());
        assertEquals(nodeUpdate.getKey(), updatedNode2.getKey());
        assertEquals(nodeUpdate.getValue(), updatedNode2.getValue());
    }

    @Test
    public void testDeletePreferenceNode() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var node = new PreferenceNode(Strings.random(6), Strings.random(8), Strings.random(10));
        var prefNode = client.create(node).join();
        assertNotNull(prefNode);
        client.delete(prefNode).join();
        var opt = client.findByNameAndKey(prefNode.getName(), prefNode.getKey()).join();
        assertTrue(opt.isEmpty());
    }





}
