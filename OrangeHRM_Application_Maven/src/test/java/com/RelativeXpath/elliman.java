package com.RelativeXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class elliman {
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\SriniSir_AutomationScripts\\OrangeHRM_Application_Maven\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		String ApplicationURL = "https://www.elliman.com/newyork/associate/612-a-df22101419145266183/anil-thomas";
		driver.navigate().to(ApplicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("************Successfully Browser Launched ********* ");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void ellimanTest() {
		//<span> 129-30 155th Street </span>
		//<span class="listing-item__name"><span> 129-30 155th Street </span></span>
		
		// // //*[@class='listing-item__name']
		By listingItemLocator=By.xpath("//*[@class='listing-item__name']");
		WebElement listingItem = driver.findElement(listingItemLocator);
		listingItem.click();
	}

}
