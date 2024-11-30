package SwitchToCommandsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlertDemo {

	public static void main(String[] args) throws InterruptedException {

		/*		
		Alert - Info
		     alert("I know JS")
		     		
		Confirm
		     confirm - accept, dismiss		     
		
		prompt
		       - enter names/details				
		*/
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//button[text()=\"Click to show\"]"));
		js.executeScript("arguments[0].click()", ele);		
		
		Alert alt=driver.switchTo().alert();
		
		
		Thread.sleep(3000);
		
		String text=alt.getText();
		System.out.println(text);
		
		// to accept the alert
		alt.accept();	
	
		
		
		
	}

}
