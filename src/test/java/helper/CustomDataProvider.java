package helper;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	
	@DataProvider(name = "EmpDataSet")
	public static Object[][] getData()
	{
		Object[][]arr=ExcelReader.geDataFromSheet("employee");
		return arr;
	}
	
	
	/*
	 * @DataProvider(name = "LoginDataSet") 
	 * public static Object[][] getData1()
	 * {
	 *  Object[][]arr=ExcelReader.geDataFromSheet("login"); 
	 *  return arr; 
	 * }
	 */
	
	
}
