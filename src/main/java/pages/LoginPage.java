package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	// Define locators using @FindBy annotation
	@FindBy(id = "userEmail")
	private WebElement usernameField;

	@FindBy(id = "userPassword")
	private WebElement passwordField;

	@FindBy(id = "login")
	private WebElement loginButton;

	
	// Methods to interact with the elements
		public void enterUsername(String username) {
			usernameField.sendKeys(username);
		}

		public void enterPassword(String password) {
			passwordField.sendKeys(password);
		}

		public void clickLoginButton() {
			loginButton.click();
		}
		
		public  void loginIn(String username, String password) {
			usernameField.sendKeys(username);
			passwordField.sendKeys(password);
			
			loginButton.click();
			
		}
}
