package waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForAlert {

	public static void main(String[] args) throws InterruptedException {

	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
	  
	  Alert alt=null;
	  	  
	  for(int i=0; i<=15; i++)
	  {		  
		  try 
		  {
			 alt=driver.switchTo().alert(); 
			  break;
	   	  } 
		  catch (NoAlertPresentException e) 
		  {
			System.out.println("Alert not found, waiting......");
			Thread.sleep(1000);
		  } 		  
	  }
	  String str=alt.getText();
	  System.out.println("Text is "+str);
	  alt.accept();
	}

}
