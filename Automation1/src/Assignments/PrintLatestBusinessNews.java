package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLatestBusinessNews {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		List<WebElement> alltext=driver.findElements(By.xpath("//h2[text()='Latest Business News']/..//H3"));
		int count=alltext.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement ele=alltext.get(i);
		String text=ele.getText();
		System.out.println(text);
		}
	}

}


















