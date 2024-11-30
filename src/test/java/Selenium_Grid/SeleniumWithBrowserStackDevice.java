package Selenium_Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWithBrowserStackDevice {

	public static void main(String[] args) throws MalformedURLException 
	
	  {
        
		MutableCapabilities opt = new MutableCapabilities();

		opt.setCapability("browserName", "chrome");
		
		//opt.setCapability("browserVersion", "107");
		
		HashMap<String, Object> cap = new HashMap<String, Object>();
		
		//cap.put("os", "Windows");
		cap.put("osVersion", "13.0");
		cap.put("deviceName", "Samsung Galaxy S23 Ultra");
		//cap.put("browserVersion", "latest");
		cap.put("userName", "swapnilmane_4y5urA");
		cap.put("accessKey", "G8ti1SCJz7UyFHSNbVsA");
		
		opt.setCapability("bstack:options", cap);

		URL seleniumgrid=new URL("http://hub-cloud.browserstack.com/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(seleniumgrid, opt);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
