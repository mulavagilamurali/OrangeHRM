package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert_popup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.spicejet.com/");
		System.out.println("Selected by from city1");
		Thread.sleep(3000);
		Select departurecity = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']")));
		System.out.println("Selected by from city");
		departurecity.selectByVisibleText("Hyderabad (HYD)");
		System.out.println("Selected by from city");
		driver.close();

	}

}
