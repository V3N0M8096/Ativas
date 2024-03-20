package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://online.actitime.com/ibm/login.do");
		d.findElement(By.id("username")).sendKeys("mpchethan999@gmail.com");
		d.findElement(By.name("pwd")).sendKeys("chethan12345"+Keys.ENTER);
		for(int i=0;i<1000;i++)
		{
			try
			{
				d.findElement(By.id("logoutlink")).click();
				break;
			}
			catch (NoSuchElementException e) {
				System.out.println(i);
			}
		}
		d.quit();

}
}
