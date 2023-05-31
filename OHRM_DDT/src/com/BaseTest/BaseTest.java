package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver","E:\\SriniSir_AutomationScripts\\OHRM_DDT\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		String ApplicationURL = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.navigate().to(ApplicationURL);
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
