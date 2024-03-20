package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Priya@gmail.com");
		driver.findElement(By.id("email")).clear();
		WebElement ele =driver.findElement(By.name("login"));
		boolean b=driver.findElement(By.name("login")).isEnabled();
		if(b==true)
		{
			System.out.println("The login button is enabled");
		}
		else
		{
			System.out.println("The login button is disabled");
		}
		
		String color=driver.findElement(By.name("login")).getCssValue("background-color");
		System.out.println(color);
		String text= ele.getText();
		System.out.println(text);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		WebElement w1=driver.findElement(By.name("firstname"));
		WebElement w2=driver.findElement(By.name("lastname"));
		Dimension d=w1.getSize();
		int height=d.getHeight();
		int width=d.getWidth();
		System.out.println("The height of firstname is"+height);
		System.out.println("The width of firstname is"+width);
		Dimension d1=w2.getSize();
		int height1=d1.getHeight();
		int width1=d1.getWidth();
		System.out.println("The height of surname is"+height1);
		System.out.println("The width of surname is"+width1);
		if(height==height1&&width==width1)
		{
			System.out.println("The height and width of firstname and surname are same");
		}
		else
		{
			System.out.println("The height and width of firstname and surname are not  same");
		}
		int y1=driver.findElement(By.name("firstname")).getLocation().getY();
		int y2=driver.findElement(By.name("lastname")).getLocation().getY();
		System.out.println("y axis of first name:"+y1);
		System.out.println("y axis of surname:"+y2);

		if(y1==y2)
		{
			System.out.println("The firstname and surname textbox are alligned properly");
		}
		else
		{
			System.out.println("The firstname and surname textbox are not alligned properly");
		}
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.xpath("//label[text()='Female']/../input"));
		btn.click();
		Thread.sleep(2000);
		boolean res=btn.isSelected();
		if(res==true)
		{
			System.out.println("The female radio button is selected");
		}
		else
		{
			System.out.println("The female radio button is not selected");
		}
		Thread.sleep(5000);
		driver.findElement(By.name("websubmit")).submit();
		driver.quit();
	}

}
