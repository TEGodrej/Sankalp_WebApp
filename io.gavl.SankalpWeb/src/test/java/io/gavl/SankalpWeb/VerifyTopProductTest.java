package io.gavl.SankalpWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyTopProductTest extends BaseClass {

	
	@Test
	public void verifyTop10Functionality() {
		loginpage.userlogin();
//        WebElement ProductsGraph=driver.findElement(By.xpath("(//div[@class='scCMFullWDHT d-block'])[1]"));
//		if(ProductsGraph.isDisplayed()) {
//			assertTrue(true);
//		}else {
//			assertTrue(false, "Top 10 button is not selected");
//		}
		dashboardpage.verifyProductGraph();
	}
	
	@Test
	public void verifyAllFunctionality() {
		loginpage.userlogin();
		dashboardpage.getProductAll().click();
//		WebElement ProductAll=driver.findElement(By.xpath("//div[@class='scCMFullWDHT scScrollbar scDBGridContainer d-block ng-star-inserted']"));
//		if(ProductAll.isDisplayed()) {
//			assertTrue(true);
//		}else {
//			assertTrue(false, "Product did not displayed: Case fails");
//		}
		dashboardpage.verifyProductNameTable();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsValue() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisMonthPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfThisYearPeriodAndScanTypeAsValue() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfPreviousYearPeriodAndScanTypeAsValue() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsWeight() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsShipper() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	@Test
	public void verifyUserAbleToDowonloadImageOfTodayPeriodAndScanTypeAsValue() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin();
		
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(5));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductJpg().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsWeight() throws InterruptedException {
		loginpage.userlogin();
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductXlsx().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsShipper() throws InterruptedException {
		loginpage.userlogin();
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductXlsx().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfTodayPeriodAndScanTypeAsValue() throws InterruptedException {
		loginpage.userlogin();
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductXlsx().click();
	}
	
	@Test
	public void verifyUserAbleToDowonloadxlxsOfThisMonthPeriodAndScanTypeAsWeight() throws InterruptedException {
		loginpage.userlogin();
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
				System.out.println("Element is clicked");
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
		
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getProductDownload().click();
		dashboardpage.getProductXlsx().click();
		
//		alert.accept();
		
		
	}
}
