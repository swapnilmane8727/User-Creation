package webDriverCommands;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsCommands2 {
		
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
        
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		
		driver.get("http://www.twitter.com");
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		
	}

}
