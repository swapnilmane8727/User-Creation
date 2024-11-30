package waits;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenShotsOfElement2 {

	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	 
	
	WebElement element=driver.findElement(By.xpath("(//input[@value=\"I'm Feeling Lucky\"])[2]"));
	
	Utility.captureScreenShotOfWebElement(driver, element);
	
	
	driver.quit();

	}


}
