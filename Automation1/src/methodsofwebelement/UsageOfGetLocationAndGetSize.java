package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocationAndGetSize {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		WebElement ele =d.findElement(By.name("login"));
		Point p=ele.getLocation();
		int xaxis=p.getX();
		int yaxis=p.getY();
		System.out.println("The x Axis value of login button is:"+xaxis);
		System.out.println("The y Axis value of login button is:"+yaxis);
		Dimension d1=ele.getSize();
		int height=d1.getHeight();
		int width=d1.getWidth();
		System.out.println("The height of login button is:"+height);
		System.out.println("The width of login button is:"+width);
	}

}
