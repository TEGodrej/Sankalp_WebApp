package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyCustomerTypeDetailTest extends BaseClass{
	
	@Test
	public void verifyCustomerTypeAsDistributor() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTextField().sendKeys("demouser");
		loginpage.getPasswordTextField().sendKeys("demouser");
		loginpage.getLoginButton().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		dashboardpage.getfilterCustomerType().click();
		
		WebElement distributor=driver.findElement(By.xpath("//span[text()='Distributor']"));
		distributor.click();
		dashboardpage.getApplyButton().click();
		WebElement  topPerformer=driver.findElement(By.xpath("//h5[text()='Top performers - Placement']"));
		driverutility.scrollIntoView(topPerformer);
		
		WebElement chart=driver.findElement(By.xpath("//div[@id=\"dvTopPlacementPerformersChart\"]"));
		assertTrue(chart.isDisplayed(), "displayed");
	}
	
	@Test
	public void verifyCustomerTypeAsRetaier() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTextField().sendKeys("demouser");
		loginpage.getPasswordTextField().sendKeys("demouser");
		loginpage.getLoginButton().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		dashboardpage.getfilterCustomerType().click();
		
		WebElement retailer=driver.findElement(By.xpath("//span[text()='Retailer']"));
		retailer.click();
		dashboardpage.getApplyButton().click();
//		WebElement  topPerformer=driver.findElement(By.xpath("//h5[text()='Top performers - Placement']"));
		
		
		WebElement chart=driver.findElement(By.xpath("//div[@id=\"dvTopProductsChartData\"]"));
		assertTrue(chart.isDisplayed(), "displayed");
	}
}
