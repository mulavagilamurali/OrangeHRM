package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	@Parameters("Browser")
	@Test
	public void LoginpageTest(String BrowserName) throws MalformedURLException {
		System.out.println(" The name of the browser ="+BrowserName);
		// DesiredCapabilities
		
		DesiredCapabilities cap=null;
		
		if(BrowserName.equals("chrome")) {
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(BrowserName.equals("firefox")) {
				cap =DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
			}
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.105:4444/wd/hub"),cap);
		String applicationURL = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/";
		driver.get(applicationURL);
		
		// Login Test Scripts
	

		// UserName
		By userNameLocator=By.id("txtUsername");
		WebElement userName = driver.findElement(userNameLocator);
		userName.sendKeys("Admin");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("Mdishi0@@");
		
		//Password
		By passwordLocator = By.id("txtPassword");
		WebElement passwrod = driver.findElement(passwordLocator);
		passwrod.sendKeys("Mdishi0@@");
		
		//Login button
		By loginbtnLocator = By.id("btnLogin");
		WebElement loginbtn = driver.findElement(loginbtnLocator);
		loginbtn.click();

		System.out.println("Successfully login into homepage");
		
	}
	

}
