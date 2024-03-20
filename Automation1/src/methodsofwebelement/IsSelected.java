package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement btn=d.findElement(By.xpath("//label[text()='Male']/../input"));
		btn.click();
		Thread.sleep(2000);
		boolean res=btn.isSelected();
		if(!res)
		{
			System.out.println("Radio button is not selected");
		}
		else
		{
			System.out.println("Radio button is  selected");
		}
		d.quit();
		

}
}
