package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyScanFunctionalityTest extends BaseClass{

	@Test
	public void verifyScanFunctionalityWithPeriodAsToday() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
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
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
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
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
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
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
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
