package com.Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class LoginTest extends BaseTest {

	@Test
	public void loginPageTest() throws IOException, InterruptedException {
		Thread.sleep(5000);
		FileInputStream configPropertiesFile = new FileInputStream("E:\\SriniSir_AutomationScripts\\OrangeHRM_Application_Maven\\src\\main\\java\\com\\Config\\OrangeHRMApplication.properties");
		Properties configProperty = new Properties();
		configProperty.load(configPropertiesFile);
		//Thread.sleep(5000);

		// UserName
		By userNameLocator=By.id(configProperty.getProperty("loginPageUserName"));
		WebElement userName = driver.findElement(userNameLocator);
		userName.sendKeys("Admin");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("Mdishi0@@");
		
		//Password
		By passwordLocator = By.id(configProperty.getProperty("loginPagePassword"));
		WebElement passwrod = driver.findElement(passwordLocator);
		passwrod.sendKeys("Mdishi0@@");
		
		//Login button
		By loginbtnLocator = By.id(configProperty.getProperty("loginPageSubmitBtn"));
		WebElement loginbtn = driver.findElement(loginbtnLocator);
		loginbtn.click();
		Thread.sleep(5000);
		Log.info("Sucessfully Login into home Page");
		// 14
		
	}
}
