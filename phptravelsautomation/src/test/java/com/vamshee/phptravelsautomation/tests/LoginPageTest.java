package com.vamshee.phptravelsautomation.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.vamshee.phptravelsautomation.pageobjects.LoginPage;
import org.vamshee.phptravelsautomation.pageobjects.WelcomePage;
import org.vamshee.phptravelsautomation.utils.ExcelUtil;

import com.vamshee.phptravelsautomation.tests.util.BaseTest;

import jxl.Sheet;
import jxl.Workbook;

public class LoginPageTest extends BaseTest {
	/**
	 * enter proper user id and password and assert login successful
	 * 
	 * @throws Exception
	 */
	@Test(enabled = true, groups = { "positive" })
	public void testLoginSuccess() throws Exception {
		// report
		Reporter report = new Reporter();
		// open Chrome browser

		// Webdriver setup
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		// "C:\\Users\\Stallone\\workspace\\Frameworks\\chromedriver.exe"
		WebDriver driver = new ChromeDriver();

		// create page object of welcomePage

		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.open();
		Thread.sleep(3000);
		driver.manage().window().maximize();

		// check for logo presence.
		WebDriverWait wait = new WebDriverWait(driver, 5);

		// check for login presence
		welcomePage.clickMyAccount();
		welcomePage.clickLogin();
		takeScreenShot(driver);

		// Login Page will be opened
		// create Login Page Object
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail("user@phptravels.com");
		loginPage.enterPassword("demouser");
		loginPage.clickLogin();

		// after login details entered, wait for success message
		// wait until URL is changed to "http://www.phptravels.net/account/"
		try {
			wait.until(ExpectedConditions.urlMatches("http://www.phptravels.net/account/"));
		} catch (Exception e) {
			takeScreenShot(driver);
			throw new Exception("After login account page not opened, hence login failed");
		}

		report.log("Account Page is opened after login, so Login is successful");
		takeScreenShot(driver);

		driver.quit();
	}

	@Test(dataProviderClass = ExcelUtil.class, dataProvider = "loginData", enabled = false)
	public void testData(String userName, String password, String status) {
		System.out.println(userName + " " + password + " " + status);
	}

}
