package com.vamshee.phptravelsautomation.tests.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class BaseTest {
	
	public void takeScreenShot(WebDriver driver) {
		takeScreenShot(driver,"");
	}

	public void takeScreenShot(WebDriver driver, String msg) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenShotPath = "C:/Users/Stallone/Documents/GitHub/SeleniumTraining/phptravelsautomation/screenshots/store" + System.currentTimeMillis() + ".png";
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
