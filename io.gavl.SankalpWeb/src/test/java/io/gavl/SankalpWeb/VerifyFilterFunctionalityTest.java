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
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
		dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		dashboardpage.getfCustomerType().click();
		dashboardpage.getFilterSearchBox().sendKeys("Retailer");
		
		dashboardpage.getApplyBtn().click();
		
		WebElement chart=driver.findElement(By.xpath("(//canvas[@class='am5-layer-30'])[1]"));
		if(chart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Chart did not displayed:Case Fails");
		}
	}
	
	@Test
	public void verifyUserAbleToFetchRetailerDetails() {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		dashboardpage.getfRetailer().click();
		dashboardpage.getFilterSearchBox().sendKeys("Testing kiran store");
		dashboardpage.getApplyBtn().click();
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
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		dashboardpage.getfRetailer().click();
		dashboardpage.getFilterSearchBox().sendKeys("7517658");
		dashboardpage.getApplyBtn().click();
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

