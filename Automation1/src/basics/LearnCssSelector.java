package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/DemoA.html");
		driver.findElement(By.cssSelector("a[href='http://www.instagram.com']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n2']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c2']")).click();
		
		
	}

}
