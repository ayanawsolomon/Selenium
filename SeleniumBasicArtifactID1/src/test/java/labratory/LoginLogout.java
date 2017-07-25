package labratory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", value);
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedirver.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.get("http://newtours.demoaut.com/");
				driver.findElement(By.name("userName")).sendKeys("a");
				driver.findElement(By.name("password")).sendKeys("a");
				driver.findElement(By.name("login")).click();
				driver.findElement(By.linkText("SIGN-OFF")).click();
				driver.close();
				
	}

}
