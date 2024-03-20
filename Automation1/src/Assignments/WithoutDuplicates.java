package Assignments;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicates {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/HotelA.html");
		WebElement mtr=d.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> allEle=s.getOptions();
		HashSet<String> ts=new HashSet<>();
		for(int i=0;i<allEle.size();i++)
		{
			String text=allEle.get(i).getText();
			ts.add(text);
		}
		for(String text:ts)
		{
			System.out.println(text);
	
		}
	d.quit();	
	}

}
