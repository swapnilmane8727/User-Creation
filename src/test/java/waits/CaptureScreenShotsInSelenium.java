package waits;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShotsInSelenium {

	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 
	// File hello=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 
	 File destination=new File("./myScreenShots.png");
	 
	 try 
	 {
		org.openqa.selenium.io.FileHandler.copy(src, destination);
	} 
	 catch (IOException e) 
	 {
		 System.out.println("Something went wrong "+e.getMessage());
	}
	 driver.quit();

	}

}
