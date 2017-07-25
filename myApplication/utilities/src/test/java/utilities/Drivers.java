package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {
	// TODO Auto-generated method stub
public static WebDriver driver = new ChromeDriver();
public static void chromeSet(){
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");

}
}
