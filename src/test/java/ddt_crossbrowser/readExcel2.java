package ddt_crossbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readExcel2 {

	@Test
	public void ReadExcel() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File("./TestData/TestData.xlsx")));
		 
		System.out.println("cell value is = "+wb.getSheet("login").getRow(1).getCell(1).getStringCellValue());
		
		System.out.println("cell value is = "+wb.getSheet("login").getRow(2).getCell(1).getStringCellValue());
		
		System.out.println("cell value is = "+wb.getSheet("user").getRow(3).getCell(1).getNumericCellValue());
		
	}

}
