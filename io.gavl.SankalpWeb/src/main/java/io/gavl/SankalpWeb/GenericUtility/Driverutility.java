package io.gavl.SankalpWeb.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driverutility extends BaseClass{

	public static WebDriverWait wait;
	public void WaitToClick(int time, WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    element = wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void WaitTovisibility(WebElement element, int time) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void implicitlyWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
