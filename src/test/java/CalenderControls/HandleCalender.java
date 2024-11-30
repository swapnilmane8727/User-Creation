package CalenderControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		
		//Option 1 - If application supports
		driver.findElement(By.id("datepicker")).sendKeys("05/09/2024");
		
		driver.quit();
		
		
	}

}
