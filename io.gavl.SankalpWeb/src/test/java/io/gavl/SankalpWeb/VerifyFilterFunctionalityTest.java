package io.gavl.SankalpWeb;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyFilterFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToFetchRetailerDetails() {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnFilterRetailer();
		String retailerName="Testing kiran store";
		dashBoardPage.sendKeyToSearchBox(retailerName);
		dashBoardPage.clickOnApplyButton();
		dashBoardPage.scrollToTopPerformerLiquidationText();
		driverUtility.threadWait(3);
		dashBoardPage.verifyTopPerformerLiquidationChart();
	}
	
	@Test
	public void verifyUserAbleTofetchRetailerDetailsUsingCode() {
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnFilterRetailer();
		String retailerId="7517658";
		dashBoardPage.sendKeyToSearchBox(retailerId);
		dashBoardPage.clickOnApplyButton();
		dashBoardPage.scrollToTopPerformerLiquidationText();
		driverUtility.threadWait(3);
		dashBoardPage.verifyTopPerformerLiquidationChart();
	}
}

