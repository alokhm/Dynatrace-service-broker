package org.cloudfoundary.covisint.servicebroker.testsuites;

import org.cloudfoundary.covisint.servicebroker.model.BindingRequestTest;
import org.cloudfoundary.covisint.servicebroker.model.BindingResponseTest;
import org.cloudfoundary.covisint.servicebroker.model.CatalogTest;
import org.cloudfoundary.covisint.servicebroker.model.CostTest;
//import org.cloudfoundary.covisint.servicebroker.model.CostTest;
import org.cloudfoundary.covisint.servicebroker.model.CredentialsTest;
import org.cloudfoundary.covisint.servicebroker.model.DashboardClientTest;
import org.cloudfoundary.covisint.servicebroker.model.PlanMetadataTest;
import org.cloudfoundary.covisint.servicebroker.model.PlanTest;
import org.cloudfoundary.covisint.servicebroker.model.ProvisioningRequestTest;
import org.cloudfoundary.covisint.servicebroker.model.ProvisioningResponseTest;
import org.cloudfoundary.covisint.servicebroker.model.ServiceMetadataTest;
import org.cloudfoundary.covisint.servicebroker.model.ServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Class: DynaTraceServerJunitTestSuite.java
 * Description: Suit class for DynaTraceServerJunitTestSuite purpose.
 *
 *@version 1.0, 2015-06-01
 *@author Lingeshm
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CredentialsTest.class,
	BindingRequestTest.class,
	BindingResponseTest.class,
	CatalogTest.class,
	CostTest.class,
	DashboardClientTest.class,
	PlanMetadataTest.class,
	PlanTest.class,
	ServiceMetadataTest.class,
	ServiceTest.class,
	ProvisioningRequestTest.class,
	ProvisioningResponseTest.class
	
})
public class DynaTraceServerJunitTestSuite {   
}