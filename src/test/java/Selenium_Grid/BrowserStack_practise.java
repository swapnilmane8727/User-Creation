package Selenium_Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack_practise {

	public static void main(String[] args) throws MalformedURLException {

		
		DesiredCapabilities options = new DesiredCapabilities();
		options.setCapability("browserName", "Chrome");
		options.setCapability("browserVersion", "latest");
		
		Map<String, Object> cap=new HashMap<String, Object>();
		cap.put("os", "Windows");
		cap.put("osVersion", "10");
		
		/*
		 * cap.put("userName", "swapnilmane_4y5urA"); 
		 * cap.put("accessKey", "G8ti1SCJz7UyFHSNbVsA");
		 */
		
		options.setCapability("bStack:options", cap);
		
		URL seleniumGrid = new URL("http://swapnilmane_4y5urA:G8ti1SCJz7UyFHSNbVsA@hub-cloud.browserstack.com/wd/hub");

		
		WebDriver driver=new RemoteWebDriver(seleniumGrid, options);
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
        driver.quit();		
		
		
		
		
	}

}
