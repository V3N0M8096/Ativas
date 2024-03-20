package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
	Thread.sleep(2000);
	List<WebElement> allcheckbox=d.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<allcheckbox.size();i++)
	{
		allcheckbox.get(i).click();
		Thread.sleep(500);
	}
	int count=0;
	for(int i=0;i<allcheckbox.size();i++)
	{
		if(allcheckbox.get(i).isSelected())
		{
			count++;
		}
	}
	if(count==allcheckbox.size())
	{
		System.out.println("All the checkbox are selected");
	}
	else
	{
		System.out.println("All the checkbox are not selected");
	}
}
}
