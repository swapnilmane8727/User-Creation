package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	
	/*
	 * Selenium has 2 categories 
	 * 1 = Direct locators == id, name, className, linkText, partialLinkText, tagName, 
	 * 2 = InDirect locators == XPath, CSSSelectors 
	 * 
	 * Selenium has relative locators 
	 * 
	 * 
	 */
		
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		WebElement username=driver.findElement(By.id("email1"));
		username.sendKeys("ineuron@ineuron.ai");
		Thread.sleep(1000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("swapnil@gmail.com");
		Thread.sleep(1000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("hello@gmail.com");
        
		
	}

}
