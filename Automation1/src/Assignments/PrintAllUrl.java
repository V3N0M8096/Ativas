package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		driver.findElement(By.name("q")).sendKeys("Qspiders"+Keys.ENTER);
		Thread.sleep(2000);
	List<WebElement> all= driver.findElements(By.tagName("a"));
	int count=all.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement ele=all.get(i);
		String attvalue=ele.getAttribute("href");
		System.out.println(attvalue);
	}
	driver.quit();
		
				
				
	}

}
