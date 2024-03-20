package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
	WebElement ele=	d.findElement(By.linkText("Create new account"));
	String tag=ele.getTagName();
	System.out.println("The tag name of create new account button is:"+tag);
	String text=ele.getText();
	System.out.println("The tag text of create new account button is:"+text);
	String attvalue=ele.getAttribute("href");
	System.out.println("The attribute value of href in create button is:"+attvalue);
		
	}

}
