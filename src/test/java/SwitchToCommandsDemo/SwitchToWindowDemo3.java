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
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo3 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		
		String Parent_Handle=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,\"linkedin\")]")).click();
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		
		Iterator<String> itr=allWindowHandles.iterator();
		
		while(itr.hasNext())
		{
			String Child=itr.next();
			
			if(!Parent_Handle.equals(Child));			
			{
				driver.switchTo().window(Child);
				String title=driver.getTitle();
				System.out.println("Title of application is "+title);
				driver.close();
			}
							
		}
		
		Thread.sleep(3000);
		
		driver.switchTo().window(Parent_Handle);
		
		System.out.println("Main application title "+driver.getTitle());
		
		driver.quit();

		
	}

}
