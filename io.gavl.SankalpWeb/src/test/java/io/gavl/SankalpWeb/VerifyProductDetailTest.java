package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyProductDetailTest extends BaseClass{

	@Test
	public void verifyProductDetailByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String pdId="28100002";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterProduct();
		dashboardpage.sendKeyToSearchBox(pdId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnProductName();
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyProductDetailByCode() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String pdId="VIKAS ORGANIC MANURE 50 KG";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterProduct();
		dashboardpage.getFilterSearchBox().sendKeys(pdId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnProductId();
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();
	}
}
