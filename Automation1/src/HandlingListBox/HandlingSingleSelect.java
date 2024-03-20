package HandlingListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		WebElement day=d.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("31");
		Thread.sleep(2000);
		s.selectByVisibleText("7");
	}

}
