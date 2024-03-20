package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertConfirmationPromptPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(5));
		d.get("https://demo.automationtesting.in/Alerts.html");Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());Thread.sleep(2000);
		Alert a=d.switchTo().alert();Thread.sleep(2000);
		String alerttext=a.getText();Thread.sleep(2000);
		a.accept();Thread.sleep(2000);
		System.out.println(alerttext);
		d.findElement(By.linkText("Alert with OK & Cancel")).click();
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();Thread.sleep(2000);
		d.switchTo().alert().dismiss();Thread.sleep(2000);
		String text=d.findElement(By.id("demo")).getText();Thread.sleep(2000);
		System.out.println(text);
		d.findElement(By.linkText("Alert with Textbox")).click();
		d.findElement(By.xpath("//button[@class='btn btn-info']")).click();Thread.sleep(2000);
		Alert a1= d.switchTo().alert();Thread.sleep(2000);
		a1.sendKeys("Modi ji");Thread.sleep(2000);
		a1.accept();Thread.sleep(2000);
		System.out.println(d.findElement(By.id("demo1")).getText());Thread.sleep(2000);
		
	}

}
