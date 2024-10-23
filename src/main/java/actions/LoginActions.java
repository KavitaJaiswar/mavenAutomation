package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import objectRepository.LoginRepo;

public class LoginActions {
	
	
	WebDriver driver;
	LoginRepo lr;
	
	public LoginActions(WebDriver driver, LoginRepo lr) {
		this.driver = driver;
		this.lr = lr;
	}
	
	
	public void enterCreds(String uname, String pass)
	{
		lr.username.sendKeys(uname);
		lr.password.sendKeys(pass);	
	}
	
	public void ClickLogin() throws Exception
	{
		lr.submitCTA.click();
		Thread.sleep(2000);
	}
	
	
	

}
