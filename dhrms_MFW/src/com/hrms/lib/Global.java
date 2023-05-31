package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	// maintains all variable and objects related to HRMS
	//Variables
	WebDriver driver;
	public String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public String un = "Admin";
	public String pw = "admin123";
	//Objects
	public String txt_username = "txtUsername";
	public String txt_password = "txtPassword";
	public String btn_login = "btnLogin";
	public String welcome_menu = "welcome";
	public String btn_logout = "Logout";
}