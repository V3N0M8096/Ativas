package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
	List<WebElement> alldrags = d.findElements(By.className("draggable"));
	WebElement drop1 = d.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
	WebElement drop2 = d.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
	Actions a=new Actions(d);
	System.out.println(alldrags.size());
	for(int i=0;i<alldrags.size();i++)
	{
		WebElement ele = alldrags.get(i);
		String text = ele.getText();
		System.out.println(text);
		if(text.contains("Mobile")) {
			a.dragAndDrop(ele, drop1).perform();
		}else if(text.contains("Laptop")){
			a.dragAndDrop(ele, drop2).perform();
		}
		Thread.sleep(2000);
	}
	
	}

}
