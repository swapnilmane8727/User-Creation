package CalenderControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\I4750\\Downloads\\Incorrect Ordinal indicator.jpg");
		
		driver.findElement(By.id("file-submit")).click();
		
		Thread.sleep(2000);
		
		 WebElement text=driver.findElement(By.xpath("//div[@class='example']//h3"));
		 
		String nme=text.getText();
		
		if (nme.contains("File Uploaded!")) 
		{			
			System.out.println("File is uploaded");
		}
		
		
		
		
		
		
	}

}
