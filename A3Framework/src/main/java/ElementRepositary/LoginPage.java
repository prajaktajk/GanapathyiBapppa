package ElementRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(id = "Email")private WebElement emailtextbox;
	@FindBy(id = "Password") private WebElement passwordtextbox;
	@FindBy(id = "RememberMe") private WebElement remembermecheckbox;
	@FindBy(partialLinkText = "Forgot password?") private WebElement forgotpasswordlink;
	@FindBy(xpath = "//input[@class='button-1 login-button']")private WebElement loginbutton;
	
	
	
	public WebElement getEmailtextbox1() {
		return emailtextbox;
	}
	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}
	public WebElement getRemembermecheckbox() {
		return remembermecheckbox;
	}
	public WebElement getForgotpasswordlink() {
		return forgotpasswordlink;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getEmailtextbox() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement getLoginLink() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	

}
