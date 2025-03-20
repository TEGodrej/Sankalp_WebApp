package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

@Listeners(io.gavl.SankalpWeb.GenericUtility.ExtentReportsListner.class)
public class VerifyDistributorDetailTest extends BaseClass{
	@Test
	public void VerifyUserAbleToFetchDistributorDetails() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String distributorId="2019378";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnFilterDistributor();
		dashBoardPage.sendKeyToSearchBox(distributorId);
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnDistributorName();
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.scrollToTopPerformer();
		
		dashBoardPage.assertMessage();
		
	}
	
	@Test
	public void VerifyUserAbleToFetchDistributorDetailsByName() throws InterruptedException {
		driverUtility.implicitlyWait(10);
		loginPage.userlogin();
		dashBoardPage.clickOnFilterOption();
		dashBoardPage.clickOnPreviousYear();
		String distributorName="AARAV KRUSHI SEVA KENDRA";
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnFilterDistributor();
		dashBoardPage.sendKeyToSearchBox(distributorName);
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.clickOnDistributorId();
		
		dashBoardPage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashBoardPage.scrollToTopPerformer();
		dashBoardPage.assertMessage();
	}

}
