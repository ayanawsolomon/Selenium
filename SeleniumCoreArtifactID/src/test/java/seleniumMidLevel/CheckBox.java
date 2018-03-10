package seleniumMidLevel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		// Testing check box
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
 
		driver.get("http://localhost:8888/test/testpage.php"); // opening a website
        List<WebElement> checkBoxs = driver.findElements(By.cssSelector("input[type='checkbox']"));
        // uncheck all check boxes
        for(WebElement checkBox : checkBoxs){
        	if(checkBox.isSelected()){
        		checkBox.click();
        	}
        	// Check the bike box only 
        	if(checkBox.getAttribute("value").contains("Bike")){
        		checkBox.click();
        	}
        }
	}

}
