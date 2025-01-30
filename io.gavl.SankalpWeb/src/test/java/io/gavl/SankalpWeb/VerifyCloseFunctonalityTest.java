package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */
public class VerifyCloseFunctonalityTest extends BaseClass{
 
	@Test
	public void verifyUserAbleToCloseThefilter() {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();	
			
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();	
			
			}
		
		dbp.getCloseBtn().click();
		WebElement dashBoardTitle=driver.findElement(By.xpath("//span[text()='Dashboard']"));
		if(dashBoardTitle.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "No Title displayed: Case Fails");
		}
	}
}
