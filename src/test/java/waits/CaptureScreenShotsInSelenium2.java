package waits;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShotsInSelenium2 {

	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	 
	 try 
	 {
		org.openqa.selenium.io.FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./myScreenShots1.png"));
	 } 
	 catch (IOException e) 
	 {
		 System.out.println("Something went wrong "+e.getMessage());
	 }
	 driver.quit();

	}

}
