package io.gavl.SankalpWeb.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import ObjectRepository.DashBoardPage;
import ObjectRepository.LoginPage;
import ObjectRepository.changePasswordPage;

public class BaseClass {

	public static WebDriver driver;
	public static LoginPage lp;
	public static DashBoardPage dbp;
	public static changePasswordPage cpp;
	public static Driverutility dutil;
	@BeforeClass
	public void Login() {
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://gavl.staging.uniqid.io/#/login");
		
		lp=new LoginPage(driver);
		dbp=new DashBoardPage(driver);
		cpp= new changePasswordPage(driver);
		dutil=new Driverutility();
	}
	
}
