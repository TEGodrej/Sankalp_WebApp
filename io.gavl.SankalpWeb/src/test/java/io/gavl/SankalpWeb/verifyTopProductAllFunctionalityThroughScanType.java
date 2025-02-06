package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class verifyTopProductAllFunctionalityThroughScanType extends BaseClass{
	
	@Test
	public void verifyTopProductAllFunctionalityThroughWeightScanType() {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisMonth();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.assertTopProductAllButton();
	}
	
	@Test
	public void verifyTopProductAllFunctionalityThroughShipperScanType() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		
		dashboardpage.clickOnThisMonth();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnScanTypeShipper();
		dashboardpage.clickOnProductAllButton();
			dashboardpage.assertTopProductAllButton();
	}
	
	@Test
	public void verifyTopProductAllFunctionalityThroughValueScanType() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisMonth();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnScanTypeValue();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughWeightScanType() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnScanTypeWeight();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}
	
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughShipperScanType() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnScanTypeShipper();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}
	
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughValueScanType() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnScanTypeValue();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughWeightScanType() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnPreiodPreviousYear();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnScanTypeWeight();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughShipperScanType() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnScanTypeShipper();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
		
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughValueScanType() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();
		dashboardpage.clickOnScanTypeValue();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}

}
