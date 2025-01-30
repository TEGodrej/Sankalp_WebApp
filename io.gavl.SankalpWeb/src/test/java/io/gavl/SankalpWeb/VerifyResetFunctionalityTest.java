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
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		dbp.getfRetailer().click();
		dbp.getFilterSearchBox().sendKeys("7517658");
		
		dbp.getResetBtn().click();
		
		
	}

}
