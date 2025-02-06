package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class VerifyLoginFuntionalityTest extends BaseClass{

	@Test
	public void verifyuserAbleToLoginWithValidCredential(String userName, String password) {
//		String userName=FileUtility.getProperty("UserName");
//		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
//	WebElement dbTitle=driver.findElement(By.xpath("//span[text()='Dashboard']"));
//	if(dbTitle.isDisplayed()) {
//		assertTrue(true);
//	}else {
//		assertTrue(true, "Title did not displayed: Case Fails");
//	}
		dashboardpage.assertDashBoarTitle();
	
  }
}
