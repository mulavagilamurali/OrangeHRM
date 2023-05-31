package WebdriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrangNDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement example = driver.findElement(By.xpath("//h2[text()='Examples']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", example);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		System.out.println("Drag and drop completed");
		driver.switchTo().defaultContent();
		driver.close();
	}

}
// Scrolling
// Predefined Interface = JavascriptExecuter (We cannot create a object to Interface)
// By using type casting create object
// JavascriptExecutor js = (JavascriptExecutor)driver.
// method: executeScript 
//
// DragNdrop
// Class = Action
// Method = dragAndDrop(Source, Target)

//