package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyTopProductTest extends BaseClass {

	
	@Test
	public void verifyTop10Functionality() {
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
        WebElement ProductsGraph=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
		if(ProductsGraph.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Top 10 button is not selected");
		}
	}
	
	@Test
	public void verifyAllFunctionality() {
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		dbp.getProductAll().click();
		WebElement ProductAll=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']"));
		if(ProductAll.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Product did not displayed: Case fails");
		}
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsValue() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsShipper() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsWeight() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsWeight() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsShipper() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsValue() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsWeight() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsShipper() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsValue() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsWeight() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsShipper() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsValue() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dbp.getProductDownload().click();
		dbp.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsWeight() throws InterruptedException {
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getProductDownload().click();
		dbp.getProductXlsx().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsShipper() throws InterruptedException {
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getProductDownload().click();
		dbp.getProductXlsx().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsValue() throws InterruptedException {
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getProductDownload().click();
		dbp.getProductXlsx().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfThisMonthPeriodAndScanTypeAsWeight() throws InterruptedException {
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getProductDownload().click();
		dbp.getProductXlsx().click();
		
//		alert.accept();
		
		
	}
}
