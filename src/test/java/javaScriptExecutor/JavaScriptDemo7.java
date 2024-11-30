package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class JavaScriptDemo7 {
	

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		
		Utility.highlightElement(driver, By.name("email1")).sendKeys("ineuron@ineuron.ai");
		Utility.highlightElement(driver, By.name("password1")).sendKeys("ineuron");
		Utility.highlightElement(driver, By.xpath("//button[normalize-space()=\"Sign in\"]")).click();
		
		/*
		 * WebElement ele=driver.findElement(By.name("email1"));
		 * Utility.highlightElement(driver, ele);
		 */
		 

	}

}
