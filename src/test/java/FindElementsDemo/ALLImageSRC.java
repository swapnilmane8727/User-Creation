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



public class ALLImageSRC {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//img[@src]"));
		
		
		for (WebElement ele : allLinks) 
		{
        //System.out.println("Link text is "+ele.getText());
	    //System.out.println("InnerHTML  is "+ele.getAttribute("innerHTML"));
		//System.out.println("outerHTML  is "+ele.getAttribute("outerHTML"));
		//System.out.println("Href value is "+ele.getAttribute("href"));
		System.out.println("SRC value is "+ele.getAttribute("src"));
		}
		
		
	}

	}

