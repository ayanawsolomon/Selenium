package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginLogoutWithCorrectCredentials {

	public static void main(String[] args) throws InterruptedException {

		/**
		 * Login test with correct user name nad password STeps: Open the website
		 * newtours Type correct user name and password Click login button Then Title
		 * should be Find a Flight Close the website
		 */
		String userName = "a";
		String password = "a";
		String expectedTitle = "Find a Flight";

		System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// opening the newtorus website
		driver.get("http://newtours.demoaut.com/");

		// type user name and password
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);

		// click loing and sleep for a while
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);

		// get title and asset
		String t = driver.getTitle();
		System.out.println(t);
		Assert.assertTrue(t.contains(expectedTitle));

		// close
		driver.close();

	}

}
