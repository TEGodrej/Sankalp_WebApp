package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyRegionDetailTest extends BaseClass{

	@Test
	public void verifyRegionDetailByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String regionName="Nagpur";
		dashboardpage.scrollToRegion();
		dashboardpage.clickFilterRegion();
		dashboardpage.sendKeyToSearchBox(regionName);
		driverutility.threadWait(10);
		dashboardpage.clickOnRegionName();
		
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();
		
	}
	
	@Test
	public void verifyRegionDetailByCode() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String regionCode="F26";
		dashboardpage.scrollToRegion();
		dashboardpage.clickFilterRegion();
		dashboardpage.sendKeyToSearchBox(regionCode);
		
		dashboardpage.clickOnApplyButton();
		driverutility.threadWait(10);
		dashboardpage.assertTopProduct();
	}
}
