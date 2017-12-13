package vamshee.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFlightsbeta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stallone\\workspace\\Frameworks\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/flights/beta");
		Thread.sleep(5000);
		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='sb_ifc50'])"));
	}

}
