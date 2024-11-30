package DesiredCap_OptionClass;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyInSelenium {

	public static void main(String[] args) {
	   
	   ChromeOptions opt=new ChromeOptions();
			
		
       Proxy proxy=new Proxy();
       proxy.setHttpProxy("192.168.2.1:8080");
       
       opt.setProxy(proxy);
		
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.cacert.org/");
		System.out.println("current URL is "+driver.getCurrentUrl());
		System.out.println("current title is "+driver.getTitle());
	
		
	}

}
