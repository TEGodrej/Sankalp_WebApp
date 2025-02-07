package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyTopProductTest extends BaseClass {

	
	@Test
	public void verifyTop10Functionality() {
		loginPage.userlogin();
		dashBoardPage.verifyProductGraph();
	}
	
	@Test
	public void verifyAllFunctionality() {
		loginPage.userlogin();
		dashBoardPage.getProductAll().click();
		dashBoardPage.verifyProductNameTable();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsValue() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisMonth();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeValue();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisMonth();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeShipper();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisMonth();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeWeight();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeWeight();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeShipper();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsValue() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeValue();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnPreviousYear();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeWeight();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeShipper();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsValue() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeValue();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeWeight();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeShipper();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsValue() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeValue();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsWeight() throws InterruptedException {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeValue();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductXlsx();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsShipper() throws InterruptedException {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeShipper();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductXlsx();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsValue() throws InterruptedException {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeValue();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductXlsx();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfThisMonthPeriodAndScanTypeAsWeight() throws InterruptedException {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.clickOnScanTypeDownArrow();

		dashBoardPage.clickOnScanTypeWeight();
		driverUtility.threadWait(2);
		dashBoardPage.clickOnProductDownload();
		dashBoardPage.clickOnProductXlsx();
		
		
		
	}
}
