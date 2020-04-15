package amsalu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class loginLogoutTest {

	public static void main(String[] args) throws InterruptedException {
		// our first selenium class
		// open the chrome driver
		
		
		//name and passwored for testing is stored as follows 
		String userName ="a";
		String password="a";
		String Expectedtitle="Find a Flight";
		System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
		WebDriver driver = new ChromeDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// opening the newtorus website
		driver.get("http://newtours.demoaut.com/");
		
		// go through each user name and password, type on newtours page and assert if loign is successfull or not
		
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000); 
		String t= driver.getTitle();
		Assert.assertTrue(t.contains(Expectedtitle));
		System.out.println(t);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
			// close
		driver.findElement(By.name("findFlights")).click();	
		//driver.close();
		
		} 
		
	
	}


