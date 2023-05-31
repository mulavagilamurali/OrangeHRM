package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datadrivenlogic {
	WebDriver driver;
	@Given("^open facebook URL$")
	public void open_facebook_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
	   
	}

	@When("^user enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String uname) throws Throwable {
		 driver.findElement(By.xpath("input[@id='email']")).sendKeys(uname);
	    
	}

	@When("^usre enter password as \"([^\"]*)\"$")
	public void usre_enter_password_as(String pass) throws Throwable {
		 driver.findElement(By.xpath("input[@id='pass']")).sendKeys(pass);
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		 driver.findElement(By.xpath("input[@id='u_0_k_l9']")).click();
	   
	}

	@Then("^close fb browser$")
	public void close_fb_browser() throws Throwable {
	    driver.close();
	}
}
