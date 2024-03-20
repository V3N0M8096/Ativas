package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://online.actitime.com/ibm/login.do");
		d.findElement(By.id("username")).sendKeys("mpchethan999@gmail.com");
		d.findElement(By.id("pwd")).sendKeys("chethan12345");
		d.findElement(By.xpath("//div[text()='Login]")).click();
		Thread.sleep(20000);
		d.findElement(By.id("Logoutlink")).click();
	}

}
