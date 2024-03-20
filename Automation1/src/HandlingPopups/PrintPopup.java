package HandlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		Robot r=new Robot();
		
		
		
	}

}
