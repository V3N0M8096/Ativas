package HandlingListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("file:///C:/Users/IRAYYA/OneDrive/Desktop/html/HotelA.html");
		WebElement mtr=d.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> allEle=s.getOptions();
		for(int i=0;i<allEle.size();i++)
		{
			s.selectByIndex(i);Thread.sleep(2000);
		}
		for(int i=allEle.size()-1;i>=0;i--)
		{
			s.deselectByIndex(i);Thread.sleep(2000);
		}
		for(WebElement ele:allEle)
		{
			String text=ele.getText();Thread.sleep(2000);
			System.out.println(text);Thread.sleep(2000);
			String value=ele.getAttribute("value");Thread.sleep(2000);
			//s.selectByVisibleText(text);
			s.selectByValue(value);Thread.sleep(2000);
		}
		WebElement ele=s.getWrappedElement();Thread.sleep(2000);
		System.out.println(ele.getText());Thread.sleep(2000);
	}

}
