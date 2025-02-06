package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @ author testing.engineer
 */
public class VerifyPeriodFunctionalityTest extends BaseClass {


	@Test
	public void verifyUserAbleToViewPeriodWithThisMonthOption() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisMonth();
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToViewPeroidWithThisYearOption() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnThisYear();
		dashboardpage.assertTopProduct();
		
	}
	
	@Test
	public void verifyUserAbleToViewPeroidWithPreviousYearOption() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnPreviousYear();
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToViewPeriodWithTodayOption() {
		loginpage.userlogin();
		dashboardpage.clickOnDashboardPeriodDropDown();
		dashboardpage.clickOnToday();
		dashboardpage.assertTopProduct();
		
	}
	
}
