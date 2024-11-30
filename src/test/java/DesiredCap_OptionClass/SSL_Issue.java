package DesiredCap_OptionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_Issue {

	public static void main(String[] args) {

		/*
		 * How to handle SSL Certificates
		 * How to handle secure application
		 * How to handle insecure certificae
		 * How to handle https application
		 * How to handle invalid certificate
		 * 
		 */
		
		
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setAcceptInsecureCerts(true);
		
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.cacert.org/");
		System.out.println("current URL is "+driver.getCurrentUrl());
		System.out.println("current title is "+driver.getTitle());
		
		
		
		
		
		
		
		
		
	}

}
