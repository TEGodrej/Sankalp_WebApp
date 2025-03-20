package io.gavl.SankalpWeb;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyTopProductAllFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToSeeTodayPeriodThroughAllSelect() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}
	
	@Test
	public void verifyUserAbleToSeeThisMonthPeriodThroughAllselect() {
		loginPage.userlogin();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisMonth();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyPesticideName();
	}
	
	@Test
	public void verifyUserAbleToSeeThisYearPeriodThroughAllselect() {
		loginPage.userlogin();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnDashboardPeriodDropDown();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnThisYear();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}
	
	@Test
	public void verifyUserAbleToSeePreviousYearPeriodThroughAllselect() {
		loginPage.userlogin();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnDashboardPeriodDropDown();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnPreiodPreviousYear();
		dashBoardPage.clickOnProductAllButton();
		dashBoardPage.verifyProductNameTable();
	}
	
}
