package CalenderControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.manage().window().maximize();
		
		// Option 2 - With Click & Click
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		// Click on Next Month
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		
		// Select a date from nect month
		driver.findElement(By.xpath("//a[text()='28']")).click();
		
		
		
		
	}

}
