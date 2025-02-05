package io.gavl.SankalpWeb.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import ObjectRepository.DashBoardPage;
import ObjectRepository.LoginPage;
import ObjectRepository.ChangePasswordPage;

public class BaseClass {

	public static WebDriver driver;
	public static LoginPage loginpage;
	public static DashBoardPage dashboardpage;
	public static ChangePasswordPage changeppasswordpage;
	public static Driverutility driverutility;
	public static FileUtility fileUtility;
	@BeforeClass
	public void Login() {
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://gavl.staging.uniqid.io/#/login");
		
		loginpage=new LoginPage(driver);
		dashboardpage=new DashBoardPage(driver);
		changeppasswordpage= new ChangePasswordPage(driver);
		driverutility=new Driverutility();
		fileUtility= new FileUtility();
	}
	
}
