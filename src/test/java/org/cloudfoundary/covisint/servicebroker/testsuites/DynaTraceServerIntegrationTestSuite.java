package org.cloudfoundary.covisint.servicebroker.testsuites;

import org.cloudfoundary.covisint.servicebroker.controller.BindingControllerTest;
import org.cloudfoundary.covisint.servicebroker.controller.CatalogControllerTest;
import org.cloudfoundary.covisint.servicebroker.controller.ProvisioningControllerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Class: DynaTraceServerIntegrationTestSuite.java
 * Description: Suit class for DynaTraceServerIntegrationTest purpose.
 *
 *@version 1.0, 2015-06-01
 *@author Lingeshm
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BindingControllerTest.class,
	CatalogControllerTest.class,
	ProvisioningControllerTest.class,
})
public class DynaTraceServerIntegrationTestSuite {   
}