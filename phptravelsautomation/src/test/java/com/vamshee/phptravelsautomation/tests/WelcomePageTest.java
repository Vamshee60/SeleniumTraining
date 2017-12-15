package com.vamshee.phptravelsautomation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.vamshee.phptravelsautomation.pageobjects.WelcomePage;

import com.vamshee.phptravelsautomation.tests.util.BaseTest;

public class WelcomePageTest extends BaseTest {

	@Test
	public void openWelcomePageInChrome() {
		//report
		Reporter report=new Reporter();
		// open Chrome browser

		// Webdriver setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stallone\\workspace\\Frameworks\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// create page object of welcomePage

		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.open();
		takeScreenShot(driver);
		
		//check for logo presence.
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(welcomePage.byLogo));
			report.log("Logo Displayed");
		}
		catch(Exception e){
			report.log("Logo not Displayed");
			takeScreenShot(driver);
		}
		
		
		
		//check for MyAccount
		//check for login presence
		welcomePage.clickMyAccount();
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(welcomePage.byLogin));
			report.log("Login Displayed");
		}
		catch(Exception e){
			report.log("Login not Displayed");
			takeScreenShot(driver);
		}
		
		driver.quit();
	}
	@Test(enabled=false)
	public void openWelcomePageInIE() {
		//report
		Reporter report=new Reporter();
		// open Chrome browser

		// Webdriver setup
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Stallone\\Documents\\GitHub\\SeleniumTraining\\phptravelsautomation\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		// create page object of welcomePage

		WelcomePage wp = new WelcomePage(driver);
		wp.open();
		takeScreenShot(driver);
		
		//check for logo presence.
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(wp.byLogo));
			report.log("Logo Displayed");
		}
		catch(Exception e){
			report.log("Logo not Displayed");
			takeScreenShot(driver);
		}
		
		
		
		//check for MyAccount
		//check for login presence
		
		driver.quit();
	}
	

}
