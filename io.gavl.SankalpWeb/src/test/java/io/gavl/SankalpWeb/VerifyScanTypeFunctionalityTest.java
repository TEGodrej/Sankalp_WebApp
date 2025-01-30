package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyScanTypeFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToSeeWeightScanType() {
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getScanTypeDnArrow().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getScanTypeDnArrow().click();
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
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getScanTypeDnArrow().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getScanTypeDnArrow().click();
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
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getScanTypeDnArrow().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getScanTypeDnArrow().click();
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
