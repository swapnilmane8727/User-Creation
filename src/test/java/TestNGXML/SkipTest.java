package TestNGXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTest 
{

	/* Dependency */
	
	@Test
	public void login()
	{
		Assert.assertTrue(true);                          // forced fail test
		Reporter.log("Login to application", true);
	}
	
	@Test //(dependsOnMethods = "login")                  // this test depends on above test              
	public void logout()                               // console: as login test fails, logout test
	{                                                  //  skipped
		Assert.assertTrue(true);
		Reporter.log("Logout from application", true);
	}
	
	
	
}
