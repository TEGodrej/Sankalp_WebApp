package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyProductGroupDetailTest extends BaseClass{

	@Test
	public void verifyProductGroupDetailByName() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String productName="MARKETING BUSHI WP POWDER";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnProductGroup();
		dashBoardPage.sendKeyToSearchBox(productName);;
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnProductGroupId();;
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();

	}
	
	
}