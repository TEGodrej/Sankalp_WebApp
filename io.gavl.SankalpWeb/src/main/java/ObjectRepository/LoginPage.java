package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class LoginPage extends BaseClass{
	
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
	
		public void userlogin() {
			try {
				FileUtility.propertyFile();
				String userName=FileUtility.getProperty("UserName");
			usernameTextField.sendKeys(userName);
			System.out.println(userName+" has been entered as user name");
			String password = FileUtility.getProperty("Password");
			passwordTextField.sendKeys(password);
			System.out.println(password+" has been entered as password");
			
			loginButton.click();
		}catch(Exception e) {
			
		}
	}
	
	
	
}
