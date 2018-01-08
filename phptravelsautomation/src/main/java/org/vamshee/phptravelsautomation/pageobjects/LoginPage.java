package org.vamshee.phptravelsautomation.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.vamshee.phptravelsautomation.utils.ExcelUtil;

public class LoginPage {

	WebDriver driver;
	public static final String URL = "http://www.phptravels.net/login";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void open() {
		driver.get(URL);
	}

	public By byEmail = By.xpath("//input[@type='email']"), byPassword = By.xpath("//input[@type='password']"),
			byLogin = By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']"),
			byInvalidLoginmessage = By.xpath("//div[@class='alert alert-danger']");

	/**
	 * enter email on login page
	 */
	public void enterEmail(String email) {
		driver.findElement(byEmail).clear();
		driver.findElement(byEmail).sendKeys(email);
	}

	/**
	 * enter password on login page
	 */
	public void enterPassword(String password) {
		driver.findElement(byPassword).clear();
		driver.findElement(byPassword).sendKeys(password);
	}

	/**
	 * click on submit button
	 */
	public void clickLogin() {
		driver.findElement(byLogin).click();
	}

	/**
	 * if invalid login a message is displayed, check for the message and return
	 * status
	 * 
	 * @return
	 */
	public boolean isInvalidLogin(long timeOutInSeconds) {
		boolean isInvalid = false;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.pollingEvery(1, TimeUnit.SECONDS);

		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(byInvalidLoginmessage)));
			isInvalid = true;
		} catch (Exception e) {
			// if exception occured, that means invalid message not displayed
			// ,hence return false
			return isInvalid;
		}

		return isInvalid;
	}

	public void login() {
		enterEmail("user@phptravels.com");
		enterPassword("demouser");
		clickLogin();

	}

}
