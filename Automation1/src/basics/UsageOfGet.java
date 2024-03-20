package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UsageOfGet {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.com"); 
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}
