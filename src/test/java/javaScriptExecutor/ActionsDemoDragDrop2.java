package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class ActionsDemoDragDrop2 {
	

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Utility.waitForSeconds(3);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		Utility.waitForSeconds(3);
		
		
		WebElement source=driver.findElement(By.id("draggable"));
	    WebElement destination=driver.findElement(By.id("droppable"));
		
	     Actions act=new Actions(driver);
	     
	     
			/*
			 * Using human like actions
			 * 
			 * Click and hold Move to element release
			 * 
			 * and also for series of operation .build().perform() should be used like below
			 */
	     
	   act.clickAndHold(source).pause(3000).moveToElement(destination).pause(3000).release(destination).build().perform();
	     
	     
	    
	     
	   
		
		

	}

}
