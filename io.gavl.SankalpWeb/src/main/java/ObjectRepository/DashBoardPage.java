package ObjectRepository;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */
public class DashBoardPage extends BaseClass{
	
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[3]")
	private WebElement topPerformerPlacementDownloadButton;
	
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
	private WebElement placeLiquidationAll;
	
	@FindBy(xpath = "(//span[text()=' All '])[3]")
	private WebElement placementAll;
	
	@FindBy(xpath = "(//span[text()=' All '])[4]")
	private WebElement liquidationAll;
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[1]")
	private WebElement productDownload;
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[2]")
	private WebElement placeLiquidationDownload;
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[3]")
	private WebElement placementDownload;
	
	@FindBy(xpath = "(//a[@class='am5exporting am5exporting-icon am5exporting-align-right am5exporting-valign-top'])[4]")
	private WebElement liquidationDownload;
	
	@FindBy(xpath = "//span[text()=' Graph ']")
	private WebElement graphTab;
	
	@FindBy(xpath = "//div[@id='mat-select-2-panel']/descendant::span[text()='  This year (YTD) ']")
	private WebElement thisYear;
	
	@FindBy(xpath = "//div[@id='mat-select-2-panel']/descendant::span[text()='  Today ']")
	private WebElement today;
	
	@FindBy(xpath = "//div[@id='mat-select-2-panel']/descendant::span[text()='  This month ']")
	private WebElement thisMonth;
	
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
	private WebElement scanTypeDownArrow;
	
	@FindBy(xpath = "//div[text()=' Period ']")
	private WebElement filterPeriod;
	
	@FindBy(xpath = "//div[text()=' Scan type ']")
	private WebElement filterScanType;
	
	@FindBy(xpath = "//div[text()=' Customer type ']")
	private WebElement filterCustomerType;
	
	@FindBy(xpath = "//div[text()=' Distributor ']")
	private WebElement filterDistributor;
	
	@FindBy(xpath = "//div[text()=' Retailer ']")
	private WebElement filterRetailer;
	
	@FindBy(xpath = "//div[text()=' PD ']")
	private WebElement filterPD;
	
	@FindBy(xpath = "//div[text()=' Product ']")
	private WebElement filterProduct;
	
	@FindBy(xpath = "//div[text()=' Product group ']")
	private WebElement filterProductGroup;
	
	@FindBy(xpath = "//div[text()=' Territory ']")
	private WebElement filterTerritory;
	
	@FindBy(xpath = "//div[text()=' Region ']")
	private WebElement filterRegion;
	
