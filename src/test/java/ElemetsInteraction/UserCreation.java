package ElemetsInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserCreation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Swapnil");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Mane");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8904646214");
		driver.findElement(By.id("password_step_input")).sendKeys("aksdjdj");
		
		WebElement daydropdown=driver.findElement(By.cssSelector("select[id='day']"));
		Select day=new Select(daydropdown);
		day.selectByValue("20");
		
		WebElement monthdropdown=driver.findElement(By.cssSelector("select[title='Month']"));
		Select month=new Select(monthdropdown);
		month.selectByVisibleText("May");
		
		WebElement yeardropdown=driver.findElement(By.cssSelector("select[title='Year']"));
		Select year=new Select(yeardropdown);
		year.selectByValue("1995");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		}
}
