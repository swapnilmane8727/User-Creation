package SwitchToCommandsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo5 {

	public static void main(String[] args) throws InterruptedException {

		/*
		First click on al social media link this will open 4 media link + parent link 
		Write a logic that will switch to window/tab which title contains Facebook	
		*/
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		
	    String parentHandle=driver.getWindowHandle();
	     
	    Thread.sleep(3000);
	
		
	   driver.findElement(By.xpath("//a[contains(@href,\"youtube\")]")).click();
	   Thread.sleep(3000);
	   driver.switchTo().window(parentHandle);
	   driver.findElement(By.xpath("//a[contains(@href,\"twitter\")]")).click();
	   Thread.sleep(3000);
	   driver.switchTo().window(parentHandle);
	   driver.findElement(By.xpath("//a[contains(@href,\"linkedin\")]")).click();
	   Thread.sleep(3000);
	   driver.switchTo().window(parentHandle);
	   driver.findElement(By.xpath("//a[contains(@href,\"facebook\")]")).click();
	   Thread.sleep(3000);
	   driver.switchTo().window(parentHandle);
	   
	   Set<String> allWindowHandles=driver.getWindowHandles();
	   
	   for (String handle : allWindowHandles) 
	   {		
		   driver.switchTo().window(handle);
		   
		   if (driver.getTitle().contains("Linkedin")) 
		   
		   {
			   System.out.println(driver.getTitle());
			  
			   break;
		   }
		   
		  
		   
	   }
	   
	  
	   
	   
	   
	   
	   
	    
		
		
	}

}
