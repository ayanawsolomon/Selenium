package seleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterToEnableAndDisableElement {

	public static void main(String[] args) throws InterruptedException {
		// this java program uses javaScriptExecuter to Enable and disable an element
		System.setProperty("webdriver.gecko.driver", utility.PathList.chromeDriver);
		WebDriver driver = new FirefoxDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost/test/testPage.php");		
		//To disable First Name text box 
		JavascriptExecutor javascript = (JavascriptExecutor) driver; 
		String todisable = "document.getElementByName('name').disabled = true;  ";
		javascript.executeScript(todisable); 
		Thread.sleep(2000); 
		//To enable Last Name text box 
		String toenable = "document.getElementByName('name').disabled = false; ";
		javascript.executeScript(toenable); Thread.sleep(3000);

	}

}
