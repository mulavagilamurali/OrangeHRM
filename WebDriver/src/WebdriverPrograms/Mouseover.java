package WebdriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(account).build().perform();
		driver.findElement(By.xpath("//span[text()='Baby Wish List']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
// Class = Actions
// Access = by Object
// method= moveToElement
