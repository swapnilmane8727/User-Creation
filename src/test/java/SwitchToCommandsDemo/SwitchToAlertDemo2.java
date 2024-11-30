package SwitchToCommandsDemo;

import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlertDemo2 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//button[text()=\"Click to see after 5s\"]"));
		/*
		Write a logic to wait until alert is present max time 10sec,
		if alert is persent in 5 sec then break the loop switchToAlert > capture text > print > accept
		*/
		js.executeScript("arguments[0].click()", ele);
		
		for(int i=0; i<10; i++)
		{			
			try 
			{				
				Alert alt=driver.switchTo().alert();
				String myalt=alt.getText();
				System.out.println("Alert name is "+myalt);
				
				if (myalt.contains("code")) 
				{
					System.out.println("Pass");
				}
				else 
				{
					System.out.println("fail - text doesnt appear");
				}
				alt.accept();
				break;            
			} 
			
			catch (NoAlertPresentException e) 
			{
				System.out.println("waiting for allert to appear");
				Thread.sleep(1000);
			}
	
		}
	
	}

}
