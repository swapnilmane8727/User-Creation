package FindElementsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FindElementsExample4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> allInputTag=driver.findElements(By.xpath("//input[@type='text']"));
		
	 int totalDD=driver.findElements(By.tagName("select")).size();
	 int TotalDDWithXpath=driver.findElements(By.xpath("//select")).size();	
	 int totalCheckBox=driver.findElements(By.xpath("//input[@type='radio']")).size();
	 int totalpasswordfields=driver.findElements(By.xpath("//input[@type='password']")).size();
	 
	 System.out.println(totalDD);
	 System.out.println(TotalDDWithXpath);
	 System.out.println(totalCheckBox);
	 System.out.println(totalpasswordfields);
		
	for (WebElement ele : allInputTag) 
	{
	String name=ele.getAttribute("name");
	System.out.println(name);
	}	
		
		
		
		
		
		
		
		
		
		
		
	}

	}

