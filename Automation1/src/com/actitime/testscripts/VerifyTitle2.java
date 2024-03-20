package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle2 {
	@Test
	public void demo()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		String expectedTiltle="Googly";
		String actualTitle=d.getTitle();
		SoftAssert s=new SoftAssert();
		Assert.assertEquals(actualTitle, expectedTiltle);
		s.assertEquals(actualTitle, expectedTiltle);
		d.quit();
		s.assertAll();
	}
	
}


