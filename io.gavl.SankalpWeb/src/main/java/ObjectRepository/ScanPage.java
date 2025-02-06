package ObjectRepository;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScanPage {
	WebDriver driver;
	public ScanPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//mat-label[text()='Placement']")
	private WebElement placementTab;
	
	@FindBy(xpath = "//mat-label[text()='Liquidation']")
	private WebElement liquidationTab;
	
	@FindBy(xpath = "//span[text()='BALAJI KRUSHI SEVA - DHAMANGAON']")
	private WebElement customerName;
	
	@FindBy(xpath = "//span[text()='Product groupwise - BALAJI KRUSHI SEVA - DHAMANGAON]")
	private WebElement prdouctGroupWiseCustomerName;
	
	@FindBy(xpath = "//*[name()='svg' and contains(@class, 'ng-tns-c56-8')]")
	private WebElement scanPeriodDropDown;
	
	@FindBy(xpath = "//div[@id='mat-select-6-panel']/descendant::span[text()='  Today ']")
	private WebElement scanPeriodToday;
	
	@FindBy(xpath = "//div[@id='mat-select-6-panel']/descendant::span[text()='  This month ']")
	private WebElement scanPeriodThisMonth;
	
	@FindBy(xpath = "//div[@id='mat-select-6-panel']/descendant::span[text()='  This year (YTD) ']")
	private WebElement scanPeriodThisYear;
	
	@FindBy(xpath = "//div[@id='mat-select-6-panel']/descendant::span[text()='  Previous year (Jan - Dec) ']")
	private WebElement scanPeriodPreviousYear;
	
	@FindBy(xpath = "//span[text()=' Liquidation overview ']")
	private WebElement liquidationTitle;
	
	public void clickOnLiquidationTab() {
		try {
			liquidationTab.click();
		}catch(Exception e) {
			System.out.println("Not able To Click");
		}
	}
	
	public void clickOnPlacementTab() {
		try {
			placementTab.click();
		}catch(Exception e) {
			System.out.println("Not able To Click");
		}
	}
	
	public void clickOnCustomerName() {
		try {
			customerName.click();
		}catch(Exception e) {
			System.out.println("Not able To Click");
		}
	}
	
	public void clickOnScanPeriodDropDown() {
		try {
			scanPeriodDropDown.click();
		}catch(Exception e) {
			System.out.println("Not able To Click");
		}
	}
	
	public void clickOnScanPeriodToday() {
		try {
			scanPeriodToday.click();
		}catch(Exception e) {
			System.out.println("Not able To Click");
		}
	}
	public void clickOnScanPeriodThisMonth() {
		try {
			scanPeriodThisMonth.click();
		}catch(Exception e) {
			System.out.println("Not able To Click");
		}
	}
	
	public void clickOnScanPeriodThisYear() {
		try {
			scanPeriodThisYear.click();
		}catch(Exception e) {
			System.out.println("Not able To Click");
		}
	}
	public void clickOnScanPeriodPreviousYear() {
		try {
			scanPeriodPreviousYear.click();
		}catch(Exception e) {
			System.out.println("Not able To Click");
		}
	}
	public void assertLiquidationTitle() {
		try {
			assertTrue(liquidationTitle.isDisplayed());
		}catch(Exception e) {
			System.out.println("Not Displayed");
		}
	}
	public void assertPrdouctGroupWiseCustomerName() {
		try {
              assertTrue(prdouctGroupWiseCustomerName.isDisplayed());
		}catch(Exception e) {
			System.out.println("Not Displayed");
		}
	}
}
