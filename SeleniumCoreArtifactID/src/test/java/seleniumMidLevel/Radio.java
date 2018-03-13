package seleniumMidLevel;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args) {
		// How to test Radio
		
		System.setProperty("webdriver.gecko.driver", utility.PathList.firefoxDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
 
		driver.get("http://localhost/test/testpage.php"); // opening a website

		// testing radio  
		driver.findElement(By.id("other")).click();
		driver.findElements(By.name("gender")).get(1).click();
		driver.findElement(By.xpath(".//*[@id='other']")).click();
		driver.findElement(By.cssSelector("input[name='gender'][value='female']")).click();
		
	
	}

}
