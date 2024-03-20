package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSrc {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com");
	String pgsrc=d.getPageSource();
	System.out.println(pgsrc);
	d.quit();
}
}
