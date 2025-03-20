package io.gavl.SankalpWeb;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @ author testing.engineer
 */

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyPeriodFunctionalityTest extends BaseClass {


	@Test
	public void verifyUserAbleToViewPeriodWithThisMonthOption() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisMonth();
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToViewPeroidWithThisYearOption() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnThisYear();
		dashBoardPage.assertTopProduct();
		
	}
	
	@Test
	public void verifyUserAbleToViewPeroidWithPreviousYearOption() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnPreviousYear();
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToViewPeriodWithTodayOption() {
		loginPage.userlogin();
		dashBoardPage.clickOnDashboardPeriodDropDown();
		dashBoardPage.clickOnToday();
		dashBoardPage.assertTopProduct();
		
	}
	
}
