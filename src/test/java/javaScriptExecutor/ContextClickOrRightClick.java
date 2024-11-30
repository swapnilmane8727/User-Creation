package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class ContextClickOrRightClick {


	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://api.jquery.com/contextmenu/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement area=driver.findElement(By.xpath("//h4[normalize-space()='Demo:']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", area);
		
		Utility.waitForSeconds(3);
		
		WebElement iframelement=driver.findElement(By.xpath("//div[@class='demo code-demo']//iframe"));
		
		driver.switchTo().frame(iframelement);
		
		WebElement textarea=driver.findElement(By.tagName("div"));
		
		Actions act1=new Actions(driver);
		act1.contextClick(textarea).perform();
		
		String color=textarea.getCssValue("background-color");
		System.out.println("RGB value is "+color);
		
	
	
		 

	}

}
