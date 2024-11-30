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

public class SwitchToWindowDemo2 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> allhandles=driver.getWindowHandles();
		
		List<String> allhandlesinList=new ArrayList<String>(allhandles);
		System.out.println(allhandlesinList);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(allhandlesinList.get(0));
		
	}

}
