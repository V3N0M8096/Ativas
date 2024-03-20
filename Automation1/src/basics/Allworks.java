package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allworks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		Thread.sleep(5000);
		d.get("https://www.google.com");Thread.sleep(5000);
		d.manage().window().setSize(new Dimension(1000,500));Thread.sleep(5000);
		d.manage().window().setPosition(new Point(1000,300));Thread.sleep(5000);
		Point dim = d.manage().window().getPosition();Thread.sleep(5000);
		Dimension d1=d.manage().window().getSize();Thread.sleep(5000);
		System.out.println(dim);Thread.sleep(5000);
		System.out.println(d1);Thread.sleep(5000);
		String title=d.getTitle();Thread.sleep(5000);
		System.out.println(title);Thread.sleep(5000);
		String url=d.getCurrentUrl();Thread.sleep(5000);
		System.out.println(url);Thread.sleep(5000);
		d.manage().deleteAllCookies();Thread.sleep(5000);
		d.manage().window().fullscreen();Thread.sleep(5000);
		d.navigate().to("https://www.instagram.com");Thread.sleep(5000);
		d.navigate().back();Thread.sleep(5000);
		d.navigate().refresh();Thread.sleep(5000);
		d.navigate().forward();Thread.sleep(5000);
		d.quit();
		
	}

}
