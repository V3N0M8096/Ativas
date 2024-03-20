package HandlingPopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		File f=new File("./data/Resume.docx");
		String abspath=f.getAbsolutePath();
		System.out.println(abspath);
		d.findElement(By.id("upload")).sendKeys(abspath);
		
	}

}
