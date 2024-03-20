package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualTiltle=driver.getTitle();
	    System.out.println(actualTiltle);
		String expectedTitle="Facebook – log in or sign up";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl="https://www.facebook.com/";
		if(actualTiltle.contains(expectedTitle)&&actualUrl.equalsIgnoreCase(expectedUrl))
		{
			System.out.println("Pass: Both the title and url are same");
		}
		else
		{
			System.out.println("Fail: Both the title and url are not same");
		}
		driver.close();
	}

}
