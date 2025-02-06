package ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.utils.FileUtil;

import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Username")
	private WebElement usernameTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//span[text()=' Login']")
	private WebElement loginButton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
		public void userlogin( String userName, String password) {
			try {
			FileUtility.propertyFile();
//			FileUtility.getProperty(userName);
//			FileUtility.getProperty(password);
//			usernameTextField.sendKeys(FileUtility.getProperty(userName));
//			Thread.sleep(Duration.ofSeconds(2));
//			passwordTextField.sendKeys(FileUtility.getProperty(password));
//			loginButton.click();
		}catch(Exception e) {
			
		}
	}
	
	
	
}
