package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class CaptureScreenShotsInSelenium3 {

	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Utility.captureScreenShot(driver);

	}

}
