package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo 
{
    
	@Parameters("Browser")
	@Test
	public void test1(@Optional("chrome") String browser)
	{
		System.out.println("thread is "+Thread.currentThread().getId());
		Reporter.log("browser name is "+browser, true);
	}
	
	
	
	
	
	
	
	
	
}
