package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class usercreation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
		
		boolean statusBefore=driver.findElement(By.className("submit-btn")).isEnabled();
		System.out.println("Status before entering values "+statusBefore);
		
		driver.findElement(By.name("name")).sendKeys("Swapnil");
		driver.findElement(By.name("email")).sendKeys("swapnilmane2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456788");
		driver.findElement(By.xpath("//label[text()='Testing']")).click();
		
        WebElement element=driver.findElement(By.name("gender"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		
		WebElement element1=driver.findElement(By.id("state"));
		js.executeScript("arguments[0].click()", element1);
		
		Select sel=new Select(driver.findElement(By.id("state")));
		sel.selectByVisibleText("Karnataka");
		
		boolean statusAfter=driver.findElement(By.className("submit-btn")).isEnabled();
		System.out.println("Status After entering values "+statusAfter);
		
	    WebElement element2=driver.findElement(By.className("submit-btn"));
	    js.executeScript("arguments[0].click()", element2);
		
	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("email1")).sendKeys("swapnilmane2@gmail.com");
	    driver.findElement(By.name("password1")).sendKeys("123456788");
	    driver.findElement(By.className("submit-btn")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//button[text()=\"Sign out\"]")).click();
		
		
		
	}

}
