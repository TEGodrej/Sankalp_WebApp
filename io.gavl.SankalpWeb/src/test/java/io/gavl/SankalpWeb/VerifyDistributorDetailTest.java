package io.gavl.SankalpWeb;

import java.time.Duration;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class VerifyDistributorDetailTest extends BaseClass{
	@Test
	public void VerifyUserAbleToFetchDistributorDetails() throws InterruptedException {
		driverutility.implicitlyWait(10);
//		String userName=FileUtility.getProperty("UserName");
//		String password=FileUtility.getProperty("Password");
		loginpage.userlogin("demouser","demouser");
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String distributorId="2019378";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterDistributor();
		dashboardpage.sendKeyToSearchBox(distributorId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnDistributorName();
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.scrollToTopPerformer();
		
		dashboardpage.assertMessage();
		
	}
	
	@Test
	public void VerifyUserAbleToFetchDistributorDetailsByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String distributorName="AARAV KRUSHI SEVA KENDRA";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterDistributor();
		dashboardpage.sendKeyToSearchBox(distributorName);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnDistributorId();
		
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.scrollToTopPerformer();
		dashboardpage.assertMessage();
	}

}
