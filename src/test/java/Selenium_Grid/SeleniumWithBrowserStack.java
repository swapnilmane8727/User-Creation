package Selenium_Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWithBrowserStack {

	public static void main(String[] args) throws MalformedURLException 
	
	  {
        // Create MutableCapabilities instance
		MutableCapabilities options = new MutableCapabilities();

        
        // Using cap variable to set BrowserStack-specific capabilities using a Map for bstack:options
        Map<String, Object> cap = new HashMap<>();
        cap.put("os", "Windows");
        cap.put("osVersion", "11");
        cap.put("userName", "swapnilmane_4y5urA");
        cap.put("accessKey", "G8ti1SCJz7UyFHSNbVsA");
        
        // Add BrowserStack options to the ChromeOptions instance under "bstack:options"
        options.setCapability("bstack:options", cap);

        // Set other Chrome-specific capabilities if needed
        options.setCapability("browserName", "Chrome");
        options.setCapability("browserVersion", "latest");


        // URL for BrowserStack Selenium Grid
		URL seleniumgrid=new URL("http://hub-cloud.browserstack.com/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(seleniumgrid, options);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
