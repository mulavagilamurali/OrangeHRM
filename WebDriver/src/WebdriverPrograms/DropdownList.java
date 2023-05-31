package WebdriverPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(all);
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		select.selectByValue("search-alias=appliances");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Electronics");
		Thread.sleep(2000);
		List<WebElement> alloptions = select.getOptions();
		
		 ArrayList<String> alloptionsvalue = new ArrayList<String>();
		 Iterator<WebElement> ir= alloptions.iterator();
		 
		 while (ir.hasNext())
		 {
			String data = ir.next().getText();
			alloptionsvalue.add(data);
		 }
		 System.out.println("Dropdown Values:...");
		 Iterator <String> dropdownlist = alloptionsvalue.iterator();
		 while(dropdownlist.hasNext())
		 {
			 System.out.println(dropdownlist.next());
		 }
		driver.close();
	}

}

// Class = Select
// methods = selectByIndex, selectByValue, selectByVisibleText
// Access = By object
//All Option = getOptions()
//get the text = getText()

