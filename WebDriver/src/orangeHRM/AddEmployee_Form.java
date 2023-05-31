package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;


public class AddEmployee_Form {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Completed Login operation");
		Thread.sleep(4000);
		
		Actions ac = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("PIM"));
		ac.moveToElement(element).perform();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']")).click();
		System.out.println("Opened add employee form");
		Thread.sleep(3000);		
		driver.findElement(By.name("lastName")).sendKeys("Murali");	
		driver.findElement(By.name("firstName")).sendKeys("Selenium");
		driver.findElement(By.id("btnSave")).click();
		
		System.out.println("Added employee Details");
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		System.out.println("Closed Application");
	}

}
