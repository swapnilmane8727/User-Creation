package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumTest2 {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String titlename=driver.getTitle();
		System.out.println("Title name is "+titlename);
		String url=driver.getCurrentUrl();
		System.out.println("URL is "+url);
		
		System.out.println("************************");
		
		driver.get("https://www.facebook.com");
		String titlename1=driver.getTitle();
		System.out.println("Title name is "+titlename1);
		String url1=driver.getCurrentUrl();
		System.out.println("URL is "+url1);
		
		System.out.println("************************");
		
		driver.get("https://www.youtube.com");
		String titlename2=driver.getTitle();
		System.out.println("Title name is "+titlename2);
		String url2=driver.getCurrentUrl();
		System.out.println("URL is "+url2);
		
		//quit will close all the tabs and windows
		driver.quit();
		
		//close will close only active/current tab/windows
	//	driver.close();
		

		
		
		
	}

}
