package FindElementsDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
        driver.manage().window().maximize();
        
       WebElement element=driver.findElement(By.name("username"));
       
       element.sendKeys("Swapnil");
       driver.navigate().refresh();
       element.sendKeys("mane");
		
        
		
	}

	}

