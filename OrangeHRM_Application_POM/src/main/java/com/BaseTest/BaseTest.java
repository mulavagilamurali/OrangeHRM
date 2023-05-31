package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	
	public static WebDriver driver;
	String ApplicationURL;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\SriniSir_AutomationScripts\\OrangeHRM_Application_Maven\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		ApplicationURL = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.navigate().to(ApplicationURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		Log.info("************Successfully Browser Launched ********* ");
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		Log.info("************Successfully Closed Browser ********* ");

	}

}
