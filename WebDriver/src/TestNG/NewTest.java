package TestNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeClass
  public void f() {
	  System.out.println("Before Class");
	 /* System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.amazon.in/");*/
  }
  @AfterClass
  public void close() {
	  //driver.close();
	  System.out.println("After Class");
  }
  @Test(priority=1)
  public void london() {
	  System.out.println("Im in london");
  }
  @Test(priority=2)
  public void Canada() {
	  System.out.println("I am in canada");
  }
}
