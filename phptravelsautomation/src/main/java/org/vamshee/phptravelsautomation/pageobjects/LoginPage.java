package org.vamshee.phptravelsautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.vamshee.phptravelsautomation.utils.ExcelUtil;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public By byEmail = By.xpath("//input[@type='email']"), byPassword = By.xpath("//input[@type='password']"),
			byLogin = By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");

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

}
