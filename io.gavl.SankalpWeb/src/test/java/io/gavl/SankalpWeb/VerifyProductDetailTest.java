package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class VerifyProductDetailTest extends BaseClass{

	@Test
	public void verifyProductDetailByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
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
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
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
