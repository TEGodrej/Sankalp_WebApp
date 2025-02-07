package io.gavl.SankalpWeb.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import ObjectRepository.DashBoardPage;
import ObjectRepository.LoginPage;
import ObjectRepository.ScanPage;
import ObjectRepository.SideMenuPage;
import ObjectRepository.ChangePasswordPage;

public class BaseClass {

	public static WebDriver driver;
	public static LoginPage loginPage;
	public static DashBoardPage dashBoardPage;
	public static ChangePasswordPage changePasswordPage;
	public static Driverutility driverUtility;
	public static FileUtility fileUtility;
	public static SideMenuPage sideMenuPage;
	public static ScanPage  scanPage;
	@BeforeClass
	public void Login() {
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://gavl.staging.uniqid.io/#/login");
		
		loginPage=new LoginPage(driver);
		dashBoardPage=new DashBoardPage(driver);
		changePasswordPage= new ChangePasswordPage(driver);
		driverUtility=new Driverutility();
		fileUtility= new FileUtility();
		sideMenuPage=new SideMenuPage(driver);
		scanPage=new ScanPage(driver);
	}
	
}
