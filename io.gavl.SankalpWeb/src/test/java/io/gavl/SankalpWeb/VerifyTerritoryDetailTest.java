package io.gavl.SankalpWeb;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyTerritoryDetailTest extends BaseClass{

	@Test
	public void verifyTerritoryDetailByName() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		String TerritoryName="Amravati";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getfTerritory().click();
		dashboardpage.getFilterSearchBox().sendKeys(TerritoryName);
		Thread.sleep(Duration.ofSeconds(10));
		try {
			dashboardpage.getTerritoryName().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getTerritoryName().click();
		}
		
		dashboardpage.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dashboardpage.getTopProductChart();
		driverutility.scrollIntoView(chart);
		
		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
	}
}
