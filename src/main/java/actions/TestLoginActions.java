package actions;

import org.openqa.selenium.WebDriver;

import objectRepository.LoginRepo;
import objectRepository.TestLoginRepo;

public class TestLoginActions {
	
	WebDriver driver;
	TestLoginRepo tlr;
	
	
	public TestLoginActions(WebDriver driver, TestLoginRepo tlr) {
		this.driver = driver;
		this.tlr = tlr;
	}
	
	
	public void enterCreds(String uname, String pass)
	{
		tlr.username.sendKeys(uname);
		tlr.password.sendKeys(pass);	
	}
	
	public void ClickLogin() throws Exception
	{
		tlr.submitCTA.click();
		Thread.sleep(2000);
	}
	

}
