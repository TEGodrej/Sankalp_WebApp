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
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		dashboardpage.getfCustomerType().click();
		
		WebElement distributor=driver.findElement(By.xpath("//span[text()='Distributor']"));
		distributor.click();
		dashboardpage.getApplyBtn().click();
		WebElement  topPerformer=driver.findElement(By.xpath("//h5[text()='Top performers - Placement']"));
		driverutility.scrollIntoView(topPerformer);
		
		WebElement chart=driver.findElement(By.xpath("//div[@id=\"dvTopPlacementPerformersChart\"]"));
		assertTrue(chart.isDisplayed(), "displayed");
	}
	
	@Test
	public void verifyCustomerTypeAsRetaier() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		dashboardpage.getfCustomerType().click();
		
		WebElement retailer=driver.findElement(By.xpath("//span[text()='Retailer']"));
		retailer.click();
		dashboardpage.getApplyBtn().click();
//		WebElement  topPerformer=driver.findElement(By.xpath("//h5[text()='Top performers - Placement']"));
		
		
		WebElement chart=driver.findElement(By.xpath("//div[@id=\"dvTopProductsChartData\"]"));
		assertTrue(chart.isDisplayed(), "displayed");
	}
}
