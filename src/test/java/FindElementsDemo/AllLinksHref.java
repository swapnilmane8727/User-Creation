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



public class AllLinksHref {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		
		for (WebElement ele : allLinks) 
		{
		System.out.println("Link Text is "+ele.getText());
		}
		
		System.out.println("********************************************");
		
		
		for (WebElement ele: allLinks) 
		{
		System.out.println("Link Text is "+ele.getAttribute("innerHTML"));	
		}
		
		
		System.out.println("*********************************************");
		
		
		for (WebElement ele : allLinks) 
		{
		System.out.println("Link Text is "+ele.getAttribute("outerHTML"));	
		}
		
		
		System.out.println("**********************************************");
		
		
		for (WebElement ele : allLinks) 
		{
		System.out.println("Href value is "+ele.getAttribute("href"));	
		
		}
		
		System.out.println("**********************************************");
		
		
		
		
		
		
		
		
		
	}

	}

