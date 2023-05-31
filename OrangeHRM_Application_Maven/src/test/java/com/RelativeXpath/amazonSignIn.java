package com.RelativeXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class amazonSignIn {
	
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\SriniSir_AutomationScripts\\OrangeHRM_Application_Maven\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		String ApplicationURL = "https://www.amazon.in/";
		driver.navigate().to(ApplicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Log.info("************Successfully Browser Launched ********* ");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void amazonSignInTest() {
		//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>
		// //*[@text()='Hello, sign in']
		WebElement helloSignIn =driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		Actions helloSign =new Actions(driver);
		helloSign.moveToElement(helloSignIn).build().perform();
		// <span class="nav-action-inner">Sign in</span>
		// //*[text()='Sign in']
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		
		
	}

}
