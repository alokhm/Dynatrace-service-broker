package com.covisint.cf.servicebroker.dynatrace.testsuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.covisint.cf.servicebroker.dynatrace.model.BindingRequestTest;
import com.covisint.cf.servicebroker.dynatrace.model.BindingResponseTest;
import com.covisint.cf.servicebroker.dynatrace.model.CatalogTest;
import com.covisint.cf.servicebroker.dynatrace.model.CostTest;
import com.covisint.cf.servicebroker.dynatrace.model.CredentialsTest;
import com.covisint.cf.servicebroker.dynatrace.model.DashboardClientTest;
import com.covisint.cf.servicebroker.dynatrace.model.PlanMetadataTest;
import com.covisint.cf.servicebroker.dynatrace.model.PlanTest;
import com.covisint.cf.servicebroker.dynatrace.model.ProvisioningRequestTest;
import com.covisint.cf.servicebroker.dynatrace.model.ProvisioningResponseTest;
import com.covisint.cf.servicebroker.dynatrace.model.ServiceMetadataTest;
import com.covisint.cf.servicebroker.dynatrace.model.ServiceTest;

/**
 * 
 * Suit class for DynaTraceServerJunitTestSuite purpose.
 *
 * @version 1.0, 2015-06-01
 * @author Lingeshm
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