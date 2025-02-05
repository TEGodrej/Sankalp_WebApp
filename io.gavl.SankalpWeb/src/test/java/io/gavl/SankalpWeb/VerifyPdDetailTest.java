package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyPdDetailTest extends BaseClass{

	@Test
	public void  verifyUserAbleToFetchPdDetails() throws InterruptedException{
		driverutility.implicitlyWait(10);
		loginpage.userlogin("demouser", "demouser");
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String pdId="2001784";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterPd();
		dashboardpage.sendKeyToSearchBox(pdId);;
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnPdName();
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void  verifyUserAbleToFetchPdDetailsByName() throws InterruptedException{
		driverutility.implicitlyWait(10);
		loginpage.userlogin("demouser", "demouser");
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String pdName="SANTOSH KRISHI SEVA KENDRA";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getfilterPD().click();
		dashboardpage.getFilterSearchBox().sendKeys(pdName);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnPdId();
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();
 }
}