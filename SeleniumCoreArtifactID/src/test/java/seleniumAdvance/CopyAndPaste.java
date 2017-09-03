package seleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {

	public static void main(String[] args) {
		// this program is to copy and paste text from a box to another box
		// also to write uppercase text 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost/test/testPage.php");
		WebElement nameElement = driver.findElement(By.name("name"));
		WebElement commentElement = driver.findElement(By.name("comment"));
		// using action libray copy text from nameElement
		Actions action = new Actions(driver);
		action.moveToElement(nameElement).doubleClick().build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		action.click(commentElement).keyDown(Keys.CONTROL).sendKeys("v").
		keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
		
		

	}

}
