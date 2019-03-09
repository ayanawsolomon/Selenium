package seleniumMidLevel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class CheckAlerts {

	public static void main(String[] args) {
		// this is to check lerts of test page 
	//	System.setProperty("webdriver.gecko.driver", utility.PathList.firefoxDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
 
		String name="Dawit";
		driver.get("http://localhost/test/testpage.php"); // opening a website
		// accessing alerts
	driver.findElement(By.id("prompt")).click();
	driver.switchTo().alert().sendKeys(name);
	driver.switchTo().alert().accept();
	String text = driver.findElement(By.id("demo")).getText();
	Assert.assertTrue(text.contains(name));
	Assert.assertEquals(text, "Hello " + name+ "! How are you today?");
	driver.close();
	}

}
