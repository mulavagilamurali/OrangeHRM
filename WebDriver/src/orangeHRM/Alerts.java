package orangeHRM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		//driver.findElement(By.className("button")).click();
		Alert alerts = driver.switchTo().alert();
		////String str = alerts.getText();
		System.out.println(alerts.getText());
		alerts.accept();
	}

}
