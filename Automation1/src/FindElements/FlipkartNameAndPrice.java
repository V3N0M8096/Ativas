package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNameAndPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com");
		d.findElement(By.name("q")).sendKeys("Iphone 14 pro max"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> allmobiles=d.findElements(By.xpath("//div[contains(text(),'Apple iphone')]"));
		List<WebElement> allprices=d.findElements(By.xpath("//div[contains(text(),'Apple iphone')]/../..div[2]/div[1]/div/div[1]"));
		for(int i=0;i<allmobiles.size()&&i<allprices.size();i++)
		{
		WebElement ele=allmobiles.get(i);
		WebElement ele1=allprices.get(i);
		String name=ele.getText();
		String price=ele1.getText();
		System.out.println(name+"===>"+price);
		
		}
		d.quit();
				
		}

}
