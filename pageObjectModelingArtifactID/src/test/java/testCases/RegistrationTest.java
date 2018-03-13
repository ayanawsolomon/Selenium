package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import objectRepository.Browser;
import objectRepository.RegistrationPage;

public class RegistrationTest {

	public static void main(String[] args) {
		new Browser("Firefox");
		WebDriver driver = Browser.driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://newtours.demoaut.com/mercuryregister.php";
		driver.get(url);
		RegistrationPage r = new RegistrationPage(driver);
		r.autofill();
		r.password.sendKeys("sdfsdfds");
		r.cPassword.sendKeys("sdfdsfsdf");
		r.submit.click();
		
		

	}

}
