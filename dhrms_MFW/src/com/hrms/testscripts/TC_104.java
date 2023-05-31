package com.hrms.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.navigate().to("https://encouraged.be/");
		driver.findElement(By.xpath("//*[@id=\"email_id\"]")).sendKeys("hilton@gm.com");
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/div[2]/div/input[2]")).click();
	}

}
