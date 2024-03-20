package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.vtiger.com/contact-us/");
		WebElement resources=d.findElement(By.linkText("Resources"));
		Actions a=new Actions(d);
		a.moveToElement(resources).perform();
		d.findElement(By.linkText("Customers")).click();
		 WebElement login= d.findElement(By.linkText("Login"));
		 Actions a1=new Actions(d);
		 a1.doubleClick(login).perform();
		 String ActualText="Login - Vtiger";
		 String title = d.getTitle();
		 System.out.println(title);
		 System.out.println(ActualText);
		 
		 if(title.equalsIgnoreCase(ActualText))
		 {
			 System.out.println("login page is displayed");
		 }
		 else
		{
			 System.out.println("login page is not  displayed");
	 }
	}

}
