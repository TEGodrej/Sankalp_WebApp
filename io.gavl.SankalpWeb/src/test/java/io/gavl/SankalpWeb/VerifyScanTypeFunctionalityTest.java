package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyScanTypeFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToSeeWeightScanType() {
		loginPage.userlogin();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnScanTypeDownArrow();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnScanTypeWeight();
		driverUtility.threadWait(3);
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToSeeShipperScanType() {
		loginPage.userlogin();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnScanTypeDownArrow();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnScanTypeShipper();
		driverUtility.threadWait(3);
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToSeeValueScanType() {
		loginPage.userlogin();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnScanTypeDownArrow();
		driverUtility.threadWait(3);
		dashBoardPage.clickOnScanTypeValue();
		driverUtility.threadWait(3);
		dashBoardPage.assertTopProduct();
	}
}
