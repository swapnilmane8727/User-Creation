package waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import FindElementsDemo.StaleElementReferenceException;
import helper.Utility;

public class WaitForAlertUsingWebDriverWait4 {

	public static void main(String[] args) throws InterruptedException {

	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//button[text()=\"Click me to start timer\"]")).click();
	  
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	  
	  wait.ignoring(WebDriverException.class);
	  wait.pollingEvery(Duration.ofSeconds(1));
	  wait.withTimeout(Duration.ofSeconds(20));
	  
	  wait.until(new Function<WebDriver, WebElement>() {

		public WebElement apply(WebDriver wd) 
		{
			WebElement element=driver.findElement(By.xpath("//p[@id=\"demo\"]"));
			String text=element.getText();
			
			if (text.contains("WebDriver")) 
			{
				System.out.println("element found");
				return element;
			}
			else 
			{
				System.out.println("current text is "+text);
				return null;
			}
			
		}
		});
	  
}
}