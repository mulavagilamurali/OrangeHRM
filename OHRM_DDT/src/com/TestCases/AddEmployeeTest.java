package com.TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

public class AddEmployeeTest extends BaseTest{
	
	Properties configProperty;
	@Test(priority=1,description="Login Page Test")
	public void loginPageTest() throws IOException, InterruptedException {
		Thread.sleep(5000);
		FileInputStream configPropertiesFile = new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");
		configProperty = new Properties();
		configProperty.load(configPropertiesFile);
		// Validating login Panel
		String expectedLoginPanelText = "LOGIN Panel";
		By loginPanellocator = By.id(configProperty.getProperty("loginPanel"));
		WebElement loginPanel = driver.findElement(loginPanellocator);
		String actualLoginPanelText = loginPanel.getText();
		if(actualLoginPanelText.equals(expectedLoginPanelText)) {
			System.out.println("Validated login panel - Pass");
		}
		else {
			System.out.println("Validated login panel - Fail");

		}
		// UserName
		By userNameLocator=By.id(configProperty.getProperty("loginPageUserName"));
		WebElement userName = driver.findElement(userNameLocator);
		userName.sendKeys("Admin");
		//Password
		By passwordLocator = By.id(configProperty.getProperty("loginPagePassword"));
		WebElement passwrod = driver.findElement(passwordLocator);
		passwrod.sendKeys("Mdishi0@@");
		//Login button
		By loginbtnLocator = By.id(configProperty.getProperty("loginPageSubmitBtn"));
		WebElement loginbtn = driver.findElement(loginbtnLocator);
		loginbtn.click();
		Thread.sleep(5000);		
		
	}
	@Test(priority=2,description="Add Employee Test")
	public void addEmployeeTest() throws InterruptedException, IOException {
		Actions pim = new Actions(driver);
		By pimLocator = By.linkText("PIM");
		WebElement pimElement = driver.findElement(pimLocator);
		pim.moveToElement(pimElement).build().perform();
		By addEmployeeLocator = By.linkText("Add Employee");	
		WebElement addEmployeeElement = driver.findElement(addEmployeeLocator);
		addEmployeeElement.click();
		System.out.println("opened add employee page");
		
		// Adding employee in OrangeHRM
		By firstNameLocator = By.id(configProperty.getProperty("firstName"));
		WebElement firstName = driver.findElement(firstNameLocator);
		firstName.sendKeys("Philips");
		
		Actions addEmployeePage = new Actions(driver);
		addEmployeePage.sendKeys(Keys.TAB).build().perform();
		// LastName
		addEmployeePage.sendKeys(Keys.TAB).build().perform();
		addEmployeePage.sendKeys("Glenn").build().perform();
		addEmployeePage.sendKeys(Keys.TAB).build().perform();
		// FileUploading
		addEmployeePage.sendKeys(Keys.TAB).build().perform();
		addEmployeePage.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);		

		java.lang.Runtime.getRuntime().exec("E:\\SriniSir_AutomationScripts\\OHRM_DDT\\AutoIT\\addEmployee1.exe");
		By saveBtnLocator = By.id("btnSave");
		WebElement saveBtn = driver.findElement(saveBtnLocator);
		saveBtn.click();
		System.out.println("Image Saved Successfully");
		Thread.sleep(5000);		

	}
	
}
