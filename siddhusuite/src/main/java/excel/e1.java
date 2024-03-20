package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
//apache poi, apche poi ooxml, apache poi ooxml schema 
public class e1 {
	
	@Test
	public void t1() throws IOException
	{
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		// number of rows
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row "+ col);
		//read: know the row index and column index
		XSSFCell data = sheet.getRow(5).getCell(2);
		System.out.println(data);
		
		// write: row index and column index
		//29,5
		sheet.getRow(29).createCell(5).setCellValue("welcomeee");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
	}

}
