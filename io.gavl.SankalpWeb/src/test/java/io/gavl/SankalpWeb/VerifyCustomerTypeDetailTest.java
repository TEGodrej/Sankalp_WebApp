package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyCustomerTypeDetailTest extends BaseClass{
	
	@Test
	public void verifyCustomerTypeAsDistributor() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnFilterCustomerType();
		
		dashboardpage.clickOnCustomerTypeDistributor();
		dashboardpage.clickOnApplyButton();
		dashboardpage.scrollToTopPerformer();
		
		dashboardpage.verifyTopPerformersChart();
	}
	
	@Test
	public void verifyCustomerTypeAsRetaier() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnFilterCustomerType();
		
		dashboardpage.clickOnCustomerTypeRetailer();
		dashboardpage.getApplyButton().click();
		dashboardpage.clickOnApplyButton();
		
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyCustomerTypeAsPD() {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnFilterCustomerType();
		
		dashboardpage.clickOnCustomerTypePD();
		dashboardpage.getApplyButton().click();
		dashboardpage.clickOnApplyButton();
		
		dashboardpage.assertTopProduct();
	}
}
