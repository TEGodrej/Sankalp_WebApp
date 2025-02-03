package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * @author Testing Engineer
 */
public class DashBoardPage {
	
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[3]")
	private WebElement topPerformerPlacementDownloadBtn;
	
	
	
	
	
	@FindBy(xpath = "//input[@id='SearchTextForList']")
	private WebElement filterSearchBox;
	
	@FindBy(xpath = "(//span[@title='Advanced filters'])[1]")
	private WebElement filterOptiopn;

	@FindBy(xpath = "//mat-icon[text()='lock']")
	private WebElement lockIcon;
	
	@FindBy(xpath = "(//div[@class='scFs-20 d-flex align-items-center']/descendant::span[@class='scLNDBCenterXY scLNDDBSelectedTab ng-star-inserted' and contains(text(),' Top 10 ')])[1]")
	private WebElement productsTop10;
	
	@FindBy(xpath = "(//div[@class='scFs-20 d-flex align-items-center']/descendant::span[@class='scLNDBCenterXY scLNDDBSelectedTab ng-star-inserted' and contains(text(),' Top 10 ')])[2]")
	private WebElement placementTop10;
	
	@FindBy(xpath = "(//div[@class='scFs-20 d-flex align-items-center']/descendant::span[@class='scLNDBCenterXY scLNDDBSelectedTab ng-star-inserted' and contains(text(),' Top 10 ')])[3]")
	private WebElement liquidationTop10;
	
	@FindBy(xpath = "(//span[text()=' All '])[1]")
	private WebElement productAll;
	
	@FindBy(xpath = "(//span[text()=' All '])[2]")
	private WebElement placliquiAll;
	
	@FindBy(xpath = "(//span[text()=' All '])[3]")
	private WebElement placementAll;
	
	@FindBy(xpath = "(//span[text()=' All '])[4]")
	private WebElement liquidationAll;
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[1]")
	private WebElement productDownload;
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[2]")
	private WebElement placLiquiDwnlod;
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[3]")
	private WebElement placementdownload;
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[4]")
	private WebElement liquidationDownload;
	
	@FindBy(xpath = "//span[text()=' Graph ']")
	private WebElement graphTab;
	
	@FindBy(xpath = "//div[@id='mat-select-2-panel']/descendant::span[text()='  This year (YTD) ']")
	private WebElement thisYr;
	
	@FindBy(xpath = "//div[@id='mat-select-2-panel']/descendant::span[text()='  Today ']")
	private WebElement today;
	
	@FindBy(xpath = "//div[@id='mat-select-2-panel']/descendant::span[text()='  This month ']")
	private WebElement thismonth;
	
	@FindBy(xpath = "//div[@id='mat-select-2-panel']/descendant::span[text()='  Previous year (Jan - Dec) ']")
	private WebElement previousYear;
	
	@FindBy(xpath = "//div[@id='mat-select-4-panel']/descendant::span[text()=' Weight (kg / lt) ']")
	private WebElement scanTypeWeight;
	
	@FindBy(xpath = "//div[@id='mat-select-4-panel']/descendant::span[text()=' Shipper ']")
	private WebElement scanTypeShipper;
	
	@FindBy(xpath = "//div[@id='mat-select-4-panel']/descendant::span[text()=' Value (Mio) ']")
	private WebElement scanTypeValue;
	
	@FindBy(xpath = "(//div[@aria-label='Placement; Press ENTER to toggle'])[1]")
	private WebElement productPlacement;
	
	@FindBy(xpath = "(//div[@aria-label='Liquidation; Press ENTER to toggle'])[1]")
	private WebElement productLiquidation;
	
	@FindBy(xpath = "(//div[@aria-label='Liquidation; Press ENTER to toggle'])[2]")
	private WebElement timelineLiquidation;
	
	@FindBy(xpath = "(//div[@aria-label='Placement; Press ENTER to toggle'])[2]")
	private WebElement timelinePlacement;
	
	@FindBy(xpath = "(//a[text()='JPG'])[1]")
	private WebElement productJpg;
	
	@FindBy(xpath = "(//a[text()='JPG'])[2]")
	private WebElement timelineJpg;
	
	@FindBy(xpath = "(//a[text()='JPG'])[3]")
	private WebElement PlacementJpg;
	

	@FindBy(xpath = "(//a[text()='JPG'])[4]")
	private WebElement liquidationJpg;
	
	@FindBy(xpath = "//span[text()='All']")
	private WebElement custAll;
	
	@FindBy(xpath = "//span[text()=' Retailer ']")
	private WebElement retailer;
	
	@FindBy(xpath = "//span[text()=' Distributor ']")
	private WebElement distibutor;
	
