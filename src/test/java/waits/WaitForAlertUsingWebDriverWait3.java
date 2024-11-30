package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FindElementsDemo.StaleElementReferenceException;
import helper.Utility;

public class WaitForAlertUsingWebDriverWait3 {

	public static void main(String[] args) throws InterruptedException {

	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
	  
	  
	  //default polling is 50 ms
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
      
      
      //wait.ignoring(StaleElementReferenceException.class);
      
      wait.ignoring(WebDriverException.class);
      
	  
	  //wait for alert and switch
      wait.until(ExpectedConditions.alertIsPresent());
	  
      //wait till title contains
	  wait.until(ExpectedConditions.titleContains("Confirmed"));
	  
	  //wait till url contain
	  wait.until(ExpectedConditions.urlContains("transaction"));

	  
	  //present
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("ur xpath")));
	  	  
	  //present > visible
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ur Xpath")));
	  
	  //present > visible > enable
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("ur xpath")));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
