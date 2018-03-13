package seleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuSelectionAction {

	public static void main(String[] args) throws InterruptedException {
		// This program is used to use mouse over on menu and select from the list.
System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
		
		WebDriver driver = new ChromeDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost/test/testPage2.php");
		WebElement menu = driver.findElement(By.id("menu"));
		Actions action = new Actions(driver);
		
		action.moveToElement(menu).build().perform();
		action.moveByOffset(50, 100).perform();
		Thread.sleep(4000);
		action.click().perform();
		
		
		//action.dragAndDrop(source, target)

	}

}
