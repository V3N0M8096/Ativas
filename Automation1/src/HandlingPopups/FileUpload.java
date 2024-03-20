package HandlingPopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		File f=new File("./data/RESUMES.docx");
		String absPath = f.getAbsolutePath();
		System.out.println(absPath);
		Thread.sleep(2000);
		driver.findElement(By.id("fileInput")).sendKeys(absPath);
	}

}
