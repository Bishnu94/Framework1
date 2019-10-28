package Generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import ObjRepo.Loginclass;

public class Baseclass 
{
	public static WebDriver driver;
	@BeforeClass
	//@Parameters("MYBROWSER")    /*To execute scripts in different browser */
	public void OpenBrowser()
	{
		if(Constant.Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Soft\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(Constant.Browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Oxygen\\MavenPro\\Resource\\geckodriver-v0.20.1-win32.exe");
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		/*
		 * Wait for every webelement in one TestScripts
		 */
	  Webclib wlib=new Webclib();
		wlib.PageToLoad();
	}

	/*@AfterClass
	public void CloseBrowser()
	{
	driver.quit();	
	}*/
	@BeforeMethod
	public void LoginToApp() throws Throwable
	{
		Loginclass lpage=PageFactory.initElements(driver,Loginclass.class);
		lpage.adminlogin();
	}
	/*@AfterMethod
	public void LogoutFromApp()
	{
		//Logout lg=PageFactory.initElements(driver, Logout.class);
		//lg.LoggingOut();	
	}*/
}

