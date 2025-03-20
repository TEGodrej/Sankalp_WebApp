package io.gavl.SankalpWeb;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyTopProductAllFunctionalityThroughScanTypeTest extends BaseClass{
	
	@Test
	public void verifyTopProductAllFunctionalityThroughWeightScanType() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisMonth();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.assertTopProductAllButton();
	}
	
	@Test
	public void verifyTopProductAllFunctionalityThroughShipperScanType() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		
		dashBoardPage.clickOnThisMonth();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnScanTypeShipper();
		dashBoardPage.clickOnProductAllButton();
			dashBoardPage.assertTopProductAllButton();
	}
	
	@Test
	public void verifyTopProductAllFunctionalityThroughValueScanType() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisMonth();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnScanTypeValue();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughWeightScanType() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnScanTypeWeight();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}
	
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughShipperScanType() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnScanTypeShipper();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}
	
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughValueScanType() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnScanTypeValue();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughWeightScanType() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnPreiodPreviousYear();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnScanTypeWeight();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughShipperScanType() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnScanTypeShipper();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
		
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughValueScanType() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();
		dashBoardPage.clickOnScanTypeValue();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}

}
