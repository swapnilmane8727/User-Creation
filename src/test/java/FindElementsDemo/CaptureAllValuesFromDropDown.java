package FindElementsDemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CaptureAllValuesFromDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
	
	    Select month=new Select(driver.findElement(By.id("month")));
	    
	    List<WebElement> allDDOptions=month.getOptions();

	   int size=allDDOptions.size();
	   System.out.println("total no of elements is "+size);
	   
	   
	    for(int i=0; i<size; i++)
	    {
	    	WebElement element=allDDOptions.get(i);
	    	String value=element.getText();
	    	System.out.println("total elemets are "+value);
	    	
	    	if(value.contains("Apr"))
	    	{
	    		System.out.println("Validation passes");
	    		break;
	    	}
	    	
	    	
	    }
	    
	    driver.quit();
	    
	
	}
	    


	}

