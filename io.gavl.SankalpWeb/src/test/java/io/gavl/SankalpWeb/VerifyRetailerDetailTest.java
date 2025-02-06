package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyRetailerDetailTest extends BaseClass{
	
	@Test
	public void  verifyUserAbleToFetchRetailerDetails() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		String retailerId="7517658";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getfilterRetailer().click();
		dashboardpage.clickOnFilterRetailer();
		dashboardpage.sendKeyToSearchBox(retailerId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterRetailer();
		dashboardpage.clickOnRetailerName();
		
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();

	}

}
