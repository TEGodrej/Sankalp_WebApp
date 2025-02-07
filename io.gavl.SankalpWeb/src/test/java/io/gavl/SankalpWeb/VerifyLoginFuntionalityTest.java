package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyLoginFuntionalityTest extends BaseClass{

	@Test
	public void verifyuserAbleToLoginWithValidCredential() {
		loginPage.userlogin();
		dashBoardPage.verifyDashBoardTitle();
	
  }
}
