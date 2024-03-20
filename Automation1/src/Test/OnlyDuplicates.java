package Test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicates {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/html/HotelA.html");
		WebElement mtr=d.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> allEle=s.getOptions();
		TreeSet<String> ts=new TreeSet<>();
		for(int i=0;i<allEle.size();i++)
		{
			String text=allEle.get(i).getText();
			if(!ts.add(text))
			{
				System.out.println(text);
			}
		}
		
	d.quit();	
	}

}



