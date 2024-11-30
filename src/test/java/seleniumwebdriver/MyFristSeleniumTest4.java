package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class MyFristSeleniumTest4 {

	public static void main(String[] args) {

		ChromeDriver d1=new ChromeDriver();	
		WebDriver d2=new ChromeDriver();
		SearchContext d3=new ChromeDriver();
		Object d4=new ChromeDriver();
		
		/*
		 * Chrome - ChromeDriver - Google
		 * Firefox - GeckoFriver - Mozilla
		 * 
		 * Chrome - webdriver.chrome.driver
		 * Firefix -webdriver.gecko.driver 
		 * Edge - webdriver.edge.driver 
		 */
	
// below setps are only required if using 4.5.0 or below		
// for older version of selenium where we need to manually give driver for browsers
		
//Option 1= Manually Maintain drivers
//System.setProperty("webdriver.chrome.driver", "Path of exe where chrome driver is present"); 
		
//Option 2=Use Web Driver Manager
//Checks browser version , check do we have driver, download, cache, build path
//WebDriverManager.chromedriver().setup();

	
		
		
	}

}
