package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@id=\"persistent\"]")).click();
		
		
		/*
		 * Click
		 *     click - Actions
		 *     click - JavaScript
		 *     click - WebElement
		 *     
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
	}

}
