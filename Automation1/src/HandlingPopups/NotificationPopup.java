package HandlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) {
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--incognito","--disable-notifications","--start-maximized");
	WebDriver d=new ChromeDriver(op);
	d.get("https://www.yatra.com");
}
}
