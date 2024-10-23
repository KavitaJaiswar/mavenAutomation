package commonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMeth {
	
	WebDriver driver;
	
	public WebDriver launchChrome()
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\Automation0424\\SeleniumAutomation\\lib\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  return driver;
	}
	
	public void lauchApplication() throws Exception
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
	public void login()
	{
		
	}
	
	
	public void logout()
	{
		
	}
	
	
	public void lauchTestApplication() throws Exception
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
	}

}



















