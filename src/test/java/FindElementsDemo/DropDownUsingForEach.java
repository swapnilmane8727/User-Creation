package FindElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*    1- Whenever u deal with more than >1 web element use 
 *     Autosuggestion
 *     DropDown with or without Select
 *     Calender 
 * 
 *    2- Optional Checks
 *    
 *    3- with tagName 
 * 
 * 
 * */

public class DropDownUsingForEach {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
	    Select month=new Select(driver.findElement(By.id("month")));
	    
	    List<WebElement> allDDOptions=month.getOptions();
	    
	    for (WebElement ele : allDDOptions) 
	    {
		String values=ele.getText();
		System.out.println("Values are "+values);
		
		if (values.contains("Aug")) 
		{
			System.out.println("Found");
			break;
		}
		
		
		}
	    
	    driver.quit();

	}

	}
