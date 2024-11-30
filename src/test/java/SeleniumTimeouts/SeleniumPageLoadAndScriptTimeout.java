package SeleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPageLoadAndScriptTimeout {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		
		/*
		 * // Always use before get method then only it takes affects
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 * 
		 * // Always use before get method
		 * driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		 * 
		 * driver.get("https://learn-automation.com/");
		 */
		
		
		driver.get("https://learn-automation.com/");
		
		//300 sec or 5 min (standard duration of driver timeout)
		System.out.println(driver.manage().timeouts().getPageLoadTimeout().getSeconds());
		
		// 0 sec
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());
		
		// 30 sec
		System.out.println(driver.manage().timeouts().getScriptTimeout().getSeconds());
		
		
	}

}
