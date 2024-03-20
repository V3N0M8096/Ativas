package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
		d.get("https://online.actitime.com/ibm/login.do");
		d.findElement(By.id("username")).sendKeys("mpchethan999@gmail.com");
		d.findElement(By.name("pwd")).sendKeys("chethan12345"+Keys.ENTER);
		wait.until(ExpectedConditions.titleIs("actiTIME-Enter Time-Track"));
		String title=d.getTitle();
		System.out.println(title);
	}
	}



