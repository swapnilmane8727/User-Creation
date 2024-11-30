package ddtViaExcel;

import org.testng.annotations.Test;

import helper.CustomDataProvider;

public class SampleTestDDT2 {

	
	
	@Test(dataProvider = "EmpDataSet", dataProviderClass = CustomDataProvider.class)
	public void sample(String fname, String lname, String email)
	{
		System.out.println("**********Test started***********");
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println("**********Test completed***********");
	}

	
	
}
