package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */
public class VerifyResetFunctionalityTest extends BaseClass{
	
	@Test
	public void verifyUseAbleToResetTheFilterCondition() {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnFilterRetailer();
		dashboardpage.getFilterSearchBox().sendKeys("7517658");
		
		dashboardpage.getResetButton().click();
		
		
	}

}
