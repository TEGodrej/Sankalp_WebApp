package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @ author testing.engineer
 */
public class VerifyPeriodFunctionalityTest extends BaseClass {


	@Test
	public void verifyUserAbleToViewPeriodWithThisMonthOption() {
		loginpage.getUsernameTextField().sendKeys("demouser");
		loginpage.getPasswordTextField().sendKeys("demouser");
		loginpage.getLoginButton().click();
		try {
		WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
		period.click();
		}catch(ElementClickInterceptedException e) {
			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
			period.click();
		}
		try {
			dashboardpage.getThismonth().click();
		}catch(ElementClickInterceptedException e) 
		{
			dashboardpage.getThismonth().click();
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
		loginpage.getUsernameTextField().sendKeys("demouser");
		loginpage.getPasswordTextField().sendKeys("demouser");
		loginpage.getLoginButton().click();
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
		loginpage.getUsernameTextField().sendKeys("demouser");
		loginpage.getPasswordTextField().sendKeys("demouser");
		loginpage.getLoginButton().click();
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
		loginpage.getUsernameTextField().sendKeys("demouser");
		loginpage.getPasswordTextField().sendKeys("demouser");
		loginpage.getLoginButton().click();
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
