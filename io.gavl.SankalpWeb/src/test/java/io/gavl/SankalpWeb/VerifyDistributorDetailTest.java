package io.gavl.SankalpWeb;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyDistributorDetailTest extends BaseClass{
	@Test
	public void VerifyUserAbleToFetchDistributorDetails() throws InterruptedException {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		String distributorId="2016243";
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getFdistributor().click();
		dbp.getFilterSearchBox().sendKeys(distributorId);
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getDistributorName().click();
		
		
		dbp.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dbp.getTopPerformerChart();
		dutil.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[3]"));
		
		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed"); 

	}
	
	@Test
	public void VerifyUserAbleToFetchDistributorDetailsByName() throws InterruptedException {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		String distributorName="A ONE KRUSHI SEVA KENDRA";
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getFdistributor().click();
		dbp.getFilterSearchBox().sendKeys(distributorName);
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getDistributroId().click();
		
		
		dbp.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dbp.getTopPerformerChart();
		dutil.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[3]"));
		
		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed"); 
	}

}
