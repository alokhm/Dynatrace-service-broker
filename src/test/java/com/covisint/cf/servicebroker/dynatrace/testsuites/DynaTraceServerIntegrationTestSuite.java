package com.covisint.cf.servicebroker.dynatrace.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.covisint.cf.servicebroker.dynatrace.controller.BindingControllerTest;
import com.covisint.cf.servicebroker.dynatrace.controller.CatalogControllerTest;
import com.covisint.cf.servicebroker.dynatrace.controller.ProvisioningControllerTest;

/**
 * 
 * Suit class for DynaTraceServerIntegrationTest purpose.
 *
 * @version 1.0, 2015-06-01
 * @author Lingeshm
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