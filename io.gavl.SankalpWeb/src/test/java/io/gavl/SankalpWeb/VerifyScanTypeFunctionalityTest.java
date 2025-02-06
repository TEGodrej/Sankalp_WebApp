package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyScanTypeFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToSeeWeightScanType() {
		loginpage.userlogin();
		driverutility.threadWait(3);
		dashboardpage.clickOnScanTypeDownArrow();
		driverutility.threadWait(3);
		dashboardpage.clickOnScanTypeWeight();
		driverutility.threadWait(3);
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToSeeShipperScanType() {
		loginpage.userlogin();
		driverutility.threadWait(3);
		dashboardpage.clickOnScanTypeDownArrow();
		driverutility.threadWait(3);
		dashboardpage.clickOnScanTypeShipper();
		driverutility.threadWait(3);
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToSeeValueScanType() {
		loginpage.userlogin();
		driverutility.threadWait(3);
		dashboardpage.clickOnScanTypeDownArrow();
		driverutility.threadWait(3);
		dashboardpage.clickOnScanTypeValue();
		driverutility.threadWait(3);
		dashboardpage.assertTopProduct();
	}
}
