package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyRegionDetailTest extends BaseClass{

	@Test
	public void verifyRegionDetailByName() throws InterruptedException {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
//		String TerritoryName="AKOLA";
		WebElement region=dbp.getfRegion();
		dutil.scrollIntoView(region);
		region.click();
//		dbp.getFilterSearchBox().sendKeys(TerritoryName);
		Thread.sleep(Duration.ofSeconds(10));
		try {
		dbp.getRegionName().click();
		}catch(ElementNotInteractableException e) {
			dbp.getRegionName().click();
		}
		
		dbp.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dbp.getTopProductChart();
		dutil.scrollIntoView(chart);
		
//		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
//		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed");
	}
}
