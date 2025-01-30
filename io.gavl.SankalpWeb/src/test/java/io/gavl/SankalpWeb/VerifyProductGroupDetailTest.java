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
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		String productName="MARKETING BUSHI WP POWDER";
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getfProductGroup().click();
		dbp.getFilterSearchBox().sendKeys(productName);
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getProductGroupId().click();
		
		
		dbp.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dbp.getTopProductChart();
		dutil.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
	}
	
	@Test
	public void verifyProductGroupDetailByCode() throws InterruptedException {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		String productId="CPB - CO";
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getfProductGroup().click();
		dbp.getFilterSearchBox().sendKeys(productId);
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getProductGroupName().click();
		
		
		dbp.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dbp.getTopProductChart();
		dutil.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
 }
}