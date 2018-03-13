package seleniumMidLevel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingAlerts {

	public static void main(String[] args) {
		// Testing alerts , confirm and prompt
		// how to test calendar
		System.setProperty("webdriver.gecko.driver", utility.PathList.firefoxDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
 
		driver.get("http://localhost/test/testpage.php"); // opening a website
		// accessing alerts
		driver.findElement(By.id("alert")).click();
		

		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		if(alertText.contains("Solomon")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		driver.switchTo().alert().accept();
		

	}

}
