package SeleniumBasicGroupID.SeleniumBasicArtifactID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenNewTorusWebsite {

	public static void main(String[] args) {
		// Open newtrous.demaout.com
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
			

	}

}
