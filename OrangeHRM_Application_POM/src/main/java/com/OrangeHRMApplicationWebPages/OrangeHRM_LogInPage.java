package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRM_LogInPage extends BaseTest {
	
	// An Object Repository Class - will be updated with identification of elements of the
		 //   WebPage and Operations done on the WebElements
	
	public OrangeHRM_LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logInPanelHeading")
	WebElement LogInPageLoginPanel;
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement loginPageLoginButton;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	WebElement LoginPageLogo;
	
	public void validatingLoginPanelText() {
		String actual_LoginPanelText = LogInPageLoginPanel.getText();
		String expected_LoginPanelText="LOGIN Panel";
		
		Assert.assertEquals(actual_LoginPanelText,expected_LoginPanelText, "Failed to Navigate to Ohrm Application");
		Log.info("Validated Login Panel Text");
	}
	public void validatingLogin(String userNameTestData,String passwordTestData) {
		userName.sendKeys(userNameTestData);
		password.sendKeys(passwordTestData);
		loginPageLoginButton.click();
		driver.navigate().back();
		userName.clear();
		password.clear();
		Log.info("Successfullly Login into OrangeHRM Application");
	}
	public void validatingLoginPageLogo() {
		boolean flag =LoginPageLogo.isDisplayed();
		Assert.assertTrue(flag, "OrangeHRM Login page does not contains OrangeHRM logo - FAIL");
		Log.info("OrangeHRM login contains OrangeHRM logo-PASS");
	}
}
