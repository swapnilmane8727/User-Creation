package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo2 {
	
	/*
	 * Element is disabled - click
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		// type using JS - disabled
		js.executeScript("document.getElementById('login-username').value='swapnil'");
		
		//Thread.sleep(4000);
		
		//click with JS - force click
		js.executeScript("document.getElementById(\"persistent\").click()");
		

		
		
	}

}
