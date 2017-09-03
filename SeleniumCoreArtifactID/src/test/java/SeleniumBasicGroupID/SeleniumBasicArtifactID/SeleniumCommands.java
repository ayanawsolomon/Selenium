package SeleniumBasicGroupID.SeleniumBasicArtifactID;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// Selenium commands
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
		driver.get("http://newtours.demoaut.com/"); // opening a website
		System.out.println(driver.getTitle()); // prints you current page title
		System.out.println("Current page URL is:" + driver.getCurrentUrl()); // prints the current url
		//System.out.println(driver.getPageSource()); // prints you over all code of your current page
		System.out.println("Page ID is :" + driver.getWindowHandle()); // prints you the ID of current window
		//driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		Assert.assertEquals(1, 2);
		// driver.switchTo() // switching between pages, alerts and frames
		//driver.close(); // is closing properly 
		//driver.quit(); // is closing forcefully 
		
		

	}

}
