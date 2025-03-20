package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyRetailerDetailTest extends BaseClass{
	
	@Test
	public void  verifyUserAbleToFetchRetailerDetails() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		String retailerId="7517658";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.getfilterRetailer().click();
		dashBoardPage.clickOnFilterRetailer();
		dashBoardPage.sendKeyToSearchBox(retailerId);
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnFilterRetailer();
		dashBoardPage.clickOnRetailerName();
		
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();

	}

}
