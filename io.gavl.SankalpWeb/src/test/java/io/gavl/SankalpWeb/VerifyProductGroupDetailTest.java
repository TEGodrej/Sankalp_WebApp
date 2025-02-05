package io.gavl.SankalpWeb;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyProductGroupDetailTest extends BaseClass{

	@Test
	public void verifyProductGroupDetailByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.userlogin("demouser", "demouser");
		dashboardpage.clickOnFilterOption();
		dashboardpage.clickOnPreviousYear();
		String productName="MARKETING BUSHI WP POWDER";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnProductGroup();
		dashboardpage.sendKeyToSearchBox(productName);;
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnProductGroupId();;
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.assertTopProduct();

	}
	
	@Test
	public void verifyProductGroupDetailByCode() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTextField().sendKeys("demouser");
		loginpage.getPasswordTextField().sendKeys("demouser");
		loginpage.getLoginButton().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		String productId="CPB - CO";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getfilterProductGroup().click();
		dashboardpage.getFilterSearchBox().sendKeys(productId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getProductGroupName().click();
		
		
		dashboardpage.getApplyButton().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dashboardpage.getTopProductChart();
		driverutility.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
 }
}