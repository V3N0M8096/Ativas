package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfQuit {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://secure.indeed.com/");
		d.findElement(By.id("login-google-button")).click();
		d.quit();
				
	}

}
