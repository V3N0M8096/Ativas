package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(groups = "smoketest")
	public void createProject()
	{
		Reporter.log("CreateProject",true);
	}
	@Test(groups = "regressiontest")
	public void deleteProject()
	{
		Reporter.log("deleteProject",true);
	}
	@Test(groups = "regressiontest")
	public void modifyProject()
	{
		Reporter.log("modifyProject",true);
	}


}
