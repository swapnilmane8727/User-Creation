package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class WaitForAlertUsingWebDriverWait {

	public static void main(String[] args) throws InterruptedException {

	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
	  
	 
	  //default polling time is = 500ms, 15 sec used below is max time before throwing exception
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	  
	  Alert alt=wait.until(ExpectedConditions.alertIsPresent());
	  
	  String text=alt.getText();
	  System.out.println("Text from Alert is = "+text);
	  alt.accept();
	  driver.quit();
	  
	  
	  
	  
	}

}
