package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyRegionDetailTest extends BaseClass{

	@Test
	public void verifyRegionDetailByName() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String regionName="Nagpur";
		dashBoardPage.scrollToRegion();
		dashBoardPage.clickFilterRegion();
		dashBoardPage.sendKeyToSearchBox(regionName);
		driverUtility.threadWait(10);
		dashBoardPage.clickOnRegionName();
		
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();
		
	}
	
	@Test
	public void verifyRegionDetailByCode() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String regionCode="F26";
		dashBoardPage.scrollToRegion();
		dashBoardPage.clickFilterRegion();
		dashBoardPage.sendKeyToSearchBox(regionCode);
		
		dashBoardPage.clickOnApplyButton();
		driverUtility.threadWait(10);
		dashBoardPage.assertTopProduct();
	}
}
