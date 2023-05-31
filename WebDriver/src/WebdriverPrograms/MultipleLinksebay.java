package WebdriverPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLinksebay {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com/");
		driver.manage().window().maximize();
		String mainwindow=driver.getWindowHandle();
		
		List <WebElement> Alllinks = driver.findElements(By.tagName("a"));
		for(WebElement links : Alllinks) {
			 if(!links.equals(mainwindow)) {
				 if(links.isDisplayed()) {
				 String linktext = links.getText();
				 System.out.println(linktext);
				 Actions action = new Actions(driver);
				 action.contextClick(links).build().perform();
				 
				 // Robot class
				 Robot robo = new Robot();
				 robo.keyPress(KeyEvent.VK_DOWN);
				 robo.keyRelease(KeyEvent.VK_DOWN);
				 robo.keyPress(KeyEvent.VK_ENTER);
				 robo.keyRelease(KeyEvent.VK_ENTER);
				Set<String> childWindows=  driver.getWindowHandles();
				for (String windows:childWindows) {
					if (!mainwindow.equals(windows))
						{
						driver.switchTo().window(windows);
						Thread.sleep(2000);
						driver.close();
					}
				}
				driver.switchTo().window(mainwindow);
				//driver.close();
				
				 }
			 }
				 
		}
	}

}
