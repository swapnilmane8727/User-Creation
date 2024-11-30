package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo6 {
	
	/*
	 * Element is disabled - click
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement textarea=driver.findElement(By.xpath("//textarea"));
		
		
		//Scrolling using JavaScript
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", textarea);
		
		textarea.clear();
		Thread.sleep(5000);
		textarea.sendKeys("swapnil");
		 

	}

}
