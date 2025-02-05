package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {
	
	WebDriver driver;
	public ChangePasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "mat-input-3")
	private WebElement oldPasawordField;
	
	@FindBy(id = "mat-input-4")
	private WebElement newPasswordField;
	
	@FindBy(id = "mat-input-5")
	private WebElement confirmPasswordField;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle' and contains(text(),' Change password')]")
	private WebElement changePasswordButton;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle' and contains(text(),'Close ')]")
	private WebElement closeButton;

	public WebElement getoldPasawordField() {
		return oldPasawordField;
	}

	public WebElement getnewPasswordField() {
		return newPasswordField;
	}

	public WebElement getconfirmPasswordField() {
		return confirmPasswordField;
	}

	public WebElement getchangePasswordButton() {
		return changePasswordButton;
	}

	public WebElement getCloseBtn() {
		return closeButton;
	}
	
	
}
