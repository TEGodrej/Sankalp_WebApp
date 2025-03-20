package io.gavl.SankalpWeb;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyCustomerTypeDetailTest extends BaseClass{
	
	@Test
	public void verifyCustomerTypeAsDistributor() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnFilterCustomerType();
		
		dashBoardPage.clickOnCustomerTypeDistributor();
		dashBoardPage.clickOnApplyButton();
		dashBoardPage.scrollToTopPerformer();
		
		dashBoardPage.verifyTopPerformersChart();
	}
	
	@Test
	public void verifyCustomerTypeAsRetaier() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnFilterCustomerType();
		
		dashBoardPage.clickOnCustomerTypeRetailer();
		dashBoardPage.getApplyButton().click();
		dashBoardPage.clickOnApplyButton();
		
		dashBoardPage.assertTopProduct();
	}
	
	@Test
	public void verifyCustomerTypeAsPD() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnFilterCustomerType();
		
		dashBoardPage.clickOnCustomerTypePD();
		dashBoardPage.getApplyButton().click();
		dashBoardPage.clickOnApplyButton();
		
		dashBoardPage.assertTopProduct();
	}
}
