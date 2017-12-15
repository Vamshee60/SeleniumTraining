package tests.gfb;

import java.io.File;
import java.io.IOException;
import org.testng.Reporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.gfb.GoogleFlightsBetaPage;

public class GFBPageTest {
	/**
	 * This test is to open a google flight page in chrome browser.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testPageLoad() throws Exception {
		// Webdriver setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stallone\\workspace\\Frameworks\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Create GFB page object
		GoogleFlightsBetaPage gfbPage = new GoogleFlightsBetaPage(driver);
		gfbPage.open();

		Thread.sleep(5000);

		// driver.manage().window().maximize();
		takeScreenShot(driver);
		// Assert on current URL
		String CurrentUrl = driver.getCurrentUrl();
		Assert.assertEquals(CurrentUrl.startsWith(GoogleFlightsBetaPage.URL), true);
		/*
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//div[@id='sb_ifc50'])"));
		 */
		gfbPage.fromLocation();
		driver.quit();

	}

	public void takeScreenShot(WebDriver driver) {
		takeScreenShot(driver,"");
	}

	public void takeScreenShot(WebDriver driver, String msg) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenShotPath = "C:/selenium/store" + System.currentTimeMillis() + ".png";
		try {
			// now copy the screenshot to desired location using copyFile
			// //method
			FileUtils.copyFile(src, new File(screenShotPath));

			Reporter report = new Reporter();
			report.log(msg + " " + "<a href='file:///" + screenShotPath + "'>ScreenShot</a>");
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
}
