package waits;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice_SS {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.get("https://x.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	//TakesScreenshot ts=(TakesScreenshot) driver;	
	//File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//File destination=new File("./Practicess1.png");
	
	try 
	{
		FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./Practicess1.png"));
	} 
	catch (IOException e) 
	{
		System.out.println("Something went wrong "+e.getMessage());
	}
	driver.quit();


	}

}
