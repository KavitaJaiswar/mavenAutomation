package stepDefinitions;

import org.openqa.selenium.WebDriver;

import actions.TestLoginActions;
import commonAssertions.CommonAssert;
import commonMethods.CommonMeth;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.TestLoginRepo;

public class TestLoginSteps {
	
	
	WebDriver driver;
	CommonMeth cm;
	TestLoginRepo tlr;
	TestLoginActions tla;
	CommonAssert cs;
	
	String loggedinURL = "https://practicetestautomation.com/logged-in-successfully/";
	
	
	
	@Given("I open browser")
	public void i_open_browser() {
		cm = new CommonMeth();
		driver = cm.launchChrome();
		tlr = new TestLoginRepo(driver); 
		tla = new TestLoginActions(driver, tlr);
		cs = new CommonAssert(driver);
		
	    
	}

	@Given("I launch application")
	public void i_launch_application() throws Exception {
		cm.lauchTestApplication();
	  
	}

	@When("I enter valid credentails")
	public void i_enter_valid_credentails() {
		tla.enterCreds("student", "Password123"); 
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() throws Exception {
		tla.ClickLogin(); 
	}

	@Then("I validate home page redirection URL")
	public void i_validate_home_page_redirection_URL() {
	  cs.assertURL(loggedinURL, driver.getCurrentUrl());
	}

	@Then("I validate  new page contains expected text")
	public void i_validate_new_page_contains_expected_text() {
		cs.assertText("", "");
	   
	}

	@Then("I logs out and close browser")
	public void i_logs_out_and_close_browser() {
		cm.logout();
		cm.closeBrowser();

	}



}
