package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyCustomDateFunctionalityTest extends BaseClass{
	
	@Test
	public void verifyCustomDateFunctionality() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnCustomDateRange();
		dashBoardPage.clickOnToDateRadioButton();
		dashBoardPage.clickOnFirstDateOfMonth();
		dashBoardPage.clickOnFifthDayOfMonth();
		dashBoardPage.clickOnApplyButton();
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void verifyCustomDateFunctionalityWithCloseButton() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnCustomDateRange();
		dashBoardPage.clickOnToDateRadioButton();
		dashBoardPage.clickOnFirstDateOfMonth();
		dashBoardPage.clickOnFifthDayOfMonth();
		dashBoardPage.clickOnCloseButton();
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void verifyCustomDateFunctionalityWithResetButton() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnCustomDateRange();
		dashBoardPage.clickOnToDateRadioButton();
		dashBoardPage.clickOnFirstDateOfMonth();
		dashBoardPage.clickOnFifthDayOfMonth();
		dashBoardPage.clickOnResetButton();
		dashBoardPage.assertsearchTitle();
	}

}
