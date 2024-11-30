package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo3 {
	
	/*
	 * Element is disabled - click
	 * 
	 */

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('pass').value='swapnil'");

		

		
		
	}

}
