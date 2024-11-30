package SwitchToCommandsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowDemo {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		
        String parenthandle=driver.getWindowHandle();
		System.out.println(parenthandle);
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> allhandles=driver.getWindowHandles();
		System.out.println(allhandles);
		
		List<String> allhandlesinList=new ArrayList<String>(allhandles);
		System.out.println(allhandlesinList);
		
		System.out.println("Parent handle is "+allhandlesinList.get(0));
		System.out.println("child handle is "+allhandlesinList.get(1));
		
		Thread.sleep(5000);
		
		driver.switchTo().window(allhandlesinList.get(0));
        String title1=driver.getTitle();
        System.out.println("page 1 "+title1);
        
        Thread.sleep(5000);
        
        driver.switchTo().window(allhandlesinList.get(1));
        String title2=driver.getTitle();
        System.out.println("page 2 "+title2);
        
        Thread.sleep(5000);
        
        driver.switchTo().window(allhandlesinList.get(0));
        String title3=driver.getTitle();
        System.out.println("page 2 "+title3);	
		
	}

}
