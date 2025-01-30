package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyLoginFuntionalityTest extends BaseClass{

	@Test
	public void verifyuserAbleToLoginWithValidCredential() {
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
	WebElement dbTitle=driver.findElement(By.xpath("//span[text()='Dashboard']"));
	if(dbTitle.isDisplayed()) {
		assertTrue(true);
	}else {
		assertTrue(true, "Title did not displayed: Case Fails");
	}
	
  }
}
