package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
/*
 * @author Testing Engineer
 */
public class VerifyFilterFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToFecthDistributor()   {
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
		dbp.getFilterSearchBox().sendKeys("Retailer");
		
		dbp.getApplyBtn().click();
		
		WebElement chart=driver.findElement(By.xpath("(//canvas[@class='am5-layer-30'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Chart did not displayed:Case Fails");
		}
	}
	
	@Test
	public void verifyUserAbleToFetchRetailerDetails() {
		dutil.implicitlyWait(10);
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		dbp.getfRetailer().click();
		dbp.getFilterSearchBox().sendKeys("Testing kiran store");
		dbp.getApplyBtn().click();
		WebElement TPliquid=driver.findElement(By.xpath("//h5[text()='Top performers - Liquidation']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", TPliquid);
		
		WebElement chart=driver.findElement(By.xpath("//div[@id='dvTopPerformersChart']"));
		if(chart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "no chart dispalyed: Case Fails");
			}
	}
	
	@Test
	public void verifyUserAbleTofetchRetailerDetailsUsingCode() {
		lp.getUsernameTxtFld().sendKeys("demouser");
		lp.getPasswordTxtfld().sendKeys("demouser");
		lp.getLoginBtn().click();
		try {
			dbp.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dbp.getFilterOptiopn().click();
		}
		dbp.getfRetailer().click();
		dbp.getFilterSearchBox().sendKeys("7517658");
		dbp.getApplyBtn().click();
		WebElement TPliquid=driver.findElement(By.xpath("//h5[text()='Top performers - Liquidation']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", TPliquid);
		
		WebElement chart=driver.findElement(By.xpath("//div[@id='dvTopPerformersChart']"));
		if(chart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "no chart dispalyed: Case Fails");
			}
	}
}

