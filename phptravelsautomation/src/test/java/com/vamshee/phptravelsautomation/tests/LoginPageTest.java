package com.vamshee.phptravelsautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.vamshee.phptravelsautomation.pageobjects.WelcomePage;

import com.vamshee.phptravelsautomation.tests.util.BaseTest;

public class LoginPageTest extends BaseTest {

	@Test
	public void openWelcomePageInChrome() throws InterruptedException {
		// report
		Reporter report = new Reporter();
		// open Chrome browser

		// Webdriver setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stallone\\workspace\\Frameworks\\chromedriver.exe");
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
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("user@phptravels.com");

		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demouser");

		driver.findElement(By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']")).click();

		WebDriverWait wait1 = new WebDriverWait(driver, 2);
		takeScreenShot(driver);

		driver.quit();
	}

}
