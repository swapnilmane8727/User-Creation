package webDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsCommands {

	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	
		Options opt=driver.manage();
		Window win=opt.window();
		win.maximize();
		Thread.sleep(3000);
		
		
		driver.get("http://www.twitter.com");
		Thread.sleep(3000);
		win.minimize();
		Thread.sleep(3000);
		win.fullscreen();
		
	}

}
