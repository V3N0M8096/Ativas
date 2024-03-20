package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyTitle1 {
	@Test
	public void demo()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		String expectedTiltle="Googly";
		String actualTitle=d.getTitle();
		Assert.assertEquals(actualTitle, expectedTiltle);
		Reporter.log("Both title are same",true);
		d.quit();
		
	}
	}


