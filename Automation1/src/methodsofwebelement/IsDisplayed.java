package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		boolean res=d.findElement(By.linkText("Create new account")).isDisplayed();
		if(res)
		{
			System.out.println("Create new account button is displayed");
		}
		else
		{
			System.out.println("Create new account button is not displayed");
		}
		d.quit();
	}

}
