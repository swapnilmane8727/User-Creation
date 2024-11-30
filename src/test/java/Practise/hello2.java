package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class hello2 {

	public static void main(String[] args) throws InterruptedException {

       WebDriver driver=new ChromeDriver();
       driver.get("https://ineuron-courses.vercel.app/login");
       driver.manage().window().maximize();
       Thread.sleep(10000);
       driver.findElement(By.name("email1")).sendKeys("ineuron@ineuron.ai");
       driver.findElement(By.name("password1")).sendKeys("ineuron");
       driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
       
      
      String url=driver.getCurrentUrl();
      url.contains("https://ineuron-courses.vercel.app/");
      

		
		
	}

}
