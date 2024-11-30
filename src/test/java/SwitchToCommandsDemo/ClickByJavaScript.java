package SwitchToCommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByJavaScript {
	
	/*
	 * Click() in JavaScript can work with Disabled elements, Hidden elements, Covered elements
	 */

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		Thread.sleep(3000);
		/*
		document.getElementsByName("btnI")[1].click()
		*/
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('btnI')[1].click()");
		
	}

}
