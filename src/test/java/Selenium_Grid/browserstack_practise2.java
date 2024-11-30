package Selenium_Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class browserstack_practise2 {

	public static void main(String[] args) throws MalformedURLException {

        MutableCapabilities opt = new MutableCapabilities();
        opt.setCapability("browserName", "Chrome");
		opt.setCapability("browserVersion", "127.0");
		
		Map<String, Object> cap=new HashMap<>();
		cap.put("os", "Windows");
		cap.put("osVersion", "10");
		cap.put("userName", "swapnilmane_4y5urA");
		cap.put("accessKey", "G8ti1SCJz7UyFHSNbVsA");
		
		opt.setCapability("bstack:options", cap);
		
		URL url=new URL("http://hub-cloud.browserstack.com/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(url, opt);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
