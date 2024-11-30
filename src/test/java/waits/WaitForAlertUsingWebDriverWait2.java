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

public class WaitForAlertUsingWebDriverWait2 {

	public static void main(String[] args) throws InterruptedException {

	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
	  
	  Alert alt=new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.alertIsPresent());
	  
	  String text=alt.getText();
	  System.out.println("Text from Alert is = "+text);
	  alt.accept();
	  driver.quit();
	  
	}

}
