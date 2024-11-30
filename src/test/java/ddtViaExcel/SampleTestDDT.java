package ddtViaExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.ExcelReader;

public class SampleTestDDT {

	
	
	@Test(dataProvider = "Sample")
	public void sample(String fname, String lname, String email)
	{
		System.out.println("**********Test started***********");
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println("**********Test completed***********");
	}

	
	@DataProvider(name = "Sample")
	public Object[][] getData()
	{
		Object[][]arr=ExcelReader.geDataFromSheet("employee");
		return arr;
	}
	
	
}
