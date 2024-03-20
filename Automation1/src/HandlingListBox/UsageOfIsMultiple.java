package HandlingListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfIsMultiple {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//d.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/html/HotelA.html");
	//	WebElement mtr=d.findElement(By.id("mtr"));
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		WebElement day=d.findElement(By.id("day"));
		Select s=new Select(day);
		boolean res=s.isMultiple();
		if(res==false)
		{
			System.out.println("The dropdown is single  select ");
		}
		else
		{
			System.out.println("The dropdown is multi select ");
		}
		d.quit();
	}

}
