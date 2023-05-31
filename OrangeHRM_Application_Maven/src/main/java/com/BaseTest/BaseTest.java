package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\SriniSir_AutomationScripts\\OrangeHRM_Application_Maven\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		String ApplicationURL = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.navigate().to(ApplicationURL);
		Log.info("************Successfully Browser Launched ********* ");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		Log.info("************Successfully Closed Browser ********* ");

	}

}
