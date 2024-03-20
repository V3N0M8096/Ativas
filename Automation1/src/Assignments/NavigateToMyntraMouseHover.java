package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateToMyntraMouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		List<WebElement>links=d.findElements(By.className("desktop-navContent"));
		Thread.sleep(5000);
		Actions a=new Actions(d);
	for(WebElement we:links)
	{
		a.moveToElement(we).perform();
		Thread.sleep(2000);
	}
	d.quit();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		