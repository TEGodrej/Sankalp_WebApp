package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMenuPage {
	
	WebDriver driver;
	
	public SideMenuPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//mat-label[text()='Scan']")
	private WebElement scanTab;
	
	@FindBy(xpath = "//mat-label[text()='Points']")
	private WebElement pointsTab;
	
	@FindBy(xpath = "//mat-label[text()='Notification']")
	private WebElement notificationTab;
	
	@FindBy(xpath = "//mat-label[text()='Label ID']")
	private WebElement labelIdTab;
	
	@FindBy(xpath = "//mat-label[text()='Master data']")
	private WebElement masterDataTab;
	
	@FindBy(xpath = "//mat-label[text()='Operation']")
	private WebElement operationTab;
	
	@FindBy(xpath = "//mat-label[text()='Batch details']")
	private WebElement batchDetailsTab;
	
	@FindBy(xpath = "//mat-label[text()='Dispatch']")
	private WebElement dispatchTab;
	
	@FindBy(xpath = "//mat-label[text()='Returns']")
	private WebElement returnsTab;

	public WebElement getScanTab() {
		return scanTab;
	}

	public WebElement getPointsTab() {
		return pointsTab;
	}

	public WebElement getNotificationTab() {
		return notificationTab;
	}

	public WebElement getLabelIdTab() {
		return labelIdTab;
	}

	public WebElement getMasterDataTab() {
		return masterDataTab;
	}

	public WebElement getOperationTab() {
		return operationTab;
	}

	public WebElement getBatchDetailsTab() {
		return batchDetailsTab;
	}

	public WebElement getDispatchTab() {
		return dispatchTab;
	}

	public WebElement getReturnsTab() {
		return returnsTab;
	}
	
	
}
