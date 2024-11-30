package ddt_crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.Utility;


public class DDT {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		Reporter.log("Setting up browser", true);
        driver=Utility.startBrowser("Chrome", "https://ineuron-courses.vercel.app/login");
        Reporter.log("application is Up & runnung", true);

		
	}
	
	@AfterMethod
	public void closesession()
	{
		Reporter.log("Termination session", true);
		driver.quit();
		Reporter.log("Session terminated", true);
	}
	
	
	
	
	@Test(dataProvider = "loginData")
	public void test1(String uname, String pass)
	{	
        driver.findElement(By.name("email1")).sendKeys(uname);
        driver.findElement(By.name("password1")).sendKeys(pass);
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        
        String url=driver.getCurrentUrl();
        boolean hello=url.contains("https://ineuron-courses.vercel.app/");
        
        Assert.assertTrue(driver.getTitle().contains("iNeuron Courses"));   
        Assert.assertTrue(hello);
        
		
	}
	
	@DataProvider(name = "loginData")
	public Object[][] getdata()
	{
		
		Object [][] arr=new Object[5][2];
		
		arr[0][0]="admin11";
		arr[0][1]="admin1231";
		
		arr[1][0]="selenium";
		arr[1][1]="java";
		
		arr[2][0]="testng";
		arr[2][1]="maven";
		
		arr[3][0]="jenkins";
		arr[3][1]="github";
		
		arr[4][0]="ineuron@ineuron.ai";
		arr[4][1]="ineuron";

		return arr;
	}

}
