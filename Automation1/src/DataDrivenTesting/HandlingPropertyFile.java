package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		 String url=p.getProperty("url");
		 String un=p.getProperty("un");
		 String pwd=p.getProperty("pwd");
		 System.out.println(url);
		 System.out.println(un);
		 System.out.println(pwd);
		
		
	}
}
