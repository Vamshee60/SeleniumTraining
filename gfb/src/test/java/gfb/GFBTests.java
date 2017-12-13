package gfb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class GFBTests {
	String url = "https://www.google.com/flights/beta";

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\personal\\selenium\\gfb\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		final By byFromTxt = By.xpath("");
		driver.findElement(By.xpath(""));

		// create web driver wait object
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// poll for every 1 sec
		wait.pollingEvery(1, TimeUnit.SECONDS);

		// wait for some thing to happen
		//use existing selenium conditions
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(byFromTxt));
		
		
		//write our own waiting condition
		wait.until(new Function<WebDriver, Boolean>() {

			public Boolean apply(WebDriver driver) {
				boolean isFound = false;
				try {
					driver.findElement(byFromTxt);
					isFound = true;
				} catch (Exception e) {
					isFound = false;
				}
				return isFound;
			}

		});
		
		
//		crea page 1 page object with url > this opens the browser and loads the web page1
//		enter user id
//		enter password
//		click submit button
//		
//		web page 2 opens automatically in browser with success message
//		
//		create page object 2 with out url
//		then get the succeess message ,and assert 
		
		
		
		
		
		
		driver.quit();
	}

}
