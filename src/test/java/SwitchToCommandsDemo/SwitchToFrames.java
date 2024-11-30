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

public class SwitchToFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		//Switch to frame using index
	   driver.switchTo().frame(0);
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();
	   
	   //Switch back to parent context or main window
	   driver.switchTo().defaultContent();
	   //driver.switchTo().parentFrame();
	   
	   
	   
	    
		
		
	}

}
