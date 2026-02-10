package org.mbari.vars.oni.sdk.r1;

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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.mbari.vars.oni.etc.Strings;
import org.mbari.vars.oni.sdk.r1.models.PreferenceNode;

public class CachedConceptServiceIT {
    OniKiotaClient baseClient = new OniKiotaClient(URI.create("https://gehenna.shore.mbari.org/kb"), "foo");
    ConceptService client = new CachedConceptService(baseClient);

        @Test
    public void testFindRoot() {
        var root = client.findRoot().join();
        assertNotNull(root);
        assertEquals("object", root.getName());
    }

    @Test
    public void testFindRootRO() {
        var root = client.findRoot().join();
        assertNotNull(root);
        assertEquals("object", root.getName());
    }


    @Test
    public void testFindRootDetails() {
        var root = client.findRootDetails().join();
        assertNotNull(root);
        assertEquals("object", root.getName());
    }

    @Test
    public void testFindDetails() {
        var details = client.findDetails("Nanomia bijuga").join();
        assertNotNull(details);
        assertEquals("Nanomia bijuga", details.get().getName());
        assertTrue(details.get().getMedia().size() > 0);
        assertTrue(details.get().getDescriptors().size() > 0);

    }

    @Test
    public void testFindParent() {
        var opt = client.findParent("Nanomia").join();
        assertNotNull(opt);
        assertTrue(opt.isPresent());
        var parent = opt.get();
        assertEquals("Agalmatidae", parent.getName());
    }

    @Test
    public void testFindAllNames() {
        var names = client.findAllNames().join();
        assertNotNull(names);
        assertTrue(names.size() > 0);
    }

    @Test
    public void testFindAllTemplates() {
        var templates = client.findAllTemplates().join();
        assertNotNull(templates);
        assertTrue(templates.size() > 0);
    }

    @Test
    public void testFindTemplates() {

        var templates = client.findTemplates("Nanomia").join();
        assertNotNull(templates);
        assertTrue(templates.size() > 0);
    }

    @Test
    public void testFindTemplatesByLinkName() {
        var templates = client.findTemplates("Nanomia", "eating").join();
        assertNotNull(templates);
        assertTrue(templates.size() > 0);
    }

    @Test
    public void testFindConcept() {
        var opt = client.findConcept("Pandalus platyceros").join();
        assertNotNull(opt);
        assertTrue(opt.isPresent());
        var concept = opt.get();
        assertEquals("Pandalus platyceros", concept.getName());
    }

   
    @Test
    public void testPhylogenyDown() {
        var opt = client.findPhylogenyDown("Nanomia").join();
        assertTrue(opt.isPresent());
        var concept = opt.get();
        assertEquals("Nanomia", concept.getName());
        assertTrue(concept.getChildren().size() > 0);
        var child = concept.getChildren().get(0);
        assertEquals("Nanomia bijuga", child.getName());

    }
    
}
