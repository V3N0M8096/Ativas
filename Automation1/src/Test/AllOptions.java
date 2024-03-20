package Test;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/html/HotelA.html");
		WebElement mtr=d.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> allEle=s.getOptions();
		for(int i=0;i<allEle.size();i++)
		{
			String text=allEle.get(i).getText();
			System.out.println(text);
			Thread.sleep(2000);
			s.selectByIndex(i);
			
		}
		for(int i=0;i<allEle.size();i++)
		{
			Thread.sleep(2000);
			s.deselectByIndex(i);
		}
	d.quit();	
	}

}
