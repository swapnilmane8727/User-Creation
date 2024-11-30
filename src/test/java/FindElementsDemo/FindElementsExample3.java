package FindElementsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FindElementsExample3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
		Thread.sleep(5000);
		
	    
		Select month=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> allDDoptions=month.getOptions();
		
		List<String> ddvalues=new ArrayList<String>();
		
		for (WebElement ele : allDDoptions) 
		{
			String text=ele.getText();
			ddvalues.add(text);		
		}
		
		System.out.println(ddvalues);
		driver.quit();	
	}

	}

