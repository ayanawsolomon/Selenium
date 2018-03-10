package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class loginLogoutTest {

	public static void main(String[] args) throws InterruptedException {
		// our first selenium class
		// open the firefox driver
		// cup c = new tea();
		/// appium commands to connect to your mobile 
		//name and passwored for testing is stored as follows 
		String[] userName ={"u1", "u2","a", "u3","u4"};
		String[] password= {"p1","p2", "a", "p3", "u4"};
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// opening the newtorus website
		driver.get("http://newtours.demoaut.com/");
		// go through each user name and password, type on newtours page and assert if loign is successfull or not
		for(int abv = 0; abv <=3; abv++){
			driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(userName[abv]);
		driver.findElement(By.name("password")).sendKeys(password[abv]);
		
		driver.findElement(By.name("login")).click();
		try {
			driver.findElement(By.linkText("SIGN-OFF")).click();
			System.out.println("Login was  successfull using User Name='" + userName[abv] + "' and Password='" + password[abv] );

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Login was  not successfull using User Name='" + userName[abv] + "' and Password='" + password[abv] );
		}
		
		} 
		
	
	}

}
