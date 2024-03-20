package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.com");
		d.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement>allsuggs=d.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allsuggs.size();
		System.out.println(count);
		for(WebElement ele:allsuggs)
		{
			String text=ele.getText();
			System.out.println(text);
		}
		allsuggs.get(count-1).click();
	}

}
