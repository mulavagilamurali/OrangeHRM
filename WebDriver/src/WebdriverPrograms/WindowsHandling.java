package WebdriverPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		
		for (String win : allWindows) {
		if(!mainwindow.equals(win))	
		{
			driver.switchTo().window(win);
			driver.manage().window().maximize();
			Thread.sleep(3000);
	        driver.close();
		}
		}
		driver.switchTo().window(mainwindow);
		Thread.sleep(3000);

		driver.close();
		

	}

}
