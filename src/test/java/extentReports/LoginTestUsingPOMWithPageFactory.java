package extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.Utility;

public class LoginTestUsingPOMWithPageFactory {
	
	@Test
	public void validLogin()
	{
	 WebDriver driver=Utility.startBrowser("Chrome", "https://ineuron-courses.vercel.app/");
	 
	 HomePage home=PageFactory.initElements(driver, HomePage.class);

	 LoginPage login=home.clickOnLoginButton();	
	 
	 login.loginToApplication("", "");

	}

}
