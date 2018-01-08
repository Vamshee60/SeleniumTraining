package com.vamshee.phptravelsautomation.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.vamshee.phptravelsautomation.pageobjects.AccountPage;
import org.vamshee.phptravelsautomation.pageobjects.LoginPage;
import org.vamshee.phptravelsautomation.pageobjects.WelcomePage;

import com.vamshee.phptravelsautomation.tests.util.BaseTest;

public class AccountPageTest extends BaseTest {

	@Test
	public void testNewsLetter() throws Exception {
		// report
		Reporter report = new Reporter();
		// open Chrome browser

		// Webdriver setup
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// create page object of welcomePage

		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		loginPage.login();
		takeScreenShot(driver);

		// check for logo presence.
		WebDriverWait wait = new WebDriverWait(driver, 10);
		AccountPage accountPage = new AccountPage(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(accountPage.byNewsLetterTab));

		report.log("AccountPage loaded");
		takeScreenShot(driver);

		accountPage.clickNewsletterTab();
		boolean isSelected = accountPage.tab_newsLetter().getState();
		// if selected unselect
		if (isSelected) {
			takeScreenShot(driver);
			report.log("Alredy Subscribed to News Letter");
			accountPage.tab_newsLetter().clickToggle();
			report.log("Clicked to Un Subscribed");
			Thread.sleep(2000);
			takeScreenShot(driver);

			isSelected = accountPage.tab_newsLetter().getState();
			Assert.assertTrue(!isSelected);
		} else {
			// if not selected un select
			takeScreenShot(driver);
			report.log("Alredy unSubscribed to News Letter");
			accountPage.tab_newsLetter().clickToggle();
			report.log("Clicked to Subscribed");
			Thread.sleep(2000);

			takeScreenShot(driver);
			isSelected = accountPage.tab_newsLetter().getState();
			Assert.assertTrue(isSelected);
		}
		takeScreenShot(driver);
		driver.quit();
	}
	
	
	

}
