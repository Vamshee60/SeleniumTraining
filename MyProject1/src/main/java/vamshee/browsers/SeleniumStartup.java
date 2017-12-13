package vamshee.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStartup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stallone\\workspace\\Frameworks\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://www.seleniumhq.org/";
		String expectedTitle = "SeleniumHQ";
		String actualTitle = "";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}
		driver.close();
	}

}
