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
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		dbp.getfCustomerType().click();
		
		WebElement distributor=driver.findElement(By.xpath("//span[text()='Distributor']"));
		distributor.click();
		dbp.getApplyBtn().click();
		WebElement  topPerformer=driver.findElement(By.xpath("//h5[text()='Top performers - Placement']"));
		dutil.scrollIntoView(topPerformer);
		
		WebElement chart=driver.findElement(By.xpath("//div[@id=\"dvTopPlacementPerformersChart\"]"));
		assertTrue(chart.isDisplayed(), "displayed");
	}
	
	@Test
	public void verifyCustomerTypeAsRetaier() throws InterruptedException {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		dbp.getfCustomerType().click();
		
		WebElement retailer=driver.findElement(By.xpath("//span[text()='Retailer']"));
		retailer.click();
		dbp.getApplyBtn().click();
//		WebElement  topPerformer=driver.findElement(By.xpath("//h5[text()='Top performers - Placement']"));
		
		
		WebElement chart=driver.findElement(By.xpath("//div[@id=\"dvTopProductsChartData\"]"));
		assertTrue(chart.isDisplayed(), "displayed");
	}
}
