package com.Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class RadioButtons {
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\SriniSir_AutomationScripts\\OrangeHRM_Application_Maven\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		String ApplicationURL = "https://echoecho.com/htmlforms10.htm";
		driver.navigate().to(ApplicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		Log.info("************Successfully Browser Launched ********* ");
	}
	
	@Test
	public void radioButtons() {
	By radioButtonsLocator =	By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td");
	WebElement radioButtons = driver.findElement(radioButtonsLocator);
	List<WebElement> groupName = driver.findElements(radioButtonsLocator);
	  System.out.println(groupName.size()); 

	  for (int groupNameIndex=0;groupNameIndex<groupName.size();groupNameIndex++) {
	  String groupNameText = radioButtons.getAttribute("name");
	  System.out.println(groupNameText); 
	  }
	
	List<WebElement> group1Values =radioButtons.findElements(By.name("group1"));
	System.out.println(group1Values.size());
	for(int radioButtonIndex=0;radioButtonIndex<group1Values.size();radioButtonIndex++) {
		group1Values.get(radioButtonIndex).click();
		for(int index=0;index<group1Values.size();index++) {
			String products = group1Values.get(index).getAttribute("value");
			String checkedItems = group1Values.get(index).getAttribute("checked");
			System.out.println(checkedItems+"-"+products);
		}
	}
		
		//driver.findElement(By.name("name9e9ddf8f")).sendKeys("Test");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}