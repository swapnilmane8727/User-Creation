package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands3 {
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
	
	WebElement username=driver.findElement(By.id("email1"));
	
	System.out.println("Display status "+username.isDisplayed());
	System.out.println("Enable status "+username.isEnabled());
	System.out.println(username.isSelected());
	
	System.out.println("CSS value "+username.getCssValue("font-size"));
	
	username.sendKeys("swapnil@gmail.com");
	
	System.out.println("Value fetched "+username.getAttribute("value"));
    
  
		
	
		
		
        
		
	}

}
