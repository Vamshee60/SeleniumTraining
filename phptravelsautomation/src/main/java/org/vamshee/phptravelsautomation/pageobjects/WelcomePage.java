package org.vamshee.phptravelsautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	WebDriver driver;
	public static final String URL = "http://www.phptravels.net/";

	// CONSTRUCTOR
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
	}

	/*user actions on a webpage*/
	
	// opening welcomepage
	public void open() {
		driver.get(URL);
	}
	public void clickMyAccount(){
		driver.findElement(byMyAccount).click();
	}
	public void clickLogin(){
		driver.findElement(byLogin).click();
	}
	/* LOCATORS */

	By byLogo = By.xpath("//img[@src='http://www.phptravels.net/uploads/global/logo.png'and @class='logo']");

	By byLogin = By.xpath("//div[@class='navbar-collapse collapse']//a[text()=' Login']");

	By byMyAccount = By.xpath("//div[@class='navbar-collapse collapse']//li[@id='li_myaccount']/a[@data-toggle='dropdown']");

}
