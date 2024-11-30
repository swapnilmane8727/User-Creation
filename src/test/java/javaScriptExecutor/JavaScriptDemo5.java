package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo5 {
	
	/*
	 * Element is disabled - click
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		 
	    WebElement hello=driver.findElement(By.id("login-username"));
		
	    //js.executeScript("arguments[0].vlaue=arguments[1]", hello,"swapnil");
		 
		WebElement checkbox=driver.findElement(By.id("persistent"));
		
		js.executeScript("arguments[0].click()",checkbox);
		 

	}

}
