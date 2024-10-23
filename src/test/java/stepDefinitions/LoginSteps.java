package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.LoginActions;
import commonAssertions.CommonAssert;
import commonMethods.CommonMeth;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.LoginRepo;

public class LoginSteps {
	
	WebDriver driver;
	CommonMeth cm;
	LoginActions la;
	CommonAssert ca;
	LoginRepo lr;
	
	
	@Given("User open browser")
	public void user_open_browser() {
		
		cm = new CommonMeth();
		driver = cm.launchChrome();
		lr = new LoginRepo(driver);
		la = new LoginActions(driver, lr);
		ca = new CommonAssert(driver); 
		
		
		  
	}

	@Given("User launch application")
	public void user_launch_application() throws Exception {
		cm.lauchApplication();
	
	}

	@When("User enter valid credentails")
	public void user_enter_valid_credentails() {
		la.enterCreds("Admin", "admin123");
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() throws Exception {
		la.ClickLogin();
	}

	@Then("User validate home page redirection")
	public void user_validate_home_page_redirection() {
		ca.assertTitle("OrangeHRM", driver.getTitle());
		
	}

	@Then("User validate username at top corner")
	public void user_validate_username_at_top_corner() {
	
	}

	@Then("User logs out and close browser")
	public void user_logs_out_and_close_browser() {
	    cm.logout();
		cm.closeBrowser();
	}
	
	@When("User enter valid username as {string} and password as {string}")
	public void user_enter_valid_username_as_and_password_as(String uname, String pass) {
		
		la.enterCreds(uname, pass);
		System.out.println(uname+"  "+pass);
	  
	}

}


















