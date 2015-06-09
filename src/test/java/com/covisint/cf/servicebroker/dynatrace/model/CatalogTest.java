package com.covisint.cf.servicebroker.dynatrace.model;

import java.util.Map;

import com.covisint.cf.servicebroker.dynatrace.model.Catalog;

import static org.junit.Assert.assertNull;

/**
 * Test class for CatalogTest.
 *
 * @version 1.0, 2015-06-01
 * @author Lingeshm
 *
 */
public final class CatalogTest extends AbstractSerializationTest<Catalog> {

    @Override
    protected void assertContents(Map m) {
        assertNull(m.get("services"));
    }

    @Override
    protected Catalog getInstance() {
        return new Catalog();
    }

}
