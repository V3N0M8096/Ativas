package HandlingListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/html/HotelA.html");
		WebElement mtr=d.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		s.selectByIndex(0);Thread.sleep(1000);
		s.selectByValue("d");Thread.sleep(1000);
		s.selectByVisibleText("Ricebath");Thread.sleep(1000);
		s.deselectByVisibleText("Idly");Thread.sleep(1000);
		s.deselectByIndex(1);Thread.sleep(1000);
		s.deselectByValue("r");Thread.sleep(1000);
		s.deselectAll();
	}

}
