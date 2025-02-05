package io.gavl.SankalpWeb;

import java.time.Duration;
import org.testng.annotations.Test;
import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyTerritoryDetailTest extends BaseClass{

	@Test
	public void verifyTerritoryDetailByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin("demouser", "demouser");
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
		loginpage.userlogin("demouser", "demouser");
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
