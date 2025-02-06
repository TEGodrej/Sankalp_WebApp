package io.gavl.SankalpWeb;

import org.testng.annotations.Test;
import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */
public class VerifyFilterFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToFetchRetailerDetails() {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnFilterRetailer();
		String retailerName="Testing kiran store";
		dashboardpage.sendKeyToSearchBox(retailerName);
		dashboardpage.clickOnApplyButton();
		dashboardpage.scrollToTopPerformerLiquidationText();
		driverutility.threadWait(3);
		dashboardpage.verifyTopPerformerLiquidationChart();
	}
	
	@Test
	public void verifyUserAbleTofetchRetailerDetailsUsingCode() {
		loginpage.userlogin();
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnFilterRetailer();
		String retailerId="7517658";
		dashboardpage.sendKeyToSearchBox(retailerId);
		dashboardpage.clickOnApplyButton();
		dashboardpage.scrollToTopPerformerLiquidationText();
		driverutility.threadWait(3);
		dashboardpage.verifyTopPerformerLiquidationChart();
	}
}

