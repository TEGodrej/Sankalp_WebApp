package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyProductDetailTest extends BaseClass{

	@Test
	public void verifyProductDetailByName() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String pdId="28100002";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnFilterProduct();
		dashBoardPage.sendKeyToSearchBox(pdId);
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnProductName();
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void verifyProductDetailByCode() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String pdId="VIKAS ORGANIC MANURE 50 KG";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnFilterProduct();
		dashBoardPage.getFilterSearchBox().sendKeys(pdId);
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnProductId();
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();
	}
}
