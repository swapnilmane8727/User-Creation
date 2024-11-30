package waits;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenShotsOfElement {

	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	 
	
	File src=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).getScreenshotAs(OutputType.FILE);
	
	
	
	try 
	{
	 FileHandler.copy(src, new File("./Element"+Utility.getCurrentTime()+".png"));
	} 
	catch (IOException e) 
	{
		
		System.out.println("error capturing SS" +e.getMessage());
	}
	
	
	
	driver.quit();

	}

}
