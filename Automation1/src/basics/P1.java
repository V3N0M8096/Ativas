package basics;

import org.openqa.selenium.chrome.ChromeDriver;



public class P1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
