package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
		public static WebDriver driver;
	
	@Before
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\SriniSir_AutomationScripts\\OrangeHRMApplication_Cucumber\\BrowserFiles\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@After
	public static void tearDown() {
		driver.close();
	}

}
