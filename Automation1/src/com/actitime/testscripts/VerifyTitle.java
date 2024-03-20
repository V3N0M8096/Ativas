package com.actitime.testscripts;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyTitle {
@Test
public void demo()
{
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com/");
	String expectedTiltle="Google";
	String actualTitle=d.getTitle();
	if(expectedTiltle.equals(actualTitle))
	{
		Reporter.log("Pass: both title are same",true);
	}
	else
	{
		Reporter.log("Fail: both title are not same",true);
	}
	d.quit();
	
}
}
