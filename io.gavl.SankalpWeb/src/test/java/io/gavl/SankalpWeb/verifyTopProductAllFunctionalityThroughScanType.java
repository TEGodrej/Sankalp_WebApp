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
			}catch(ElementClickInterceptedException e) {
				dashboardpage.getThismonth().click();
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
			}catch(ElementClickInterceptedException e) {
				dashboardpage.getThismonth().click();
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
	public void verifyTopProductAllFunctionalityThroughValueScanType() {
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
			}catch(ElementClickInterceptedException e) {
				dashboardpage.getThismonth().click();
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
	public void verifyTopProductThisYearAllFunctionalityThroughWeightScanType() {
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
