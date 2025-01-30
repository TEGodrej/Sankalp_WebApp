package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class changePasswordPage {
	
	WebDriver driver;
	public changePasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "mat-input-3")
	private WebElement oldPaswrdFld;
	
	@FindBy(id = "mat-input-4")
	private WebElement newPaswrdFld;
	
	@FindBy(id = "mat-input-5")
	private WebElement confrmPaswrdFld;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle' and contains(text(),' Change password')]")
	private WebElement changePaswrdBtn;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle' and contains(text(),'Close ')]")
	private WebElement closeBtn;

	public WebElement getOldPaswrdFld() {
		return oldPaswrdFld;
	}

	public WebElement getNewPaswrdFld() {
		return newPaswrdFld;
	}

	public WebElement getConfrmPaswrdFld() {
		return confrmPaswrdFld;
	}

	public WebElement getChangePaswrdBtn() {
		return changePaswrdBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
	
}
