package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;
/*
 * @author Testing Engineer
 */
public class VerifyCloseFunctonalityTest extends BaseClass{
 
	@Test
	public void verifyUserAbleToCloseThefilter() {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		try {
			dashboardpage.getFilterOptiopn().click();	
			
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();	
			
			}
		
		dashboardpage.getcloseButton().click();
		WebElement dashBoardTitle=driver.findElement(By.xpath("//span[text()='Dashboard']"));
		if(dashBoardTitle.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "No Title displayed: Case Fails");
		}
	}
}
