package commonAssertions;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonAssert {
	
	WebDriver driver;

	public CommonAssert(WebDriver driver) {
		this.driver = driver;
	}
	
	

	public void assertTitle(String expTitle, String actTitle)
	{
		if(expTitle.equals(actTitle))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title mismatched");
		}
		Assert.assertEquals(expTitle, actTitle);
		
	}
	
	
	public void assertURL(String expURL, String actURL)
	{
		if(expURL.equals(actURL))
		{
			System.out.println("URL matched" + actURL );
		}
		else
		{
			System.out.println("URL mismatched" + actURL);
		}
		Assert.assertEquals(expURL, actURL);
		
	}
	
	
	
	public void assertText(String expText, String actText)
	{
		if(expText.equals(actText))
		{
			System.out.println("URL matched" + actText );
		}
		else
		{
			System.out.println("URL mismatched" + actText);
		}
		Assert.assertEquals(expText, actText);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
