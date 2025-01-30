package io.gavl.SankalpWeb;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyProductDetailTest extends BaseClass{

	@Test
	public void verifyProductDetailByName() throws InterruptedException {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		String pdId="28100002";
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getfProduct().click();
		dbp.getFilterSearchBox().sendKeys(pdId);
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getProductName().click();
		
		
		dbp.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dbp.getTopProductChart();
		dutil.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
	}
	
	@Test
	public void verifyProductDetailByCode() throws InterruptedException {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		String pdId="VIKAS ORGANIC MANURE 50 KG";
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getfProduct().click();
		dbp.getFilterSearchBox().sendKeys(pdId);
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getProductId().click();
		
		
		dbp.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dbp.getTopProductChart();
		dutil.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
	}
}
