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
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		String distributorId="2019378";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getFdistributor().click();
		dashboardpage.getFilterSearchBox().sendKeys(distributorId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getDistributorName().click();
		
		
		dashboardpage.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dashboardpage.getTopPerformerChart();
		driverutility.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[3]"));
		
		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed"); 

	}
	
	@Test
	public void VerifyUserAbleToFetchDistributorDetailsByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		String distributorName="AARAV KRUSHI SEVA KENDRA";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getFdistributor().click();
		dashboardpage.getFilterSearchBox().sendKeys(distributorName);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getDistributroId().click();
		
		
		dashboardpage.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dashboardpage.getTopPerformerChart();
		driverutility.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[3]"));
		
		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed"); 
	}

}
