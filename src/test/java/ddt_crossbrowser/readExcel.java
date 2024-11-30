package ddt_crossbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readExcel {

	@Test
	public void ReadExcel() throws IOException {

		/*
		 * Excel Apache POI - Read microsoft document JExcel
		 */
		File src = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);

		/*
		 * XSSFWorkbook wb; XSSFSheet sh1; XSSFRow r1; XSSFCell c1l;
		 */

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheetcount = wb.getNumberOfSheets();
		System.out.println("total no of sheets in excel = "+sheetcount);

		XSSFSheet sh1 = wb.getSheet("login");
        int pnr=sh1.getPhysicalNumberOfRows();
		System.out.println("total no of physical rows in login sheet = "+pnr);
		
		XSSFRow r1 = sh1.getRow(1);
		XSSFCell c1 = r1.getCell(1);	
		 
		
		System.out.println("cell value is = "+c1.getStringCellValue());
		
	}

}
