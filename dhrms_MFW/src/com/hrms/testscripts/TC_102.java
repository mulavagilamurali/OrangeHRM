package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
import com.hrms.utility.*;

public class TC_102 {

@Test
public void addEmployee() throws Exception {
	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	DOMConfigurator.configure("log4j.xml");
		General g = new General();
		g.open_Application();
		g.login();
		g.add_Employee();
		g.logout();
		g.close_Application();

	}

}
