package CalenderControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class LiveAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("swapnil");
		driver.findElement(By.name("email")).sendKeys("swapnil6@gmail.com");
		driver.findElement(By.name("password")).sendKeys("manehello");
		
		Thread.sleep(5000);
		/*
		 * // Create instance of JavaScript executor
		 * 
		 * JavascriptExecutor je=(JavascriptExecutor) driver;
		 * 
		 * // Identify the Web element which will appear after scrolling down
		 * 
		 * WebElement element=driver.findElement(By.xpath(
		 * "//input[@value='63b960389ef2df6d563d5774']"));
		 * 
		 * // Now execute query which actually will scroll until that element is not
		 * appeared on page
		 * 
		 * je.executeScript("arguments[0].scrollIntoView(true);", element);
		 * 
		 * element.click();
		 */
		
	
	    driver.findElement(By.xpath("//input[@value='63b960389ef2df6d563d5774']")).click();
		driver.findElement(By.id("gender")).click();
		
		Select  sct=new Select(driver.findElement(By.name("state")));
		sct.selectByValue("Karnataka");
		
		driver.findElement(By.className("submit-btn")).click();
		
		Thread.sleep(5000);
        
		driver.findElement(By.name("email1")).sendKeys("swapnil6@gmail.com");
		driver.findElement(By.name("password1")).sendKeys("manehello");
		driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
		
		WebElement text=driver.findElement(By.xpath("//a[text()=\"Practise\"]"));
		String text1=text.getText();
		System.out.println("User has successfully logged in "+text1);

	}

}
