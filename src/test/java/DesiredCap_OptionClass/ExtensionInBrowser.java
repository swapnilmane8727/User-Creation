package DesiredCap_OptionClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionInBrowser {

	public static void main(String[] args) {

		ChromeOptions opt=new ChromeOptions();
		
		File src=new File("C:\\Users\\I4750\\Desktop\\Sel\\WorkSpace\\SeleniumWebDriver\\plugins\\SelectorsHub.crx");
		File src1=new File("C:\\Users\\I4750\\Desktop\\Sel\\WorkSpace\\SeleniumWebDriver\\plugins\\AdBlock.crx");

	    opt.addExtensions(src,src1);
				
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		System.out.println("current URL is "+driver.getCurrentUrl());
		
	}

}
