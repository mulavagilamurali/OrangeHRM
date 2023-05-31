package com.orange.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Browser {
	private static WebDriver driver;
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
	public static void openURL() {
		driver.navigate().to("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void verifyTitle(String ExpectedUrl) {
		String ActualUrl = driver.getCurrentUrl();
		boolean status = ActualUrl.contains(ExpectedUrl);
		Assert.assertEquals(status,true, "Actual URL does not match with Expected URL /n Expected URL"+ExpectedUrl+"/n Actual Url"+ActualUrl);
	}

}

// launchBrowser
//openUrl
//closeBrowser
// verifyOutput