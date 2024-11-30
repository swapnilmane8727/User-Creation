package webDriverCommands;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands2 {

	/* Diff between navigate().to Vs get() 
	 * 
	 * driver.navigate().to = this is coming from Navigation Interface
	 * driver.get()         = this is coming from WebDriver
	 * 
	 * */
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.get("http://www.twitter.com");
		
		
		
	}

}
