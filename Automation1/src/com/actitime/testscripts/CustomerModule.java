package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(groups= {"regressiontest","smoketest"})
	public void createCustomer()
	{
		Reporter.log("CreateCustomer",true);
	}
	@Test(groups = "regressiontest")
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
	@Test(groups = "regressiontest")
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}

}


