package io.gavl.SankalpWeb;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */
public class VerifyResetFunctionalityTest extends BaseClass{
	
	@Test
	public void verifyUseAbleToResetTheFilterCondition() {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTextField().sendKeys("demouser");
		loginpage.getPasswordTextField().sendKeys("demouser");
		loginpage.getLoginButton().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		dashboardpage.getfilterRetailer().click();
		dashboardpage.getFilterSearchBox().sendKeys("7517658");
		
		dashboardpage.getResetButton().click();
		
		
	}

}
