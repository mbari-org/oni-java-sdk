package org.mbari.vars.oni.sdk.r1;

import org.junit.jupiter.api.Test;
import org.mbari.vars.oni.sdk.etc.jdk.Strings;
import org.mbari.vars.oni.sdk.kiota.models.LinkCreate;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

public class LinkTemplateServiceIT {

    @Test
    void testCountLinkTemplates() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var count = client.countLinkTemplates().join();
        assertNotNull(count);
        assertTrue(count.getCount() > 0, "Expected count to be greater than 0");
    }

    @Test
    void testListAllLinkTemplates() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
        var pageSeq = client.listAllLinkTemplates(10, 0).join();
        assertNotNull(pageSeq);
        assertTrue(!pageSeq.getContent().isEmpty(), "Expected items to be greater than 0");
        assertTrue(pageSeq.getContent().size() <= 10, "Expected items to be less than or equal to 10");
    }

    @Test
    void testCreateLinkTemplate() {
        var client = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");

        var root = client.findRoot().join();
        assertNotNull(root);
        assertEquals("object", root.getName());

        var linkCreate = new LinkCreate();
        linkCreate.setConcept(root.getName());
        linkCreate.setLinkName(Strings.random(10));
        linkCreate.setToConcept("self");
        linkCreate.setLinkValue("This is a test link template. It can be deleted");

        var extendedLink = client.createLinkTemplate(linkCreate).join();
        assertNotNull(extendedLink);
        assertNotNull(extendedLink.getId(), "Expected created link template to have an ID");
        assertEquals(linkCreate.getConcept(), extendedLink.getConcept());
        assertEquals(linkCreate.getLinkValue(), extendedLink.getLinkValue());
        assertEquals(linkCreate.getToConcept(), extendedLink.getToConcept());
        assertEquals(linkCreate.getLinkName(), extendedLink.getLinkValue());

    }


}
