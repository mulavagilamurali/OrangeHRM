package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;

public class General  extends Global {
	// Maintain all reusable functionalities
	public void open_Application() throws Exception {
		Log.info("Started Execution");
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();		
		driver.navigate().to(url);
		System.out.println("Opened application");
		Log.info("Appllication opened successfully");
		Thread.sleep(2000);
	}
	public void login() throws Exception {
		driver.findElement(By.name(txt_username)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);;
		driver.findElement(By.id(btn_login)).click();
		System.out.println("login completed");
		Log.info("Login completed");
		Thread.sleep(2000);
		
	}
	public void logout() {
		driver.findElement(By.id(welcome_menu)).click();
		driver.findElement(By.linkText(btn_logout)).click();
		System.out.println("logout completed");
		Log.info("Logout Completed");
	}
	public void add_Employee(){
		System.out.println("Added employee details");
		Log.info("added employee");
	}
	public void del_Employee(){
		System.out.println("Deleted employee details");
		Log.info("Deleted Employee");
	}
	
	public void close_Application() {
		driver.close();
	}
	

}
