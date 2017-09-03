package seleniumMidLevel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiPageHandle {

	public static void main(String[] args) {
		// This program is to show you how to handle a page
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
 
		driver.get("http://localhost/test/testpage.php"); // opening a website
		String homePageID= driver.getWindowHandle();
		String yahooID=null;
		System.out.println("home page:" + homePageID);
		driver.findElement(By.partialLinkText("open Yahoo page")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		for(String currID : driver.getWindowHandles()){
			// System.out.println(currID);
			if(! currID.contains(homePageID)){
				yahooID= currID;
			}
		}
		System.out.println("yahoo ID is " + yahooID);
		driver.switchTo().window(yahooID);
		driver.findElement(By.name("p")).sendKeys("Pizza");
		driver.switchTo().window(homePageID);
		driver.findElement(By.id("alert")).click();
		driver.switchTo().window(yahooID);
		// remember this
		driver.findElement(By.name("p")).clear();
		driver.findElement(By.name("p")).sendKeys("Orage");
		
		
	
	}

}
