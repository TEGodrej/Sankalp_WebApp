package io.gavl.SankalpWeb;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyRetailerDetailTest extends BaseClass{
	
	@Test
	public void  verifyUserAbleToFetchRetailerDetails() throws InterruptedException {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		String retailerId="7517658";
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getfRetailer().click();
		dbp.getFilterSearchBox().sendKeys(retailerId);
		Thread.sleep(Duration.ofSeconds(10));
		dbp.getRetailerName().click();
		
		
		dbp.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dbp.getTopProductChart();
		dutil.scrollIntoView(chart);
		
//		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
//		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed"); 

	}

}
