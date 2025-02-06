package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyProductGroupDetailTest extends BaseClass{

	@Test
	public void verifyProductGroupDetailByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String productName="MARKETING BUSHI WP POWDER";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnProductGroup();
		dashboardpage.sendKeyToSearchBox(productName);;
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnProductGroupId();;
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();

	}
	
	
}