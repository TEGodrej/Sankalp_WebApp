package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class verifyTopProductAllFunctionalityThroughScanType extends BaseClass{
	
	@Test
	public void verifyTopProductAllFunctionalityThroughWeightScanType() {
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
			WebElement allTab=dashboardpage.getProductAll();
			driverutility.WaitToClick(5, allTab);
			allTab.click();
			Assertion asser = new Assertion();
			WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
			if(product.isDisplayed()) {
				asser.assertTrue(true);
			}else {
				asser.assertTrue(false, "Product did not displayed");
			}
	}
	
	@Test
	public void verifyTopProductAllFunctionalityThroughShipperScanType() {
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
			WebElement allTab=dashboardpage.getProductAll();
			driverutility.WaitToClick(5, allTab);
			allTab.click();
			WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
			if(product.isDisplayed()) {
				assertTrue(true);
			}else {
				assertTrue(false, "Product did not displayed");
			}
	}
	
	@Test
	public void verifyTopProductAllFunctionalityThroughValueScanType() {
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
			WebElement allTab=dashboardpage.getProductAll();
			driverutility.WaitToClick(5, allTab);
			allTab.click();
			WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
			if(product.isDisplayed()) {
				assertTrue(true);
			}else {
				assertTrue(false, "Product did not displayed");
			}
	}
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughWeightScanType() {
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
				dashboardpage.getThisYr().click();
			}catch(ElementClickInterceptedException e) {
				dashboardpage.getThisYr().click();
			}
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
			WebElement allTab=dashboardpage.getProductAll();
			driverutility.WaitToClick(5, allTab);
			allTab.click();
			WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
			if(product.isDisplayed()) {
				assertTrue(true);
			}else {
				assertTrue(false, "Product did not displayed");
			}
	}
	
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughShipperScanType() {
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
				dashboardpage.getThisYr().click();
			}catch(ElementClickInterceptedException e) {
				dashboardpage.getThisYr().click();
			}
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
			WebElement allTab=dashboardpage.getProductAll();
			driverutility.WaitToClick(5, allTab);
			allTab.click();
			WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
			if(product.isDisplayed()) {
				assertTrue(true);
			}else {
				assertTrue(false, "Product did not displayed");
			}
	}
	
	@Test
	public void verifyTopProductThisYearAllFunctionalityThroughValueScanType() {
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
			dashboardpage.getThisYr().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getThisYr().click();
		}
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
		WebElement allTab=dashboardpage.getProductAll();
		driverutility.WaitToClick(5, allTab);
		allTab.click();
		
		WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
		if(product.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Product did not displayed");
		}
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughWeightScanType() {
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
			dashboardpage.getPreviousYear().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getPreviousYear().click();
		}
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
		WebElement allTab=dashboardpage.getProductAll();
		driverutility.WaitToClick(5, allTab);
		allTab.click();
		WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
		if(product.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Product did not displayed");
		}
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughShipperScanType() {
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
			dashboardpage.getPreviousYear().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getPreviousYear().click();
		}
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
		WebElement allTab=dashboardpage.getProductAll();
		driverutility.WaitToClick(5, allTab);
		allTab.click();
		WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
		if(product.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Product did not displayed");
		}
		
	}
	
	@Test
	public void verifyTopProductPreviousYearAllFunctionalityThroughValueScanType() {
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
			dashboardpage.getPreviousYear().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getPreviousYear().click();
		}
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
		WebElement allTab=dashboardpage.getProductAll();
		driverutility.WaitToClick(5, allTab);
		allTab.click();
		WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
		if(product.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Product did not displayed");
		}
	}

}
