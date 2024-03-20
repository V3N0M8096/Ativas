package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src=d.findElement(By.id("fourth"));
		WebElement dest=d.findElement(By.id("amt7"));
		Actions a=new Actions(d);
		a.dragAndDrop(src, dest).build().perform();
		Thread.sleep(2000);
		d.quit();
		
	}

}
