package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();Thread.sleep(2000);
		d.get("https://www.fb.com");Thread.sleep(2000);
		d.manage().window().setSize(new Dimension(360,183));Thread.sleep(2000);
		d.manage().window().setPosition(new Point(-10,-500));Thread.sleep(2000);
		d.manage().window().maximize();Thread.sleep(2000);
		d.manage().window().fullscreen();Thread.sleep(2000);
		d.manage().deleteAllCookies();Thread.sleep(2000);
		d.manage().window().minimize();Thread.sleep(2000);
		d.close();
				
	}

}
