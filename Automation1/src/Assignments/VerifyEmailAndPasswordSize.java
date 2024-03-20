package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEmailAndPasswordSize {
	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.facebook.com/");
		WebElement ele=w.findElement(By.id("email"));
		WebElement ele1=w.findElement(By.id("passContainer"));
		Dimension d=ele.getSize();
		int height=d.getHeight();
		int width=d.getWidth();
		System.out.println(" The height of email is:"+height);
		System.out.println(" The width of email is:"+width);
		Dimension d1=ele1.getSize();
		int height1=d1.getHeight();
		int width1=d1.getWidth();
		System.out.println(" The height of password is:"+height1);
		System.out.println(" The width of password is:"+width1);
		String s=height==height1&&width==width1?"The height and width of email and password are same":"The height and width of email and password are not same";
		System.out.println(s);
		w.quit();
		
		
	}

}
