package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromCommondataAndExcelAndWriteDataIntoExcel {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		d.get(url);
		String un = p.getProperty("un");
		String pwd = p.getProperty("pwd");
		d.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		d.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Logout")).click();
		FileInputStream fis1=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		int count =wb.getSheet("InvalidLogin").getLastRowNum();
		for(int i=0;i<=count;i++)
		{
			String un1=wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
			String pwd1=wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			Thread.sleep(2000);
			d.findElement(By.id("username")).sendKeys(un1);
			Thread.sleep(2000);
			d.findElement(By.name("pwd")).sendKeys(pwd1);
			Thread.sleep(2000);
			d.findElement(By.xpath("//div[text()='Login ']")).click();
			try
			{
				d.findElement(By.id("logoutLink")).click();
				wb.getSheet("InvalidLogin").getRow(i).getCell(2).setCellValue("pass");
				
			}
			catch(NoSuchElementException e)
			{
				wb.getSheet("InvalidLogin").getRow(i).getCell(2).setCellValue("Fail");
			}
			
		}
			FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
			wb.write(fos);
		
		}

}
