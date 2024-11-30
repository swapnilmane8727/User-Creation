package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands5 {
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.name("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.name("password1")).sendKeys("ineuron");
		driver.findElement(By.className("submit-btn")).click();
		
		//driver.quit();
	

  
		
	
		
		
        
		
	}

}
