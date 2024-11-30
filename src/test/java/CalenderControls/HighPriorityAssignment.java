package CalenderControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HighPriorityAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();
		
		driver.findElement(By.name("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.name("password1")).sendKeys("ineuron");
		driver.findElement(By.className("submit-btn")).click();
		
		Thread.sleep(6000);
		
		WebElement element=driver.findElement(By.xpath("//span[text()=\"Manage\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//span[text()=\"Manage Courses\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("course_select_64e886ec5c37643fc3b571ea")).click();
		driver.findElement(By.xpath("//button[text()=\"Add New Course \"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\I4750\\Downloads\\nature.jpg");
		driver.findElement(By.name("name")).sendKeys("Selenium");
		driver.findElement(By.id("description")).sendKeys("Need to switch job ASAP");
		driver.findElement(By.name("instructorName")).sendKeys("Swapnil");
		driver.findElement(By.name("price")).clear();
		driver.findElement(By.name("price")).sendKeys("108");
		
		driver.findElement(By.name("startDate")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()=\"25\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("endDate")).click();
		driver.findElement(By.xpath("//div[text()=\"28\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Select Category']")).click();
		 driver.findElement(By.xpath("//button[text()=\"Selenium\"]")).click();

        Thread.sleep(3000);
        
	    driver.findElement(By.xpath("//button[text()='Save']"));
		
		
		
		
		
		
		
	}

}
