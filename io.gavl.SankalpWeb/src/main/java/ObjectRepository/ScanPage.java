package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScanPage {

	@FindBy(xpath = "//mat-label[text()='Placement']")
	private WebElement placementTab;
	
	@FindBy(xpath = "//mat-label[text()='Liquidation']")
	private WebElement liquidationTab;
}
