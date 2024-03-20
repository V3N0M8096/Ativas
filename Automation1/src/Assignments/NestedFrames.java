package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demo.automationtesting.in/Frames.html");
		d.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement frame1 =d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(frame1);
		Thread.sleep(2000);
	WebElement frame2=d.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	d.switchTo().frame(frame2);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
				
		

}
}
