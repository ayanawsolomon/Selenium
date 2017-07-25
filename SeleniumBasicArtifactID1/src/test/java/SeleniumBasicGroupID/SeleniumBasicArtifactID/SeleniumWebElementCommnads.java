package SeleniumBasicGroupID.SeleniumBasicArtifactID;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebElementCommnads {

	public static void main(String[] args) {
		// learning web element commands
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
		driver.get("http://newtours.demoaut.com/"); // opening a website
		
		WebElement userName =driver.findElement(By.name("userName"));
		userName.clear(); // if it has some text, it will clear it
		userName.click(); // clicking the element if it is able to be clicked
		System.out.println("user name box Size is: " + userName.getAttribute("size")); // to get attribute value of that element
		System.out.println("User name input type is :" + userName.getAttribute("type"));
		Point location = userName.getLocation();
		System.out.println("Input box is located at :" + "x=" + location.x + " and y=" + location.y );
		Dimension size = userName.getSize(); // to get the size of the element 
		System.out.println("size of input box is " + size.height + " , " + size.width);
		System.out.println("Tag name of user name element is :" + userName.getTagName()); // prints you the the tag name of the element 
		System.out.println("Text of Sign on link is : " + driver.findElement(By.linkText("SIGN-ON")).getText());
		if(userName.isDisplayed()){
			System.out.println("Yes User name is visible on the current page");
		}else{
			System.out.println("Element is not visible on the current page");
		}
		if(userName.isEnabled()){
			System.out.println("Element is active on the screen");
		}else{
			System.out.println("Element is not active on the screen");
		}
		if(userName.isSelected()){
			System.out.println("element is selected right now");
		}else{
			System.out.println("Element is not selected");
		}
System.out.println("Background color of user name element is: " + userName.getCssValue("background-color"));
	userName.sendKeys("solomon"); // to type on that element 
	//userName.submit(); // submit is same of finding and click an element for next action 
	// userName.getScreenshotAs("Solomon");
	}

}
