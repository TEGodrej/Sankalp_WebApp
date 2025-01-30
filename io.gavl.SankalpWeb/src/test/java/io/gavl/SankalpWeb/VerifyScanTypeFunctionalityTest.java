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
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getScanTypeDnArrow().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getScanTypeDnArrow().click();
		}
		try {
			dbp.getWeight().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getWeight().click();
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
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getScanTypeDnArrow().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getScanTypeDnArrow().click();
		}
		try {
			dbp.getShipper().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getShipper().click();
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
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getScanTypeDnArrow().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getScanTypeDnArrow().click();
		}
		try {
			dbp.getValue().click();
		}catch(ElementClickInterceptedException e) {
			dbp.getValue().click();
		}
		WebElement chart=driver.findElement(By.xpath("(//canvas[@class='am5-layer-30'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Chart did not displayed: Case Fails");
		}
	}
}
