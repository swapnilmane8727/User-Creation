package waits;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenShotsInSelenium4 {

	public static void main(String[] args) throws IOException {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	 
	Utility.captureScreenShot(driver);
	
	File src=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).getScreenshotAs(OutputType.FILE);
	
	File destination=new File("./Element.png");
	
	FileHandler.copy(src, destination);
	
	Utility.waitForSeconds(2);
	
	Utility.captureScreenShot(driver);
	
	Utility.waitForSeconds(3);
	
	Utility.captureScreenShot(driver);
	
	Utility.waitForSeconds(5);
	
	Utility.captureScreenShot(driver);
	
	driver.quit();

	}

}
