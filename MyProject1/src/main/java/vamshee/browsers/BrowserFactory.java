package vamshee.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * This will generate required browser
 * @author Stallone
 *
 */
public class BrowserFactory {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Stallone\\workspace\\Frameworks\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		 driver.findElement(By.id("lst-ib")).sendKeys("Selenium Training");
		 driver.findElement(By.name("btnK")).click();
		 Thread.sleep(3000);
		 driver.quit();
		 
}
/**
 * In this method  will create and return a simple chromedriver
 */
	public WebDriver getChromeDriver()
	{
	WebDriver driver=new ChromeDriver(); 
	return driver;
	}
}
