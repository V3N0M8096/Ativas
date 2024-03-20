package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();Thread.sleep(1000);
		int y1=d.findElement(By.xpath("//label[text()='Female']/../input")).getLocation().getY();
		int y2=d.findElement(By.xpath("//label[text()='Male']/../input")).getLocation().getY();
		int y3=d.findElement(By.xpath("//label[text()='Custom']/../input")).getLocation().getY();
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		if(y1==y2&&y2==y3)
		{
			System.out.println("All the 3 radio buttons are alligned properly");
		}
		else
		{
			System.out.println("All the 3 radio buttons are not  alligned properly");
		}
		
		d.quit();
	}

}
