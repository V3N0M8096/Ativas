package HandlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitTimeAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new  ChromeDriver();
		d.manage().window().maximize();
		d.get("https://online.actitime.com/ibm/login.do");
		d.findElement(By.id("username")).sendKeys("mpchethan999@gmail.com");
		d.findElement(By.name("pwd")).sendKeys("chethan12345"+Keys.ENTER);
		WebElement w= d.findElement(By.className("popup_menu_icon"));
		Thread.sleep(2000);
		Select s=new Select(w);
		Thread.sleep(2000);
		s.selectByVisibleText("About your actiTIME");
	}

}
