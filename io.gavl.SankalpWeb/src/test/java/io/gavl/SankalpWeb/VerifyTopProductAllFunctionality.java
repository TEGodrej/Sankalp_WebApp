package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyTopProductAllFunctionality extends BaseClass{

	@Test
	public void verifyUserAbleToSeeTodayPeriodThroughAllSelect() {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		
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
//		WebElement table=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']/descendant::div[text()='Product group']"));
		WebElement prodName=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
//		if(table.isDisplayed()) {
//			assertTrue(true);
//		}
		driverutility.WaitTovisibility(prodName, 10);
		 if(!prodName.isDisplayed()) {
			assertTrue(false);
		}
		else {
			assertTrue(true);
		}
	}
//	(//div[@class='scMLVInnerTableDetailContent' and contains(.,'No details found.')])[1]
	
	@Test
	public void verifyUserAbleToSeeThisMonthPeriodThroughAllselect() {
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
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
//		WebElement allTab=dbp.getProductAll();
//		dutil.WaitToClick(5, allTab);
//		allTab.click();
//		WebElement table=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']"));
//		WebElement prodName=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));

		String pesticide= driver.findElement(By.xpath("//strong[text()='GAVL HITWEED MAXX LIQUID']")).getText();
		System.out.println(pesticide);
//		if(prodName.isDisplayed()) {
//			assertTrue(true);
//		}else {
//			assertTrue(false, "Table did not displayed: Case Fails");
//		}
	}
	
	@Test
	public void verifyUserAbleToSeeThisYearPeriodThroughAllselect() {
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
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
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
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