	@FindBy(xpath = "//span[text()=' PD ']")
	private WebElement pd;
	
	@FindBy(xpath = "(//a[text()='XLSX'])[1]")
	private WebElement productXlsx;
	
	@FindBy(xpath = "(//a[text()='XLSX'])[2]")
	private WebElement timelineXlsx;
	
	@FindBy(xpath = "(//a[text()='XLSX'])[3]")
	private WebElement TPPxlsx;
	
	@FindBy(xpath = "(//a[text()='XLSX'])[4]")
	private WebElement TPLxlsx;
	
	@FindBy(xpath = "//*[name()='svg' and contains(@class,'ng-tns-c56-6')]")
	private WebElement scanTypeDnArrow;
	
	@FindBy(xpath = "//div[text()=' Period ']")
	private WebElement fPeriod;
	
	@FindBy(xpath = "//div[text()=' Scan type ']")
	private WebElement fScanType;
	
	@FindBy(xpath = "//div[text()=' Customer type ']")
	private WebElement fCustomerType;
	
	@FindBy(xpath = "//div[text()=' Distributor ']")
	private WebElement fdistributor;
	
	@FindBy(xpath = "//div[text()=' Retailer ']")
	private WebElement fRetailer;
	
	@FindBy(xpath = "//div[text()=' PD ']")
	private WebElement fPD;
	
	@FindBy(xpath = "//div[text()=' Product ']")
	private WebElement fProduct;
	
	@FindBy(xpath = "//div[text()=' Product group ']")
	private WebElement fProductGroup;
	
	@FindBy(xpath = "//div[text()=' Territory ']")
	private WebElement fTerritory;
	
	@FindBy(xpath = "//div[text()=' Region ']")
	private WebElement fRegion;
	
