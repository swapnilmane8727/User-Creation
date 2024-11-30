package extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	/*
		 @FindBy(id = "foobar") WebElement foobar;
		 @FindBy(how = How.ID, using = "foobar") WebElement foobar;
	*/
	
	@FindBy(xpath="//*[text()='Log in ']") WebElement loginButton;
	
	@FindBy(how=How.XPATH,using="//*[text()='Log in ']") WebElement loginButtonNew;

	//By loginButton=By.xpath("//*[text()='Log in ']");
	
	public LoginPage clickOnLoginButton()
	{
		
		loginButton.click();
		
		//driver.findElement(loginButton).click();
		
		//LoginPage login=new LoginPage(driver);
		
		//PageFactory.initElements(driver, LoginPage.class);
		
		//return login;
		
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
}
