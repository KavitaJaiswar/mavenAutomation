package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLoginRepo {
	
	WebDriver driver;

	public TestLoginRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver; 
	}
	
	
	@FindBy(xpath = "//input[@id = \"username\"]")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id = \"password\"]")
	public WebElement password;
	
	@FindBy(xpath = "//button[@id = \"submit\"]")
	public WebElement submitCTA;

}
