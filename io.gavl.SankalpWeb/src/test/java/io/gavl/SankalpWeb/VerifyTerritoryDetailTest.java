package io.gavl.SankalpWeb;

import java.time.Duration;
import org.testng.annotations.Test;
import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class VerifyTerritoryDetailTest extends BaseClass{

	@Test
	public void verifyTerritoryDetailByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String TerritoryName="Amravati";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterTerritory();
		dashboardpage.sendKeyToSearchBox(TerritoryName);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnTerritoryName();
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();
		
	}
	
	@Test
	public void verifyTerritoryDetailByCode() throws InterruptedException {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String TerritoryCode="D96";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterTerritory();
		dashboardpage.sendKeyToSearchBox(TerritoryCode);
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();
	}
}
