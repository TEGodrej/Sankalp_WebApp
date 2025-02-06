package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class verifyTopProductAllFunctionalityThroughScanType extends BaseClass{
	
	@Test
	public void verifyTopProductAllFunctionalityThroughWeightScanType() {
		driverutility.implicitlyWait(10);
//		String userName=FileUtility.getProperty("UserName");
//		String password=FileUtility.getProperty("Password");
		loginpage.userlogin("demouser","demouser");
		dashboardpage.clickOnDashboardPeriodDropDown();
//		try {
//			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//			period.click();
//			}catch(ElementClickInterceptedException e) {
//				WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//				period.click();
//			}
				dashboardpage.clickOnThisMonth();
				dashboardpage.clickOnScanTypeDownArrow();
//			try {
//				dashboardpage.getscanTypeDownArrow().click();
//			}catch(ElementClickInterceptedException e) {
//				dashboardpage.getscanTypeDownArrow().click();
//			}
//			try {
//				dashboardpage.clickOnScanTypeWeight();
//			}catch(ElementClickInterceptedException e) {
//				dashboardpage.getWeight().click();
//			}
//			WebElement allTab=dashboardpage.getProductAll();
//			driverutility.WaitToClick(5, allTab);
//			allTab.click();
				dashboardpage.clickOnProductAllButton();
//			Assertion asser = new Assertion();
//			WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
//			if(product.isDisplayed()) {
//				asser.assertTrue(true);
//			}else {
//				asser.assertTrue(false, "Product did not displayed");
//			}
				dashboardpage.assertTopProductAllButton();
	}
	
	@Test
	public void verifyTopProductAllFunctionalityThroughShipperScanType() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
//		try {
//			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//			period.click();
//			}catch(ElementClickInterceptedException e) {
//				WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//				period.click();
//			}
		dashboardpage.clickOnDashboardPeriodDropDown();
//			try {
//				dashboardpage.getThismonth().click();
//			}catch(ElementClickInterceptedException e) {
//				dashboardpage.getThismonth().click();
//			}
		
		dashboardpage.clickOnThisMonth();
//			try {
//				dashboardpage.getscanTypeDownArrow().click();
//			}catch(ElementClickInterceptedException e) {
//				dashboardpage.getscanTypeDownArrow().click();
//			}
		dashboardpage.clickOnScanTypeDownArrow();
//			try {
//				dashboardpage.getShipper().click();
//			}catch(ElementClickInterceptedException e) {
//				dashboardpage.getShipper().click();
//			}
		dashboardpage.clickOnScanTypeShipper();
//			WebElement allTab=dashboardpage.getProductAll();
//			driverutility.WaitToClick(5, allTab);
//			allTab.click();
		dashboardpage.clickOnProductAllButton();
//			WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
//			if(product.isDisplayed()) {
//				assertTrue(true);
//			}else {
//				assertTrue(false, "Product did not displayed");
//			}
			dashboardpage.assertTopProductAllButton();
	}
	
	@Test
	public void verifyTopProductAllFunctionalityThroughValueScanType() {
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
//		try {
//			WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//			period.click();
//			}catch(ElementClickInterceptedException e) {
//				WebElement period=driver.findElement(By.xpath("//*[name()='svg' and contains(@class, 'ng-tns-c56-5')]"));
//				period.click();
//			}
		dashboardpage.clickOnDashboardPeriodDropDown();
//			try {
//				dashboardpage.getThismonth().click();
//			}catch(ElementClickInterceptedException e) {
//				dashboardpage.getThismonth().click();
//			}
		dashboardpage.clickOnThisMonth();
//			try {
//				dashboardpage.getscanTypeDownArrow().click();
//			}catch(ElementClickInterceptedException e) {
//				dashboardpage.getscanTypeDownArrow().click();
//			}
		dashboardpage.clickOnScanTypeDownArrow();
//			try {
//				dashboardpage.getValue().click();
//			}catch(ElementClickInterceptedException e) {
//				dashboardpage.getValue().click();
//			}
		dashboardpage.clickOnScanTypeValue();
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
				dashboardpage.getThisYr().click();
			}catch(ElementClickInterceptedException e) {
				dashboardpage.getThisYr().click();
			}
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
				dashboardpage.getThisYr().click();
			}catch(ElementClickInterceptedException e) {
				dashboardpage.getThisYr().click();
			}
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
			dashboardpage.getThisYr().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getThisYr().click();
		}
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
			dashboardpage.getPreviousYear().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getPreviousYear().click();
		}
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
			dashboardpage.getPreviousYear().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getPreviousYear().click();
		}
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
			dashboardpage.getPreviousYear().click();
		}catch(ElementClickInterceptedException e) {
			dashboardpage.getPreviousYear().click();
		}
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
