package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.fb.com");
		d.navigate().to("https://www.instagram.com");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		d.close();
	}

}
