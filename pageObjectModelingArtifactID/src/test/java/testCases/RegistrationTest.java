package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import objectRepository.Browser;
import objectRepository.RegistrationPage;

public class RegistrationTest {

	public static void main(String[] args) {
		// chgeck registraion page is working or not
		Browser b = new Browser("Chrome");
		WebDriver driver =b.driver;
		
		RegistrationPage r = new RegistrationPage(driver);
		
		r.autoFill("solomon", "habtu", "ayanawsolomon@gmail.com");
		

	}

}
