package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("Tarun");Thread.sleep(2000);
		d.findElement(By.xpath("//input[@type='email']")).sendKeys("Tarun@gmail.com");Thread.sleep(2000);
		WebElement ele=d.findElement(By.xpath("//select[@required]"));
		Select s= new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		d.findElement(By.id("hiddendiv")).click();
		
		
	}

}
