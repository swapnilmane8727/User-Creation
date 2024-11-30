package DesiredCap_OptionClass;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download_Directory {

	public static void main(String[] args) {
	   
	   ChromeOptions opt=new ChromeOptions();
			
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("download.default_directory", "C:\\Users\\I4750\\Desktop\\Sel\\WorkSpace\\SeleniumWebDriver\\Downloads");
		
		opt.setExperimentalOption("prefs", map);
    			
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[normalize-space()=\"b.txt\"]")).click();
		
		/* Verify File download using file class */
		
		File src=new File("C:\\Users\\I4750\\Desktop\\Sel\\WorkSpace\\SeleniumWebDriver\\Downloads");
		File[] fle=src.listFiles();
		System.out.println("no of files present in download folder is "+fle.length);
		
		
	}

}
