package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		List<WebElement> alltext= driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone ')]"));
		int count=alltext.size();
		System.out.println(count);
		for(WebElement ele:alltext)
		{
			String text = ele.getText();
			System.out.println(text);
		}

	}

}
