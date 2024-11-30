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



public class HandleAutoSuggestionJava {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
       
        Thread.sleep(3000);
		
        List<WebElement> allvalues=driver.findElements(By.xpath("//div[@role=\"option\"]"));
        
        System.out.println("total count "+allvalues.size());
        
        for (WebElement ele : allvalues) 
        {
			String text=ele.getText();
			
			if (text.contains("github")) 
			{
			ele.click();	
			break;
			}

		}

      driver.quit();
		
	}

	}

