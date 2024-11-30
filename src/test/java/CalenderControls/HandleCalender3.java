package CalenderControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.manage().window().maximize();
		
		// Option 3 - With Click & Click
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		List<WebElement> allElement=driver.findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//a"));
		
		for (WebElement ele : allElement) 
		{
			String dateText=ele.getText();
			System.out.println("Dates are "+dateText);
			
			if(dateText.contains("29"))
			{
				System.out.println("Found");
				ele.click();
				break;
			}
			
			
			
		}
		
		System.out.println(driver.findElement(By.id("datepicker")).getAttribute("value"));
		
		
	}

}
