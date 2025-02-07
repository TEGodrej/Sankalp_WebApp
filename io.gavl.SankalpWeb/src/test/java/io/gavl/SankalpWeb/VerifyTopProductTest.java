package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyTopProductTest extends BaseClass {

	
	@Test
	public void verifyTop10Functionality() {
		loginpage.userlogin();
		dashboardpage.verifyProductGraph();
	}
	
	@Test
	public void verifyAllFunctionality() {
		loginpage.userlogin();
		dashboardpage.getProductAll().click();
		dashboardpage.verifyProductNameTable();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsValue() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisMonth();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeValue();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisMonth();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeShipper();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisMonth();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeWeight();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeWeight();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeShipper();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsValue() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeValue();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnPreviousYear();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeWeight();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeShipper();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsValue() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeValue();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeWeight();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeShipper();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsValue() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeValue();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductJpg();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsWeight() throws InterruptedException {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeValue();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductXlsx();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsShipper() throws InterruptedException {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeShipper();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductXlsx();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsValue() throws InterruptedException {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeValue();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductXlsx();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfThisMonthPeriodAndScanTypeAsWeight() throws InterruptedException {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.clickOnScanTypeDownArrow();

		dashboardpage.clickOnScanTypeWeight();
		driverutility.threadWait(2);
		dashboardpage.clickOnProductDownload();
		dashboardpage.clickOnProductXlsx();
		
		
		
	}
}
