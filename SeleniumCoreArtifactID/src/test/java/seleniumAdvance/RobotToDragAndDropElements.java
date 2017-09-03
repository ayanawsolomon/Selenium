package seleniumAdvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotToDragAndDropElements {

	public static void main(String[] args) throws AWTException {
		// This Selenium Java program is to drag and drop elements using Robot Java Class
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost/test/testPage2.php");
		Robot robot = new Robot();
		Point element2 = driver.findElement(By.id("c2")).getLocation();
		robot.mouseMove(element2.x + 50, element2.y +50);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(4000);
		Point cart2 = driver.findElement(By.id("cart2")).getLocation();
		robot.mouseMove(cart2.x + 100, cart2.y +100);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(4000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}

}
