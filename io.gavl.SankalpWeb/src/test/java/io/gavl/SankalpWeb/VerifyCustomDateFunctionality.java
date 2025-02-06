package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class VerifyCustomDateFunctionality extends BaseClass{
	
	@Test
	public void verifyCustomDateFunctionality() {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnCustomDateRange();
		dashboardpage.clickOnToDateRadioButton();
		dashboardpage.clickOnFirstDateOfMonth();
		dashboardpage.clickOnFifthDayOfMonth();
		dashboardpage.clickOnApplyButton();
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyCustomDateFunctionalityWithCloseButton() {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnCustomDateRange();
		dashboardpage.clickOnToDateRadioButton();
		dashboardpage.clickOnFirstDateOfMonth();
		dashboardpage.clickOnFifthDayOfMonth();
		dashboardpage.clickOnCloseButton();
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyCustomDateFunctionalityWithResetButton() {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnCustomDateRange();
		dashboardpage.clickOnToDateRadioButton();
		dashboardpage.clickOnFirstDateOfMonth();
		dashboardpage.clickOnFifthDayOfMonth();
		dashboardpage.clickOnResetButton();
		dashboardpage.assertsearchTitle();
	}

}
