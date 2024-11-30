package Selenium_Grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWithTestNG 
{
     WebDriver driver;
	
     @Test(priority = 1)
	public void startbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/");
		driver.manage().window().maximize();
	}
     
     @Test(priority = 2)
 	public void currentURL()
 	{
 		String url=driver.getCurrentUrl();
 		Assert.assertTrue(url.contains("ineuron-courses"),"URL did not match");
 	}
	
     @Test(priority = 3)
  	public void Title()
  	{
  		String url=driver.getTitle();
  		Assert.assertTrue(url.contains("Courses"),"title mismatch");
  	}
	
     @Test(priority = 4)
   	public void closebrowser()
   	{
   		driver.quit();
   	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
