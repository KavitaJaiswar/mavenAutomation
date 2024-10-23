package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRepo {
	
	WebDriver driver;

	public LoginRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver; 
	}
	
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement username;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath = "")
	public WebElement submitCTA;
	
	
	
	
//	public WebElement username()
//	{
//		WebElement uname = driver.findElement(By.xpath("//input[@name=\\\"username\\\"]"));
//		return uname;
//	}

}













