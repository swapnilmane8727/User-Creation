package SwitchToCommandsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo4 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		
	    String Parent_Handle=driver.getWindowHandle();
	    
	    System.out.println("Title of main page "+driver.getCurrentUrl());
	    
	    driver.switchTo().newWindow(WindowType.TAB);
	  //driver.switchTo().newWindow(WindowType.WINDOW);
	    
	    driver.get("https://ineuron-courses.vercel.app/signup");
	    
	    System.out.println(driver.getWindowHandles());
	    
	    System.out.println("Title of child page after using switchTo().newWindow "+driver.getCurrentUrl());
	    
	    driver.close();
	    
	    driver.switchTo().window(Parent_Handle);
	    
	    System.out.println("Title of main page swicth back to parent page "+driver.getCurrentUrl());
	    
		
		
	}

}
