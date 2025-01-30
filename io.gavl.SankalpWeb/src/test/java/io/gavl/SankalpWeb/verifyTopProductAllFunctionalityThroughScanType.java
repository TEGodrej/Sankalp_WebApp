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
			}catch(ElementClickInterceptedException e) {
				dbp.getThismonth().click();
			}
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
			WebElement allTab=dbp.getProductAll();
			dutil.WaitToClick(5, allTab);
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
			}catch(ElementClickInterceptedException e) {
				dbp.getThismonth().click();
			}
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
			WebElement allTab=dbp.getProductAll();
			dutil.WaitToClick(5, allTab);
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
			}catch(ElementClickInterceptedException e) {
				dbp.getThismonth().click();
			}
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
			WebElement allTab=dbp.getProductAll();
			dutil.WaitToClick(5, allTab);
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
			}
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
			WebElement allTab=dbp.getProductAll();
			dutil.WaitToClick(5, allTab);
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
			}
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
			WebElement allTab=dbp.getProductAll();
			dutil.WaitToClick(5, allTab);
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
		}
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
		WebElement allTab=dbp.getProductAll();
		dutil.WaitToClick(5, allTab);
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
		WebElement allTab=dbp.getProductAll();
		dutil.WaitToClick(5, allTab);
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
		WebElement allTab=dbp.getProductAll();
		dutil.WaitToClick(5, allTab);
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
		WebElement allTab=dbp.getProductAll();
		dutil.WaitToClick(5, allTab);
		allTab.click();
		WebElement product=driver.findElement(By.xpath("//div[@class='scMLVInnerTableDetailContent']/descendant::div[text()=' GAVL HITWEED MAXX LIQUID']"));
		if(product.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Product did not displayed");
		}
	}

}
