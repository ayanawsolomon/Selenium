package seleniumAdvance;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShot {

	public static void main(String[] args) {
		// Taking screen shot that should run during test case failure
		// This program is to download a file with the help of Robot Java class
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		// Maximize the window
		driver.manage().window().maximize();
		 
		// Pass the url
		driver.get("http://www.google.com");
		 
		// Take screenshot and store as a file format
		
		takeScreenShot(driver, "googleFail");
		 }
	public static void takeScreenShot(WebDriver driver, String fileName){
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:/selenium/" +  fileName + ".png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
	}

	}


