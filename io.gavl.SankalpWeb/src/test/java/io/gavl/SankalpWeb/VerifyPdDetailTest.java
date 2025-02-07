package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyPdDetailTest extends BaseClass{

	@Test
	public void  verifyUserAbleToFetchPdDetails() throws InterruptedException{
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();		
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String pdId="2001784";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnFilterPd();
		dashBoardPage.sendKeyToSearchBox(pdId);;
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnPdName();
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void  verifyUserAbleToFetchPdDetailsByName() throws InterruptedException{
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String pdName="SANTOSH KRISHI SEVA KENDRA";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.getfilterPD().click();
		dashBoardPage.getFilterSearchBox().sendKeys(pdName);
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnPdId();
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();
 }
}