	@FindBy(xpath = "//div[text()=' Unit ']")
	private WebElement fUnit;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()='  Today ']")
	private WebElement fToday;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()='  This month ']")
	private WebElement fThisMonth;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()='  This year (YTD) ']")
	private WebElement fThisYear;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()='  Previous year (Jan - Dec) ']")
	private WebElement fPreviousYear;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()=' Custom date range ']")
	private WebElement fCustomDateRange;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle scCMFilterButtonStyle ng-star-inserted']/following::i[@class='fa fa-check-circle scCMButtonIcon']")
	private WebElement ApplyBtn;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle scCMFilterButtonStyle ng-star-inserted']//i[@class='fa fa-undo scCMButtonIcon']")
	private WebElement ResetBtn;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle scCMFilterButtonStyle']")
	private WebElement closeBtn;
	
	@FindBy(xpath = "//span[text()='- AARAV KRUSHI SEVA KENDRA']")
	private WebElement distributorName;
	
	@FindBy(xpath = "//div[@id='dvTopPlacementPerformersChart']")
	private WebElement topPerformerChart;
	
	@FindBy(xpath = "//span[text()=' - Testing kirana store']")
	private WebElement  retailerName;
	
	@FindBy(xpath = "//div[@id=\"dvTopProductsChartData\"]")
	private WebElement topProductChart;
	
	@FindBy(xpath = "//span[text()=' - SANTOSH KRISHI SEVA KENDRA']")
	private WebElement pdName;
	
	@FindBy(xpath = "//span[text()='2019378 - ']")
	private WebElement distributroId;
	
	@FindBy(xpath = "//span[text()='2001784 - ']")
	private WebElement pdId;
	
	@FindBy(xpath = "//span[text()=' - HITWEED - 100 ml  - 0.1000 L']")
	private WebElement productName;
	
	@FindBy(xpath = "//span[text()='28130000 - ']")
	private WebElement productId;
	
	@FindBy(xpath = "//span[text()='CPB - CO-']")
	private WebElement productGroupId;
	
	@FindBy(xpath = "//span[text()='GAVL HITWEED LIQUID']/ancestor::div[@class='ng-star-inserted']")
	private WebElement productGroupName;
	
	@FindBy(xpath = "//span[text()='AMRAVATI']/ancestor::div[@class='ng-star-inserted']")
	private WebElement territoryName;
	
	@FindBy(xpath = "//span[text()='Nagpur']")
	private WebElement regionName;
	
	
	public WebElement getRegionName() {
		return regionName;
	}

	public WebElement getTerritoryName() {
		return territoryName;
	}

	public WebElement getProductGroupId() {
		return productGroupId;
	}

	public WebElement getProductGroupName() {
		return productGroupName;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductId() {
		return productId;
	}

	public WebElement getPdId() {
		return pdId;
	}

	public WebElement getDistributroId() {
		return distributroId;
	}

	public WebElement getPdName() {
		return pdName;
	}

	public WebElement getTopProductChart() {
		return topProductChart;
	}

	public WebElement getRetailerName() {
		return retailerName;
	}

	public WebElement getTopPerformerChart() {
		return topPerformerChart;
	}

	public WebElement getDistributorName() {
		return distributorName;
	}

	public WebElement getTopPerformerPlacementDownloadBtn() {
		return topPerformerPlacementDownloadBtn;
	}

	public WebElement getFilterSearchBox() {
		return filterSearchBox;
	}

	public WebElement getScanTypeWeight() {
		return scanTypeWeight;
	}

	public WebElement getScanTypeShipper() {
		return scanTypeShipper;
	}

	public WebElement getScanTypeValue() {
		return scanTypeValue;
	}

	public WebElement getfPeriod() {
		return fPeriod;
	}

	public WebElement getfScanType() {
		return fScanType;
	}

	public WebElement getfCustomerType() {
		return fCustomerType;
	}

	public WebElement getFdistributor() {
		return fdistributor;
	}

	public WebElement getfRetailer() {
		return fRetailer;
	}

	public WebElement getfPD() {
		return fPD;
	}

	public WebElement getfProduct() {
		return fProduct;
	}

	public WebElement getfProductGroup() {
		return fProductGroup;
	}

	public WebElement getfTerritory() {
		return fTerritory;
	}

	public WebElement getfRegion() {
		return fRegion;
	}

	public WebElement getfUnit() {
		return fUnit;
	}

	public WebElement getfToday() {
		return fToday;
	}

	public WebElement getfThisMonth() {
		return fThisMonth;
	}

	public WebElement getfThisYear() {
		return fThisYear;
	}

	public WebElement getfPreviousYear() {
		return fPreviousYear;
	}

	public WebElement getfCustomDateRange() {
		return fCustomDateRange;
	}

	public WebElement getApplyBtn() {
		return ApplyBtn;
	}

	public WebElement getResetBtn() {
		return ResetBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getScanTypeDnArrow() {
		return scanTypeDnArrow;
	}

	public WebElement getProductXlsx() {
		return productXlsx;
	}

	public WebElement getTimelineXlsx() {
		return timelineXlsx;
	}

	public WebElement getTPPxlsx() {
		return TPPxlsx;
	}

	public WebElement getTPLxlsx() {
		return TPLxlsx;
	}

	public WebElement getLockIcon() {
		return lockIcon;
	}

	public WebElement getProductsTop10() {
		return productsTop10;
	}

	public WebElement getPlacementTop10() {
		return placementTop10;
	}

	public WebElement getLiquidationTop10() {
		return liquidationTop10;
	}

	public WebElement getProductAll() {
		return productAll;
	}

	public WebElement getPlacliquiAll() {
		return placliquiAll;
	}

	public WebElement getPlacementAll() {
		return placementAll;
	}

	public WebElement getLiquidationAll() {
		return liquidationAll;
	}

	public WebElement getProductDownload() {
		return productDownload;
	}

	public WebElement getPlacLiquiDwnlod() {
		return placLiquiDwnlod;
	}

	public WebElement getPlacementdownload() {
		return placementdownload;
	}

	public WebElement getLiquidationDownload() {
		return liquidationDownload;
	}

	public WebElement getGraphTab() {
		return graphTab;
	}

	public WebElement getThisYr() {
		return thisYr;
	}

	public WebElement getToday() {
		return today;
	}

	public WebElement getThismonth() {
		return thismonth;
	}

	public WebElement getPreviousYear() {
		return previousYear;
	}

	public WebElement getWeight() {
		return scanTypeWeight;
	}

	public WebElement getShipper() {
		return scanTypeShipper;
	}

	public WebElement getValue() {
		return scanTypeValue;
	}

	public WebElement getProductPlacement() {
		return productPlacement;
	}

	public WebElement getProductLiquidation() {
		return productLiquidation;
	}

	public WebElement getTimelineLiquidation() {
		return timelineLiquidation;
	}

	public WebElement getTimelinePlacement() {
		return timelinePlacement;
	}

	public WebElement getProductJpg() {
		return productJpg;
	}

	public WebElement getTimelineJpg() {
		return timelineJpg;
	}

	public WebElement getPlacementJpg() {
		return PlacementJpg;
	}

	public WebElement getLiquidationJpg() {
		return liquidationJpg;
	}

	public WebElement getCustAll() {
		return custAll;
	}

	public WebElement getRetailer() {
		return retailer;
	}

	public WebElement getDistibutor() {
		return distibutor;
	}

	public WebElement getPd() {
		return pd;
	}
	
	public WebElement getFilterOptiopn() {
		return filterOptiopn;
	}
	
	
	
}