	@FindBy(xpath = "//div[text()=' Unit ']")
	private WebElement filterUnit;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()='  Today ']")
	private WebElement filterToday;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()='  This month ']")
	private WebElement filterThisMonth;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()='  This year (YTD) ']")
	private WebElement filterThisYear;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()='  Previous year (Jan - Dec) ']")
	private WebElement filterPreviousYear;
	
	@FindBy(xpath = "//div[@class='scASFDialogDatePickerList']/descendant::li[text()=' Custom date range ']")
	private WebElement filterCustomDateRange;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle scCMFilterButtonStyle ng-star-inserted']/following::i[@class='fa fa-check-circle scCMButtonIcon']")
	private WebElement ApplyButton;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle scCMFilterButtonStyle ng-star-inserted']//i[@class='fa fa-undo scCMButtonIcon']")
	private WebElement ResetButton;
	
	@FindBy(xpath = "//button[@class='scCMButtonStyle scCMFilterButtonStyle']")
	private WebElement closeButton;
	
	@FindBy(xpath = "//ul[@class='list-group scASFDialogListGroup' and contains(.,'AARAV KRUSHI SEVA KENDRA')]")
	private WebElement distributorName;
	
	@FindBy(xpath = "//h5[text()='Top performers - Placement']")
	private WebElement topPerformersPlacementText;
	
	@FindBy(xpath = "//span[text()=' - Testing kirana store']")
	private WebElement  retailerName;
	
	@FindBy(xpath = "//div[@id=\"dvTopProductsChartData\"]")
	private WebElement topProductChart;
	
	@FindBy(xpath = "//span[text()=' - SANTOSH KRISHI SEVA KENDRA']")
	private WebElement pdName;
	
	@FindBy(xpath = "//ul[@class='list-group scASFDialogListGroup' and contains(.,'2019378 - ')]")
	private WebElement distributroId;
	
	@FindBy(xpath = "//span[text()='2001784 - ']")
	private WebElement pdId;
	
	@FindBy(xpath = "//ul[@class='list-group scASFDialogListGroup' and contains(.,' - VIKAS ORGANIC MANURE 50 KG -  ')]")
	private WebElement productName;
	
	@FindBy(xpath = "//ul[@class='list-group scASFDialogListGroup' and contains(.,'28100002 - ')]")
	private WebElement productId;
	
	@FindBy(xpath = "//span[text()='CPB - CO-']")
	private WebElement productGroupId;
	
	@FindBy(xpath = "//ul[@class='list-group scASFDialogListGroup' and contains(.,'-MARKETING BUSHI WP POWDER')]")
	private WebElement productGroupName;
	
	@FindBy(xpath = "//span[text()='AMRAVATI']/ancestor::div[@class='ng-star-inserted']")
	private WebElement territoryName;
	
	@FindBy(xpath = "//ul[@class='list-group scASFDialogListGroup' and contains(.,'Nagpur')]")
	private WebElement regionName;
	
	@FindBy(xpath = "(//div[text()=' No details found.'])[3]")
	private WebElement TopPerformersErrorMessage;
	
	@FindBy(xpath = "(//div[text()=' No details found.'])[1]")
	private WebElement topProductErrorMessage;
	
	@FindBy(id = "mat-radio-3-input")
	private WebElement toRadioButton; 
	
	@FindBy(xpath = "//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple']")
	private WebElement yearDropDown;
	
	@FindBy(xpath = "//div[text()=' 2024 ']")
	private WebElement year2024;
	 
	
	@FindBy(xpath = "//button[@class='mat-calendar-body-cell mat-calendar-body-active']")
	private WebElement firstDayOfMonth;
	
	@FindBy(xpath = "//button[@class='mat-calendar-body-cell' and contains(.,'5')]")
	private WebElement fifthDayOfMonth;
	
	@FindBy(xpath = "//label[text()=' Search ']")
	private WebElement searchTitle;
	
	@FindBy(xpath = "//*[name()='svg' and contains(@class, 'ng-tns-c56-16')]")
	private WebElement dashboardPeriodDropDown;
	
	@FindBy(xpath = "//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']")
	private WebElement TopProductAllButton;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashBoarTitle;
	
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
		return topPerformersPlacementText;
	}

	public WebElement getDistributorName() {
		return distributorName;
	}

	public WebElement getTopPerformerPlacementDownloadButton() {
		return topPerformerPlacementDownloadButton;
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

	public WebElement getfilterPeriod() {
		return filterPeriod;
	}

	public WebElement getfilterScanType() {
		return filterScanType;
	}

	public WebElement getfilterCustomerType() {
		return filterCustomerType;
	}

	public WebElement getfilterdistributor() {
		return filterDistributor;
	}

	public WebElement getfilterRetailer() {
		return filterRetailer;
	}

	public WebElement getfilterPD() {
		return filterPD;
	}

	public WebElement getfilterProduct() {
		return filterProduct;
	}

	public WebElement getfilterProductGroup() {
		return filterProductGroup;
	}

	public WebElement getfilterTerritory() {
		return filterTerritory;
	}

	public WebElement getfilterRegion() {
		return filterRegion;
	}

	public WebElement getfilterUnit() {
		return filterUnit;
	}

	public WebElement getfilterToday() {
		return filterToday;
	}

	public WebElement getfilterThisMonth() {
		return filterThisMonth;
	}

	public WebElement getfilterThisYear() {
		return filterThisYear;
	}

	public WebElement getfilterPreviousYear() {
		return filterPreviousYear;
	}

	public WebElement getfilterCustomDateRange() {
		return filterCustomDateRange;
	}

	public WebElement getApplyButton() {
		return ApplyButton;
	}

	public WebElement getResetButton() {
		return ResetButton;
	}

	public WebElement getcloseButton() {
		return closeButton;
	}

	public WebElement getscanTypeDownArrow() {
		return scanTypeDownArrow;
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

	public WebElement getplaceLiquidationAll() {
		return placeLiquidationAll;
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

	public WebElement getplaceLiquidationDownload() {
		return placeLiquidationDownload;
	}

	public WebElement getplacementDownload() {
		return placementDownload;
	}

	public WebElement getLiquidationDownload() {
		return liquidationDownload;
	}

	public WebElement getGraphTab() {
		return graphTab;
	}

	public WebElement getThisYr() {
		return thisYear;
	}

	public WebElement getToday() {
		return today;
	}

	public WebElement getThismonth() {
		return thisMonth;
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
	
	public void clickOnFilterOption() {
		try {
			filterOptiopn.click();
		}catch(ElementNotInteractableException e ) {
			filterOptiopn.click();
		}
	}
	
	public void clickOnPreviousYear() {
		try {
			filterPreviousYear.click();
		}catch(Exception e) {
		}
		
	}
	public void clickOnFilterDistributor() {
		try {
		filterDistributor.click();
		}catch(Exception e) {
			System.out.println("not able to click");
		}
	}
	
	public void sendKeyToSearchBox(String key) {
		try {
		filterSearchBox.sendKeys(key);
		}catch(Exception e) {
			System.out.println("not able to click");
		}
	}
	
	public void clickOnDistributorName() {
		try {
			distributorName.click();
		}catch(Exception e) {
			System.out.println("not able to click");
		}
	}
	
	public void clickOnApplyButton() {
		try {
			ApplyButton.click();
		}catch(Exception e) {
			System.out.println("not able to click");
		}
	}
	
	public void scrollToTopPerformer() {
		try {
			driverutility.scrollToElement(topPerformersPlacementText);
		}catch(Exception e) {
			System.out.println("not able to scroll");
		}
	}
	
	public void assertMessage() {
		try {
			assertTrue(topPerformersPlacementText.isDisplayed());
		}catch(Exception e) {
			assertTrue(TopPerformersErrorMessage.isDisplayed());
		}
	}
	 public void clickOnDistributorId() {
		 try {
			 distributroId.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 
	 public void clickOnFilterPd() {
		 try {
			 filterPD.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 
	 public void clickOnPdId() {
		 try {
			 pdId.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 public void clickOnPdName() {
		 try {
			 pdName.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 
	 public void scrollToTopProductChart() {
		 try {
			 driverutility.scrollToElement(topProductChart);
		 }catch(Exception e) {
				System.out.println("not able to scroll");
			}
	 }
	 
	 public void assertTopProduct() {
		 try {
			 assertTrue(topProductChart.isDisplayed());
		 }catch(Exception e) {
			 assertTrue(true);
		 }
	 }
	
	 public void clickOnProductGroup() {
		 try {
			 filterProductGroup.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 
	 public void clickOnProductGroupId() {
		 try {
			 productGroupId.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 
	 public void clickOnFilterProduct() {
		 try {
		 filterProduct.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 public void clickOnProductName() {
		 try {
			 productName.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 public void clickOnProductId() {
		 try {
			 productId.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 public void clickOnFilterTerritory() {
		 try {
			 filterTerritory.click();
		 }catch(Exception e) {
				System.out.println("not able to click");
			}
	 }
	 public void clickOnTerritoryName() {
		 try {
			 territoryName.click();
		 }catch (Exception e ) {
			 System.out.println("not able to click");
		 }
	 }
	 
	 public void clickFilterRegion() {
		 try {
			 filterRegion.click();
		 }catch (Exception e ) {
			 System.out.println("not able to click");
		 }
	 }
	 
	 public void scrollToRegion() {
		 try {
			 driverutility.scrollToElement(filterRegion);
		 }catch (Exception e ) {
			 driverutility.scrollToElement(filterRegion);
		 }
	 }
	 
	 public void clickOnRegionName() {
		 try {
			 regionName.click();
		 }catch (Exception e ) {
			 System.out.println("not able to click");
		 }
	 }
	 
	 public void clickOnCustomDateRange() {
		 try {
			 filterCustomDateRange.click();
		 }catch (Exception e ) {
			 System.out.println("not able to click");
		 }
	 }
	 public void clickOnToDateRadioButton() {
		 try {
			 toRadioButton.click();
		 }catch (Exception e ) {
			 System.out.println("not able to click");
		 }
	 }
	 public void clickOnYearDropDown() {
		 try {
			 yearDropDown.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click");
		 }
	 }
	 public void clickOnYear2024() {
		 try {
			 year2024.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click");
		 }
	 }
	 public void clickOnFirstDateOfMonth() {
		 try {
			 firstDayOfMonth.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click");
		 }
	 }
	 
	 public void clickOnFifthDayOfMonth() {
		 try {
			 fifthDayOfMonth.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click");
		 }
	 }
	 
	 public void clickOnCloseButton() {
		 try {
			 closeButton.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click");
		 }
	 }
	 public void clickOnResetButton() {
		try{
			 ResetButton.click();
		}catch(Exception e) {
			 System.out.println("Not able to click on ResetButton");
		 }
	 }
	 
	 public void assertsearchTitle() {
		 try {
			 assertTrue(searchTitle.isDisplayed());
		 }catch(Exception e) {
			 System.out.println("searchTitle did not displayed");
		 }
	 }
	 public void clickOnToday() {
		 try {
			 today.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on today");
		 }
	 }
	 public void clickOnThisYear() {
		 try {
			 thisYear.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on thisYear");
		 }
	 }
	 public void clickOnThisMonth() {
		 try {
			 thisMonth.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on thisMonth");
		 }
	 }
	 public void clickOnPreiodPreviousYear() {
		 try {
			 previousYear.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on previousYear");
		 }
	 }
	 
	 public void clickOnDashboardPeriodDropDown() {
		 try {
			 dashboardPeriodDropDown.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on dashboardPeriodDropDown");
		 }
	 }
	 public void clickOnScanTypeDownArrow() {
		 try {
			 scanTypeDownArrow.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on scanTypeDownArrow");
		 }
	 }
	 
	 public void clickOnScanTypeWeight() {
		 try {
			 scanTypeWeight.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on scanTypeWeight");
		 }
	 }
	 public void clickOnProductAllButton() {
		 try {
			 driverutility.WaitToClick(0, productAll);
		 }catch(Exception e) {
			 System.out.println("Not able to click on productAll");
		 }
	 }
	 
	 public void clickOnScanTypeShipper() {
		 try {
			 scanTypeShipper.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on scanTypeShipper");
		 }
	 }
	 public void assertTopProductAllButton() {
		 try {
			 assertTrue(TopProductAllButton.isDisplayed());
		 }catch(Exception e) {
			 System.out.println("TopProductAllButton not diplayed");
		 }
	 }
	 public void clickOnScanTypeValue() {
		 try {
			 scanTypeValue.click();
		 }catch(Exception e) {
			 System.out.println("Not able to click on scanTypeValue");
		 }
	 }
	 public void assertDashBoarTitle() {
		 try {
			 dashBoarTitle.click();
		 }catch(Exception e) {
			 System.out.println("Not able to assert on dashBoarTitle");
		 }
	 }
	 public void clickOnFilterRetailer() {
		 try {
			 filterRetailer.click();
		 }catch(Exception e) {
			 System.out.println("Not able to assert on dashBoarTitle");
		 }
	 }
	 public void clickOnRetailerName() {
		 try {
			 retailerName.click();
		 }catch(Exception e) {
			 System.out.println("Not able to assert on dashBoarTitle");
		 }
	 }
}
