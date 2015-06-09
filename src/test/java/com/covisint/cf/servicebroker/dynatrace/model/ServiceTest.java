package com.covisint.cf.servicebroker.dynatrace.model;

import java.io.IOException;
import java.net.URI;
import java.util.Map;
import java.util.UUID;

import com.covisint.cf.servicebroker.dynatrace.model.DashboardClient;
import com.covisint.cf.servicebroker.dynatrace.model.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * 
 * Test class for ServiceTest.
 *
 * @version 1.0, 2015-06-01
 * @author Lingeshm
 *
 */

public final class ServiceTest extends AbstractSerializationTest<Service> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals(getId().toString(), m.get("id"));
        assertEquals("test-name", m.get("name"));
        assertEquals("test-description", m.get("description"));
        assertTrue((Boolean) m.get("bindable"));
        assertNull(m.get("tags"));
        assertNull(m.get("metadata"));
        assertNull(m.get("requires"));
        assertNull(m.get("plans"));
        assertEquals(roundTrip(getDashboardClient()), m.get("dashboard_client"));
    }

    @Override
    protected Service getInstance() {
        // @formatter:off
        return new Service(null)
                .id(getId())
                .name("test-name")
                .description("test-description")
                .bindable(true)
                .dashboardClient()
                    .id("test-id")
                    .secret("test-secret")
                    .redirectUri(URI.create("http://test.redirect.uri"))
                    .and();
        // @formatter:on
    }

    public UUID getId() {
        return UUID.nameUUIDFromBytes(new byte[0]);
    }

    public DashboardClient getDashboardClient() {
        return new DashboardClient(null)
                .id("test-id")
                .secret("test-secret")
                .redirectUri(URI.create("http://test.redirect.uri"));
    }

}
