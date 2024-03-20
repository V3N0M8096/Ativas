package HandlingListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetMethods {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/html/HotelA.html");
		WebElement slv=d.findElement(By.id("slv"));
		Select s=new Select(slv);
		WebElement ele=s.getFirstSelectedOption();
		System.out.println(ele.getText());
		List<WebElement> allEle=s.getAllSelectedOptions();
		for(int i=0;i<allEle.size();i++)
		{
			String text=allEle.get(i).getText();
			System.out.println(text);
		}
		
	}

}
