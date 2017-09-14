package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingElementsBy {

	public static void main(String[] args) {
		// WebDriver finding elemetns by ID, Name, LinkText, ParcialLinkText, 
		// Xpath(Absolute, relative) , CssSelector, and TagName
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
		driver.get("http://localhost/test/testPage.php"); // opening a website
		driver.findElement(By.name("CustomerID")).sendKeys("11234");

		driver.findElement(By.id("eml")).sendKeys("ayanawsolomon1@gmail.com");
		driver.findElement(By.name("name")).sendKeys("Solomon");
		driver.findElement(By.xpath("html/body/form[1]/input[3]")).sendKeys("testme.com");// absolute xpaht starts from the html
		driver.findElement(By.xpath("//form[1]/textarea")).sendKeys("I want to change my cherrior"); // relative xpath begins with // means start anywere
		driver.findElement(By.tagName("textarea")).clear();
		driver.findElement(By.tagName("textarea")).sendKeys("I send this text because you found me by tage name");
		 
		driver.findElement(By.className("special")).click();// finding element by class name
		driver.findElement(By.linkText("Open Goodle")).click(); // link text
		driver.navigate().back();
		driver.findElement(By.partialLinkText("and I will open you")).click();// find link by part of the link tex
		driver.navigate().back();
		
      
	}

}
