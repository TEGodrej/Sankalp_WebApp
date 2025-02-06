package io.gavl.SankalpWeb;

import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;
/*
 * @ author testing.engineer
 */
public class VerifyPeriodFunctionalityTest extends BaseClass {


	@Test
	public void verifyUserAbleToViewPeriodWithThisMonthOption() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
//		try {
//		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//		period.click();
//		}catch(ElementClickInterceptedException e) {
//			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//			period.click();
//		}
		dashboardpage.clickOnDashboardPeriodDropDown();
//		try {
//			dashboardpage.getThismonth().click();
//		}catch(ElementClickInterceptedException e) 
//		{
//			dashboardpage.getThismonth().click();
//		}
		dashboardpage.clickOnThisMonth();
//		WebElement chart=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
//		
//		if(chart.isDisplayed()) {
//			assertTrue(true);
//			System.out.println("The test is passed");
//			}
//		else {
//			assertTrue(false, "Graph Did Not display: Case Fails");
//		}
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToViewPeroidWithThisYearOption() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
//		try {
//		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//		period.click();
//		}catch(ElementClickInterceptedException e) {
//			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//			period.click();
//		}
		dashboardpage.clickOnDashboardPeriodDropDown();
//		try {
//			dashboardpage.getThisYr().click();
//		}catch(ElementClickInterceptedException e) {
//			dashboardpage.getThisYr().click();
//			System.out.println("Element is clicked");
//		}
		dashboardpage.clickOnThisYear();
//		WebElement chart=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
//		if(chart.isDisplayed()) {
//			assertTrue(true);
//			System.out.println("The test is passed");
//		}
//		else {
//			assertTrue(false, "Graph Did Not display: Case Fails");
//		}
		dashboardpage.assertTopProduct();
		
	}
	
	@Test
	public void verifyUserAbleToViewPeroidWithPreviousYearOption() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
//		try {
//		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//		period.click();
//		}catch(ElementClickInterceptedException e) {
//			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//			period.click();
//		}
		dashboardpage.clickOnDashboardPeriodDropDown();
//		try {
//			dashboardpage.getPreviousYear().click();
//		}catch(ElementClickInterceptedException e) {
//			dashboardpage.getPreviousYear().click();
//		}
		dashboardpage.clickOnPreviousYear();
//		WebElement chart=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
//		if(chart.isDisplayed()) {
//			assertTrue(true);
//			System.out.println("The test is passed");
//		}
//		else {
//			assertTrue(false, "Graph Did Not display: Case Fails");
//		}
		dashboardpage.assertTopProduct();
	}
	
	@Test
	public void verifyUserAbleToViewPeriodWithTodayOption() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
//		try {
//		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//		period.click();
//		}catch(ElementClickInterceptedException e) {
//			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//			period.click();
//		}
		dashboardpage.clickOnDashboardPeriodDropDown();
//		try {
//			dashboardpage.getToday().click();
//		}catch(ElementClickInterceptedException e) {
//			dashboardpage.getToday().click();
//		}
		dashboardpage.clickOnToday();
//		WebElement chart=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
//		if(chart.isDisplayed()) {
//			assertTrue(true);
//			System.out.println("The test is passed");
//		}
//		else {
//			assertTrue(false, "Graph Did Not display: Case Fails");
//		}
		dashboardpage.assertTopProduct();
		
	}
	
}
