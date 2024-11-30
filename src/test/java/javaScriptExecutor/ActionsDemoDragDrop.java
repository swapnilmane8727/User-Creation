package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class ActionsDemoDragDrop {
	

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		
	     Actions act=new Actions(driver);
	     
	    WebElement source=driver.findElement(By.id("draggable"));
	    WebElement destination=driver.findElement(By.id("droppable"));
	     
	    
	    //Using Drag and Drop; and below operation is only normal so only perform is used, if series of operation then build.perform is used
	     act.dragAndDrop(source, destination).perform();
	     
	    // Or:
	    // act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("draggable")));
		
		

	}

}
