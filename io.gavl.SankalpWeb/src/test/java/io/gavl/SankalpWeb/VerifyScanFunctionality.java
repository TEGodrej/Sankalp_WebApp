package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyScanFunctionality extends BaseClass{

	@Test
	public void verifyScanFunctionalityWithPeriodAsToday() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		Thread.sleep(Duration.ofSeconds(10));
		sideMenuPage.clickOnScan();
		scanPage.clickOnLiquidationTab();
		Thread.sleep(Duration.ofSeconds(10));
		scanPage.clickOnScanPeriodDropDown();
		scanPage.clickOnScanPeriodToday();
		Thread.sleep(Duration.ofSeconds(10));
		scanPage.assertLiquidationTitle();
	}
	
	@Test
	public void verifyScanFunctionalityWithPeriodAsThisMonth() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		Thread.sleep(Duration.ofSeconds(10));
		sideMenuPage.clickOnScan();
		scanPage.clickOnLiquidationTab();
		Thread.sleep(Duration.ofSeconds(10));
		scanPage.clickOnScanPeriodDropDown();
		scanPage.clickOnScanPeriodThisMonth();
		Thread.sleep(Duration.ofSeconds(10));
		scanPage.assertLiquidationTitle();
	}
	
	@Test
	public void verifyScanFunctionalityWithPeriodAsThisYear() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		Thread.sleep(Duration.ofSeconds(10));
		sideMenuPage.clickOnScan();
		scanPage.clickOnLiquidationTab();
		Thread.sleep(Duration.ofSeconds(10));
		scanPage.clickOnScanPeriodDropDown();
		scanPage.clickOnScanPeriodThisYear();
		Thread.sleep(Duration.ofSeconds(10));
		scanPage.clickOnCustomerName();
		scanPage.assertPrdouctGroupWiseCustomerName();
	}
	@Test
	public void verifyScanFunctionalityWithPeriodAsPreviousYear() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		Thread.sleep(Duration.ofSeconds(10));
		sideMenuPage.clickOnScan();
		scanPage.clickOnLiquidationTab();
		Thread.sleep(Duration.ofSeconds(10));
		scanPage.clickOnScanPeriodDropDown();
		scanPage.clickOnScanPeriodPreviousYear();
		Thread.sleep(Duration.ofSeconds(10));
		scanPage.clickOnCustomerName();
		scanPage.assertPrdouctGroupWiseCustomerName();
	}
}
