package ObjectRepository;

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

	@FindBy(id = "Username")
	private WebElement usernameTxtFld;
	
	@FindBy(id = "Password")
	private WebElement passwordTxtfld;
	
	@FindBy(xpath = "//span[text()=' Login']")
	private WebElement loginBtn;

	public WebElement getUsernameTxtFld() {
		return usernameTxtFld;
	}

	public WebElement getPasswordTxtfld() {
		return passwordTxtfld;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}
