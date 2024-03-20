package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	int count=	wb.getSheet("Sheet2").getLastRowNum();
	for(int i=0;i<=count;i++)
	{
		String data=wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
		System.out.println("data:"+data);
	}
	int lastcell=wb.getSheet("Sheet2").getRow(1).getLastCellNum();
	for(int i=0;i<lastcell;i++)
	{
		String data1=wb.getSheet("Sheet2").getRow(0).getCell(i).getStringCellValue();
		System.out.println("data1:"+data1);
	}
	
	}

}
