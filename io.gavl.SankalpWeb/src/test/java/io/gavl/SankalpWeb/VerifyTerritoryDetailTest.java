package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyTerritoryDetailTest extends BaseClass{

	@Test
	public void verifyTerritoryDetailByName() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String TerritoryName="Amravati";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnFilterTerritory();
		dashBoardPage.sendKeyToSearchBox(TerritoryName);
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnTerritoryName();
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();
		
	}
	
	@Test
	public void verifyTerritoryDetailByCode() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String TerritoryCode="D96";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnFilterTerritory();
		dashBoardPage.sendKeyToSearchBox(TerritoryCode);
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.assertTopProduct();
	}
}
