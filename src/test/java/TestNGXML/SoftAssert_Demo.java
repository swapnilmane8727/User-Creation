package TestNGXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Demo 
{

	@Test
	public void test1()
	{
		Reporter.log("test1 started", true);
		
	//	Assert.assertTrue(false);
		
		Reporter.log("test1 end", true);
		
	}
	
	@Test
	public void test2()
	{
		Reporter.log("test2 started", true);
		
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(true);
		Reporter.log("test2 end", true);
		softassert.assertAll();
		
	}
	
	
	
	
	
	
}
