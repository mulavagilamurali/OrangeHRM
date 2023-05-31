package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {
	
	WebDriver driver;
	String ApplicationURL = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	WebElement welcome;
	
	public OrangeHRMApplicationMethods(Hooks hook) {
		driver = hook.driver;
	}
	
	@Given("User should Launch chrome browser")
	public void user_should_Launch_chrome_browser()  {
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    System.out.println("Successfully launched Browser");
	}

	@When("User should enter valid OrangeHRM application URL Address")
	public void user_should_enter_valid_OrangeHRM_application_URL_Address() {
	    driver.navigate().to(ApplicationURL);
	    System.out.println("Successfully Launched orangeHRM application");
	}

	@Then("User should navigate to OrangeHRM application URL Address")
	public void user_should_navigate_to_OrangeHRM_application_URL_Address() {
		By LoginPanelLocator = By.id("logInPanelHeading");
		WebElement LoginPanel = driver.findElement(LoginPanelLocator);
		String actual_LoginPanelText = LoginPanel.getText();
		String expected_LoginPanelText="LOGIN Panel";
		if (actual_LoginPanelText.equals(expected_LoginPanelText)) {
			System.out.println("Successfully Navigated to URL");
		} else {
			System.out.println("Failed to navigated to URL Address");
		}
			
	}
	// Validating login page with single user
	
	@Then("^User should enter valid username and password and click on Login button$")
	public void user_should_enter_valid_username_and_password_and_click_on_Login_button() throws InterruptedException  {
		By userNameLocator=By.id("txtUsername");
		WebElement userName = driver.findElement(userNameLocator);
		userName.sendKeys("Admin");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("Mdishi0@@");
		
		//Password
		By passwordLocator = By.id("txtPassword");
		WebElement passwrod = driver.findElement(passwordLocator);
		passwrod.sendKeys("Mdishi0@@");
		
		Thread.sleep(2000);
		//Login button
		By loginbtnLocator = By.id("btnLogin");
		WebElement loginbtn = driver.findElement(loginbtnLocator);
		loginbtn.click();
	}

	@Then("^User should navigate to OrangeHRM application home page$")
	public void user_should_navigate_to_OrangeHRM_application_home_page() {
		 By welcomeLocator= By.id("welcome");
		   welcome = driver.findElement(welcomeLocator);
		   String actual_welcomeText = welcome.getText();
		   String expected_welcomeText = "Welcome Admin";
		   if (actual_welcomeText.equals(expected_welcomeText)) {
			   System.out.println("Successfully navigated to Home page");
		   }
		   else {
			   System.out.println("Unable to navigated to Home Page");
		   }
	}
	
	//Add Employee Page validation
	
	@Then("^User should navigate Admin module page$")
	public void user_should_navigate_Admin_module_page() {
	    Actions pim = new Actions(driver);
	    By pimLocator = By.linkText("PIM");
		WebElement pimElement = driver.findElement(pimLocator);
		pim.moveToElement(pimElement).build().perform();
		
		By addEmployeeLocator = By.linkText("Add Employee");	
		WebElement addEmployeeElement = driver.findElement(addEmployeeLocator);
		addEmployeeElement.click();
		System.out.println("opened add employee page");
		
		By addEmployeecontentLocator = By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
		WebElement addEmployeeText = driver.findElement(addEmployeecontentLocator);
		String actual_AddEmployeePage = addEmployeeText.getText();
		String expected_AddEmployeePage = "Add Employee";
		
		if(actual_AddEmployeePage.equals(expected_AddEmployeePage)) {
			System.out.println("Successfully navigated to Add employee Page");
		}
		else {
			System.out.println("Unable to navigated to Add Employee Page");
		}
	
	}
	
	// Logout operation
	
	@Then("^User should logout from application$")
	public void user_should_logout_from_application() {
	
	 welcome.click();
	 By logOutLocator =  By.linkText("Logout");
	 WebElement logout = driver.findElement(logOutLocator);
	 logout.click();
	 System.out.println("Successfully logout from application");
	}
	
	// Validating Login page with Multiple users Test Data
	
	@Then("^User should enter  \"([^\"]*)\" and \"([^\"]*)\" and click on Login button$")
	public void user_should_enter_and_and_click_on_Login_button(String username, String password) {
		
		By userNameLocator=By.id("txtUsername");
		WebElement userName = driver.findElement(userNameLocator);
		userName.sendKeys(username);
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("Mdishi0@@");
		
		//Password
		By passwordLocator = By.id("txtPassword");
		WebElement passwrod = driver.findElement(passwordLocator);
		passwrod.sendKeys(password);
		
		//Login button
		By loginbtnLocator = By.id("btnLogin");
		WebElement loginbtn = driver.findElement(loginbtnLocator);
		loginbtn.click();
	}
	
	// Closing Browser
	
	@Then("User should close OrangeHRM application")
	public void user_should_close_OrangeHRM_application() {
	    driver.close();
	    System.out.println("Successfully Closed Browser");
	}


}
