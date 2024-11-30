package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands2 {
	
	/*WebElement = Interface = Which represents elemets on page
	 * 
	 * findElement Vs findElements
	 * findElement = finds element and throws when element not found
	 * findElements = finds elements and returns list of WebElement, when element not found still
	 * return size 0  
	 *
		*/
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		//Exception with findElement and No Exception with findElements
		driver.findElements(By.id("email"));
		
		//driver.findElements(By.id("email")).get(0).sendKeys("swapnil");
		
		
        
		
	}

}
