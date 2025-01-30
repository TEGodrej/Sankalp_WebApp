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
	public static LoginPage loginpage;
	public static DashBoardPage dashboardpage;
	public static changePasswordPage changeppasswordpage;
	public static Driverutility driverutility;
	@BeforeClass
	public void Login() {
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://gavl.staging.uniqid.io/#/login");
		
		loginpage=new LoginPage(driver);
		dashboardpage=new DashBoardPage(driver);
		changeppasswordpage= new changePasswordPage(driver);
		driverutility=new Driverutility();
	}
	
}
