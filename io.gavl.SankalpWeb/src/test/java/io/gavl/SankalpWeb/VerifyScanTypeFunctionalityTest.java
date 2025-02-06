package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class VerifyScanTypeFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToSeeWeightScanType() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		try {
			dashboardpage.getscanTypeDownArrow().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getscanTypeDownArrow().click();
		}
		try {
			dashboardpage.getWeight().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getWeight().click();
		}
		WebElement chart=driver.findElement(By.xpath("(//canvas[@class='am5-layer-30'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Chart did not displayed:Case Fails");
		}
	}
	
	@Test
	public void verifyUserAbleToSeeShipperScanType() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		try {
			dashboardpage.getscanTypeDownArrow().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getscanTypeDownArrow().click();
		}
		try {
			dashboardpage.getShipper().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getShipper().click();
		}
		WebElement chart=driver.findElement(By.xpath("(//canvas[@class='am5-layer-30'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Chart did not displayed:Case Fails");
		}
	}
	
	@Test
	public void verifyUserAbleToSeeValueScanType() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
		try {
			dashboardpage.getscanTypeDownArrow().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getscanTypeDownArrow().click();
		}
		try {
			dashboardpage.getValue().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getValue().click();
		}
		WebElement chart=driver.findElement(By.xpath("(//canvas[@class='am5-layer-30'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Chart did not displayed: Case Fails");
		}
	}
}
