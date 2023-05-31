package com.orange.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orange.pages.loginPage;
import com.orange.utilities.Browser;

public class TC_001 {
	
  WebDriver driver;
  
  @BeforeTest
  public void setup()
  {
	  driver=Browser.launchBrowser();
	  Browser.openURL();
  }
  @AfterTest
  public void teardown()
  {
	  Browser.closeBrowser();
  }
  
  @Test
  public void verifyLogin() {
	  loginPage login=new loginPage(driver);
	  login.orangeHRMLogin("Admin", "Mdishi0@@");
  }
}
