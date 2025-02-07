package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */
public class VerifyResetFunctionalityTest extends BaseClass{
	
	@Test
	public void verifyUseAbleToResetTheFilterCondition() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnFilterRetailer();
		dashBoardPage.getFilterSearchBox().sendKeys("7517658");
		
		dashBoardPage.getResetButton().click();
		
		
	}

}
