package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextfield;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextfield;
	
	@FindBy(id="Email")
	private WebElement emailTextfield;
	
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpasswordTextfield;
	
	@FindBy(id="register-button")
	private WebElement registerButton;

	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getConfirmpasswordTextfield() {
		return confirmpasswordTextfield;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	

}
