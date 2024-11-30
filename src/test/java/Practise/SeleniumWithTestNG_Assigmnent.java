package Practise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import helper.Utility;

public class SeleniumWithTestNG_Assigmnent 
{
     WebDriver driver;
	
     @Test(priority = 1)
	public void startbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
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
	
     
     //verify footer count is 4
     
     @Test(priority = 4)
     public void footerverification()
     {
    	 List<WebElement> totalEle=driver.findElements(By.xpath("//div[contains(@class,'social')]//a"));
    	 int totalfooters=totalEle.size();
        System.out.println("total social media footers are "+totalfooters); 
           
         for (WebElement ele : totalEle) 
        {
        	String names=ele.getAttribute("href");
			System.out.println(names);
		}
     Assert.assertEquals(totalfooters, 4,"no of footers are wrong");   
     }
     
     
     //verify user is able to login, write assert for welcome
     
     @Test(priority = 5)
     public void login()
     {
    	driver.findElement(By.name("email1")).sendKeys("ineuron@ineuron.ai");
    	driver.findElement(By.name("password1")).sendKeys("ineuron");
    	driver.findElement(By.className("submit-btn")).click();
    	Utility.waitForSeconds(10);
    	
        WebElement text=driver.findElement(By.xpath("//button[normalize-space()='Sign out']"));
        String text1=text.getText();
        Assert.assertEquals(text1, "Sign out", "login failed");      
     }
     
     
     // verify user is able to logout, write assert for same
 	
     @Test(priority = 6)
     public void logout()
     {
 	   Utility.waitForSeconds(10);
       driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
     
     }
      
     @Test(priority = 7)
   	public void closebrowser()
   	{
   		driver.quit();
   	}
     
     // also attach emailable report in gitHub

	
}
