package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateToDemoApps {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
	Actions a=new Actions(d);
	 List<WebElement> draggable= d.findElements(By.className("draggable"));
	WebElement dropable1=d.findElement(By.linkText("Mobile Accessories"));
	WebElement dropable2=d.findElement(By.linkText("Laptop Accessories"));
	String Text=dropable1.getText();
	System.out.println(Text);
	/*if(draggable.equals(dropable1).getText())
	{
		a.dragAndDrop(draggable, dropable1).perform();
	}
	
	a.dragAndDrop(dropable1,dropable2).perform();
	
	a.clickAndHold(dropable1).moveToElement(dropable1).pause(2000).release().build().perform();*/
}
}
