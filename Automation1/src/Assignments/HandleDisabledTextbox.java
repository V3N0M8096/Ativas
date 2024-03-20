package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledTextbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		d.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)d;
			Thread.sleep(2000);
		jse.executeScript("document.getElementById('name').value='sachin'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('email').value='sachin@gmail.com'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('password').value='sachin'");
		
	}}