package DataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class DemoFileLib 
{
	public static void main(String[] args) throws IOException 
	{
		FileLib f=new FileLib();
		String url=f.readDataFromProperty("url");
		WebDriver d=new ChromeDriver();
		d.get(url);
		String un=f.readDataFromProperty("un");
		String pwd=f.readDataFromProperty("pwd");
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pwd);
		String data=f.readDataFromExcel("InvalidLogin", 5, 1);
		System.out.println(data);
		String data2=f.readDataFromExcel("CreateCustomer", 1, 2);
		System.out.println(data2);
		f.WriteDataIntoExcel("CreateCustomer", 1, 2,"kohli");
		f.WriteDataIntoExcel("Sheet2", 8, 0, "warner");
		f.WriteDataIntoExcel("InvalidLogin", 10, 1, "Akaay");
	}
}