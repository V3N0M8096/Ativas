package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");Thread.sleep(1000);
		d.findElement(By.id("policynumber")).sendKeys("123");Thread.sleep(1000);
		d.findElement(By.id("dob")).click();Thread.sleep(1000);
		WebElement month=d.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s=new Select(month);
		s.selectByValue("10");
		Thread.sleep(2000);
		WebElement year=d.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select s1=new Select(year);
		s1.selectByVisibleText("1988");
		Thread.sleep(2000);
		d.findElement(By.linkText("5")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9845098450");
		d.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(2000);
		boolean res=d.findElement(By.id("policynumberError")).isDisplayed();
		if(res==true)
		{
			System.out.println("Error message is displayed");
		}
		else
		{
			System.out.println("Error message is not displayed");
		}
		
	}

}
