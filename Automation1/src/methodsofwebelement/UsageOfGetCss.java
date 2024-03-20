package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCss {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	String size=d.findElement(By.linkText("Forgotten password?")).getCssValue("Font-size");
	System.out.println("The size of forgotten password link is:"+size);
	String color=d.findElement(By.linkText("Forgotten password?")).getCssValue("Color");
	System.out.println("The color of forgotten password link is:"+color);
	
}

}
