package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyTopProductAllFunctionality extends BaseClass{

	@Test
	public void verifyUserAbleToSeeTodayPeriodThroughAllSelect() {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		driverutility.threadWait(3);
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}
	
	@Test
	public void verifyUserAbleToSeeThisMonthPeriodThroughAllselect() {
		loginpage.userlogin();
		driverutility.threadWait(3);
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisMonth();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyPesticideName();
	}
	
	@Test
	public void verifyUserAbleToSeeThisYearPeriodThroughAllselect() {
		loginpage.userlogin();
		driverutility.threadWait(3);
		dashboardpage.clickOnDashboardPeriodDropDown();
		driverutility.threadWait(3);
		dashboardpage.clickOnThisYear();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}
	
	@Test
	public void verifyUserAbleToSeePreviousYearPeriodThroughAllselect() {
		loginpage.userlogin();
		driverutility.threadWait(3);
		dashboardpage.clickOnDashboardPeriodDropDown();
		driverutility.threadWait(3);
		dashboardpage.clickOnPreiodPreviousYear();
		dashboardpage.clickOnProductAllButton();
		dashboardpage.verifyProductNameTable();
	}
	
}
