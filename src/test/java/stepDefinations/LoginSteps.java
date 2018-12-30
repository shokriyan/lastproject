package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import pages.LoginPage;
import utility.SetupClass;

public class LoginSteps extends SetupClass{
	
	LoginPage login ; 
	@Given("^OrangeHRM logo should displayed$")
	public void orangehrm_logo_should_displayed() throws Throwable {
		login = new LoginPage(driver);
		
		boolean exist = login.logo.isDisplayed();
		Assert.assertTrue(exist);
	}


}
