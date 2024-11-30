package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUsingActionClass {
	
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
		
		//Scrolling using Actions class
		
		Actions act=new Actions(driver);
		act.scrollToElement(textarea).perform();
		
	
		textarea.clear();
		Thread.sleep(5000);
		textarea.sendKeys("swapnil");
		 

	}

}
