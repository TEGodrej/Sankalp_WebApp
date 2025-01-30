package io.gavl.SankalpWeb;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.gavl.SankalpWeb.GenericUtility.BaseClass;

public class VerifyRetailerDetailTest extends BaseClass{
	
	@Test
	public void  verifyUserAbleToFetchRetailerDetails() throws InterruptedException {
		driverutility.implicitlyWait(10);
		loginpage.getUsernameTxtFld().sendKeys("demouser");
		loginpage.getPasswordTxtfld().sendKeys("demouser");
		loginpage.getLoginBtn().click();
		try {
			dashboardpage.getFilterOptiopn().click();
		}catch(ElementNotInteractableException e) {
			dashboardpage.getFilterOptiopn().click();
		}
		String retailerId="7517658";
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getfRetailer().click();
		dashboardpage.getFilterSearchBox().sendKeys(retailerId);
		Thread.sleep(Duration.ofSeconds(10));
		dashboardpage.getRetailerName().click();
		
		
		dashboardpage.getApplyBtn().click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement chart=  dashboardpage.getTopProductChart();
		driverutility.scrollIntoView(chart);
		
//		WebElement noDetailFound=driver.findElement(By.xpath("(//div[text()=' No details found.'])[1]"));
		
		assertTrue(chart.isDisplayed(), "Chart is not displayed"); 
//		assertFalse(noDetailFound.isDisplayed(), "No details found is displayed"); 

	}

}
