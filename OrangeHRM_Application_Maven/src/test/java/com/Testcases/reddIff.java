package com.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class reddIff {

	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\SriniSir_AutomationScripts\\OrangeHRM_Application_Maven\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		String ApplicationURL = "http://register.rediff.com/register/register.php?FormName=user_details";
		driver.navigate().to(ApplicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("************Successfully Browser Launched ********* ");
	}
	
	@Test
	public void reddIff() {
		
		// <input type="text" onblur="fieldTrack(this);" name="name60a3d24a" value="" style="width:185px;" maxlength="61">
		//----------
		//Single attribute //tagName[@AttributeType="Attribute Value"]
		// //input(@onblur='fieldTrack(this);'
		// Start with syntax = //tagName[Starts-with(@attributeType,'AttributeValue');
		// //input[Starts-with(@name,'name')]
		By fullNameLocator = By.xpath("//input[starts-with(@name,'name')]");
		WebElement fullName=driver.findElement(fullNameLocator);
		fullName.sendKeys("Testing");
	}
	

}
