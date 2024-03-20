package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTimeLink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://online.actitime.com/ibm/login.do");
		d.findElement(By.id("username")).sendKeys("mpchethan999@gmail.com");
		d.findElement(By.name("pwd")).sendKeys("chethan12345"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele= d.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]"));
		ele.click();
		d.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Read Service Agreement")).click();
		Thread.sleep(2000);
		 Set<String> allwid = d.getWindowHandles();Thread.sleep(2000);
		for (String wid : allwid) {
			d.switchTo().window(wid);
		}
		List<WebElement> allEle = d.findElements(By.tagName("h2"));Thread.sleep(2000);
		for (WebElement webele : allEle) {
			System.out.println(webele.getText());
		}
	}

}
