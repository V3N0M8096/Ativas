package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		//d.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/html/DemoA.html");
		List<WebElement>alllinks=d.findElements(By.tagName("a"));
		System.out.println(alllinks);
		int count=alllinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement ele=alllinks.get(i);
			String text=ele.getText();
			System.out.println(text);
		}
		d.quit();
		
	}

}
