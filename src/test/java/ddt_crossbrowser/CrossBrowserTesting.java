package ddt_crossbrowser;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class CrossBrowserTesting 
{
    
	@Parameters("Browsers")
	@Test
	public void login(String browser)
	{
		WebDriver driver=Utility.startBrowser(browser, "https://www.google.com/");
		Reporter.log(driver.getTitle(), true);
	    System.out.println("thread id no is "+Thread.currentThread().getId());
	    
	}	

}
