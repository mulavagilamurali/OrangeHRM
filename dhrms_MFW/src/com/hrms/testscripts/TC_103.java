package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_103 {
	
@Test
	public void delEmployee() throws Exception {
	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		General g= new General();
		g.open_Application();
		g.login();
		g.del_Employee();
		g.logout();
		g.close_Application();

	}

}
