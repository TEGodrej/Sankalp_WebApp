package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class VerifyTopProductAllFunctionality extends BaseClass{

	@Test
	public void verifyUserAbleToSeeTodayPeriodThroughAllSelect() {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dashboardpage.getToday().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getToday().click();
		}
		WebElement allTab=dashboardpage.getProductAll();
		driverutility.WaitToClick(5, allTab);
		allTab.click();
		WebElement prodName=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
		driverutility.WaitTovisibility(prodName, 10);
		 if(!prodName.isDisplayed()) {
			assertTrue(false);
		}
		else {
			assertTrue(true);
		}
	}
	
	@Test
	public void verifyUserAbleToSeeThisMonthPeriodThroughAllselect() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dashboardpage.getThismonth().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getThismonth().click();
		}

		String pesticide= driver.findElement(By.xpath("//strong[text()='GAVL HITWEED MAXX LIQUID']")).getText();
		System.out.println(pesticide);
	}
	
	@Test
	public void verifyUserAbleToSeeThisYearPeriodThroughAllselect() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		dashboardpage.getProductAll().click();
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dashboardpage.getThisYr().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getThisYr().click();
		}
		WebElement table=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']"));
		if(table.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Table did not displayed: Case Fails");
		}
	}
	
	@Test
	public void verifyUserAbleToSeePreviousYearPeriodThroughAllselect() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		dashboardpage.getProductAll().click();
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dashboardpage.getPreviousYear().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getPreviousYear().click();
		}
		WebElement table=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']"));
		if(table.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Table did not displayed: Case Fails");
		}
	}
	
}
