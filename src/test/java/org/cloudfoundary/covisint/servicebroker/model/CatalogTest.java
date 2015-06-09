package org.cloudfoundary.covisint.servicebroker.model;

import java.util.Map;

import static org.junit.Assert.assertNull;

/**
 * Class: CatalogTest.java
 * Description: Test class for CatalogTest.
 *
 *@version 1.0, 2015-06-01
 *@author Lingeshm
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
