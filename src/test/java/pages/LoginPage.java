package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(how = How.XPATH , using ="//img[contains(@src, 'logo')]")
	public WebElement logo;
	
	@FindBy(how = How.ID, using ="txtUsername")
	public WebElement username;
	
	@FindBy(how = How.ID, using ="txtPassword")
	public WebElement password;
	
	@FindBy(how = How.ID, using ="btnLogin")
	public WebElement btnLogin;
	
	@FindBy(how = How.ID, using ="spanMessage")
	public WebElement errorMessage;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
