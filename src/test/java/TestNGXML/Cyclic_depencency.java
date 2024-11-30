package TestNGXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Cyclic_depencency 
{

	/* Dependency */
	
	@Test(priority = 1)       //(dependsOnMethods = "logout")          // this test depends on below test
	public void login()
	{
		Assert.assertTrue(true);
		Reporter.log("Login to application", true);
	}
	
	@Test(priority = 2)      //(dependsOnMethods = "login")          // // this test depends on above test
	public void logout()
	{
		Assert.assertTrue(true);
		Reporter.log("Logout from application", true);
	}
	
	
	
	
	
	
	
}
