package extentReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestUsingPOM extends BaseClass{
	
	@Test
	public void validLogin()
	{
		HomePage home=new HomePage(driver);
		
		//home.clickOnLoginButton();
		
		//LoginPage login=new LoginPage(driver);
		
		LoginPage login=home.clickOnLoginButton();
		
		login.loginToApplication("ineuron@ineuron.ai","ineuron1");
	
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed());
		
		
	}

}
