package SeleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPageLoadAndScriptTimeout2 {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
			
		
		// Always use before get method then only it takes affects
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 
		 // Always use before get method
		 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		 
		 driver.get("https://learn-automation.com/");

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.id("swapnil"));
		
		
	}

}
