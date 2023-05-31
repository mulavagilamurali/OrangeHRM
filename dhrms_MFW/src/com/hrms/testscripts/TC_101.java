package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_101 {
@Test
public void login() throws Exception {
	//public static void main(String[] args) {
		// login functionality
		DOMConfigurator.configure("log4j.xml");
		General g = new General();
		g.open_Application();
		g.login();
		g.logout();
		g.close_Application();
	}

}
