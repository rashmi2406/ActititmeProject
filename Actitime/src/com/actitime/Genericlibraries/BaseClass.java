package com.actitime.Genericlibraries;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.actitime.objectrepository.Homepage;
import com.actitime.objectrepository.Loginpage;

public class BaseClass {
   public static WebDriver driver; 
	@BeforeSuite
	public void databaseconnection () {
		Reporter.log("database connected", true);
	}
	@BeforeClass
	public void launchbrowser () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("browser launched succsessfully", true);
	}
	@BeforeMethod
	public void LoginToActitime() throws IOException {
		Loginpage lp = new Loginpage(driver);
		FileLibrary f = new FileLibrary ();
		String un = f.ReadDataFromProperty("username");
		lp.getUntbx().sendKeys(un);
		String pw = f.ReadDataFromProperty("password");
		lp.getPwtbx().sendKeys(pw);
		lp.getLgbtn().click();
		Reporter.log("logged in succsessfully", true);
	}
	@AfterMethod
	public void LogoutFromActitime () {
		Homepage hp = new Homepage(driver);
		hp.getLogoutlink().click();
		Reporter.log("logged out succsessfully", true);
	}
	@AfterClass
	public void CloseBrowser () {
		driver.close();
		Reporter.log("Browser closed Successfully", true);
	}
	@AfterSuite
	public void databasedisconnection () {
		Reporter.log("database disconnected", true);
	}
	}
