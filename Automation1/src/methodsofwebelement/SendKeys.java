package methodsofwebelement;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("Ram@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("pass")).sendKeys("sita@123"+Keys.ENTER);
}
}