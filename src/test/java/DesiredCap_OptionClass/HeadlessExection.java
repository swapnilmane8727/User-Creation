package DesiredCap_OptionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExection {

	public static void main(String[] args) {

		/*
		 * Selenium 3.6
		 *        Desired Capability -
		 *              Headless Mode / Background / Non GUI Mode
		 *              Incognito Mode
		 *              Proxy
		 *              SSL
		 *              Browser Extension
		 *                  Arguments
		 * 
		 * Selenium 3.7
		 *        ChromeOption
		 *        Firefox Option
		 *        EdgeOptions
		 *        
		 *        
		 * Selenium Grid
		 *        Desired Capability 
		 */
		
		
		
		ChromeOptions opt=new ChromeOptions();
		
		//opt.setheadless(true); or below both works
		opt.addArguments("--headless");
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		System.out.println("current URL is "+driver.getCurrentUrl());
		System.out.println("current title is "+driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
