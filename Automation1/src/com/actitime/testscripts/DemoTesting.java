package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTesting {
	@Test(priority=0,invocationCount = 1)
	public static void demoB()
	{
		Assert.fail();
		//Reporter.log("Hi world");
		Reporter.log("Hi world", true);
	}
	@Test
	public static void demoC()
	{
		Reporter.log("Bye World", true);
	}
	@Test(priority=0)
	public static void demoA()
	{
		System.out.println("Hello World");
	}

}
