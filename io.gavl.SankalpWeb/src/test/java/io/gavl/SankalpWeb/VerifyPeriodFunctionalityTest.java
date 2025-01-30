package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * 
 */
public class VerifyPeriodFunctionalityTest extends BaseClass {


	@Test
	public void verifyUserAbleToViewPeriodWithThisMonthOption() {
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dbp.getThismonth().click();
		}catch(ElementClickInterceptedException e) 
		{
			dbp.getThismonth().click();
		}
		WebElement chart=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
		
		if(chart.isDisplayed()) {
			assertTrue(true);
			System.out.println("The test is passed");
			}
		else {
			assertTrue(false, "Graph Did Not display: Case Fails");
		}
	}
	
	@Test
	public void verifyUserAbleToViewPeroidWithThisYearOption() {
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dbp.getThisYr().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getThisYr().click();
			System.out.println("Element is clicked");
		}
		WebElement chart=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
			System.out.println("The test is passed");
		}
		else {
			assertTrue(false, "Graph Did Not display: Case Fails");
		}
		
	}
	
	@Test
	public void verifyUserAbleToViewPeroidWithPreviousYearOption() {
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dbp.getPreviousYear().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getPreviousYear().click();
		}
		WebElement chart=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
			System.out.println("The test is passed");
		}
		else {
			assertTrue(false, "Graph Did Not display: Case Fails");
		}
	}
	
	@Test
	public void verifyUserAbleToViewPeriodWithTodayOption() {
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dbp.getToday().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getToday().click();
		}
		WebElement chart=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
			System.out.println("The test is passed");
		}
		else {
			assertTrue(false, "Graph Did Not display: Case Fails");
		}
		
	}
	
}
