package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	//d.get("https://www.instagram.com/");
	boolean res=d.findElement(By.tagName("button")).isEnabled();
	if(res==true)
	{
		System.out.println("Login button is enabled");
	}
	else
	{
		System.out.println("Login button is disabled");
	}
	d.quit();
	
}
}
