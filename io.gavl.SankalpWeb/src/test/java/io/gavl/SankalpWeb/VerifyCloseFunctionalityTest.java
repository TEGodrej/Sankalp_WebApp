package io.gavl.SankalpWeb;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */
@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyCloseFunctionalityTest extends BaseClass{
 
	@Test
	public void verifyUserAbleToCloseThefilter() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		
		dashBoardPage.clickOnCloseButton();
		dashBoardPage.verifyDashBoardTitle();
	}
}
