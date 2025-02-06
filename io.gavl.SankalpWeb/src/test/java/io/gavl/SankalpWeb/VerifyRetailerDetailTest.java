package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;
import io.gavl.SankalpWeb.GenericUtility.FileUtility;

public class VerifyRetailerDetailTest extends BaseClass{
	
	@Test
	public void  verifyUserAbleToFetchRetailerDetails() throws InterruptedException {
		driverutility.implicitlyWait(10);
		String userName=FileUtility.getProperty("UserName");
		String password=FileUtility.getProperty("Password");
		loginpage.userlogin(userName,password);
//		try {
//			dashboardpage.getFilterOptiopn().click();
//		}catch(ElementNotInteractableException e) {
//			dashboardpage.getFilterOptiopn().click();
//		}
		dashboardpage.clickOnFilterOption();
		String retailerId="7517658";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getfilterRetailer().click();
		dashboardpage.clickOnFilterRetailer();
		dashboardpage.sendKeyToSearchBox(retailerId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.clickOnFilterRetailer();
		dashboardpage.clickOnRetailerName();
		
		dashboardpage.clickOnApplyButton();
		Thread.sleep(Duration.ofSeconds(10));
//		WebElement chart=  dashboardpage.getTopProductChart();
//		driverutility.scrollIntoView(chart);
		dashboardpage.assertTopProduct();
//		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
//		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
//		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed"); 

	}

}
