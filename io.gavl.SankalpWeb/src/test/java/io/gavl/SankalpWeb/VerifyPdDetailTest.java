package io.gavl.SankalpWeb;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyPdDetailTest extends BaseClass{

	@Test
	public void  verifyUserAbleToFetchPdDetails() throws InterruptedException{
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		String pdId="2001784";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getfPD().click();
		dashboardpage.getFilterSearchBox().sendKeys(pdId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getPdName().click();
		
		
		dashboardpage.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dashboardpage.getTopProductChart();
		driverutility.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
	}
	
	@Test
	public void  verifyUserAbleToFetchPdDetailsByName() throws InterruptedException{
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		String pdName="SANTOSH KRISHI SEVA KENDRA";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getfPD().click();
		dashboardpage.getFilterSearchBox().sendKeys(pdName);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getPdId().click();
		
		
		dashboardpage.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dashboardpage.getTopProductChart();
		driverutility.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
 }
}