package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class AnotherWayOfReadingMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int lastRow=wb.getSheet("Sheet2").getLastRowNum();
		for(int i=0;i<=lastRow;i++)
		{
			int lastcell=wb.getSheet("Sheet2").getRow(i).getLastCellNum();
			for(int j=0;j<lastcell;j++)
			{
				String data=wb.getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

}
