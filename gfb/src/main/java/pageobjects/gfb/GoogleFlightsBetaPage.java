package pageobjects.gfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleFlightsBetaPage {
	WebDriver driver;

	public GoogleFlightsBetaPage(WebDriver driver) {
		this.driver = driver;
	}

	// basic Url
	public static final String URL = "https://www.google.com/flights/beta";

	// interactive methods
	public void open() {
		driver.get(URL);
	}

	/* locator */
	public void fromLocation() {
		By byFromTxt = By.xpath("//div[@id='sb_ifc50']");
	}

	public void toLocator() {
		By byToTxt = By.xpath("//div[@class='jIIwapdBllK__input-container flt-scrollable']");
	}

	public void searchLocator() {
		By bySearchTxt = By.xpath(
				"//div/floating-action-button[@class='gws-flights-form__search-button gws-flights-fab__mini flt-disabled']");
	}

	public void langLocator() {
		By byLangTxt = By.xpath("//div[2]/span[@class='gws-flights__footer-picker-title']");
	}

}
