package com.orange.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	
		private WebDriver driver;
		public loginPage (WebDriver driver)
		{
			this.driver = driver;
		}
		private By username=By.id("txtUsername");
		private By password=By.id("txtPassword");
		private By login = By.id("btnLogin");
		
		private void setUsername(String uname)
		{
			driver.findElement(username).sendKeys(uname);
		}
		private void setPassword(String pwd)
		{
			driver.findElement(password).sendKeys(pwd);
		}
		private void clickOnLogin() {
			driver.findElement(login).click();
		}
		public void orangeHRMLogin(String uname, String pwd) {
			this.setUsername(uname);
			this.setPassword(pwd);
			this.clickOnLogin();
			
		}

}
