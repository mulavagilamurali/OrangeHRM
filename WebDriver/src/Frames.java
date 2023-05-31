import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/MURALI_LIVETECH/SamreenMadam/Frames&DragNDrop_20Sep2021/frames.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"001\"]")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@id=\"002\"]")).sendKeys("Hi");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//*[@id=\"003\"]")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		driver.close();
	}

}
