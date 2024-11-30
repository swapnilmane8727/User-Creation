package Working_With_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class LocatorsDemo3 {
	
	@Parameters("Browsers")
	@Test
	public void browser(String browser)
	{
		
		
		System.out.println("Thread id is = "+Thread.currentThread().getId());
		
		WebDriver driver=Utility.startBrowser(browser, "https://ineuron-courses.vercel.app/login");
		
		
		driver.findElement(By.name("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.name("password1")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Utility.waitForSeconds(3);
		
		WebElement ele=driver.findElement(By.xpath("//button[normalize-space()=\"Sign out\"]"));
		Utility.waitForSeconds(3);
		String txt=ele.getText();
		
		Assert.assertTrue(txt.contains("Sign out"));
		
		Reporter.log("Successfully verified", true);
		
	}

}
