package org.vamshee.phptravelsautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
	WebDriver driver;

	public By byNewsLetterTab = By.xpath("//a[@href='#newsletter']");

	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public class Newsletter {
		public By byToggle = By.xpath("//input[@class='newsletter']"),
				byToggleSwitch = By.xpath("//input[@class='newsletter']/following-sibling::span");

		public boolean getState() {
			boolean isSelected = driver.findElement(byToggle).isSelected();
			return isSelected;
		}

		public void clickToggle() {
			driver.findElement(byToggleSwitch).click();
		}
	}

	public void clickNewsletterTab() throws Exception {
		driver.findElement(byNewsLetterTab).click();

	}

	public Newsletter tab_newsLetter() {
		return new Newsletter();
	}

}
