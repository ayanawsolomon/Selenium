package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class loginlogout {
	WebDriver driver;
 // @Test(dataProvider = "dp")
 // public void f(Integer n, String s) {
//	  
//		  
//  }
  @Test
  public void testIncorrectData() {
		driver.findElement(By.name("userName")).sendKeys("abcdef");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(driver.findElement(By.linkText("SIGN-ON")).isDisplayed());
  }
  @Test
  public void testCorrectData() {
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());
  }
  @BeforeMethod
  public void beforeMethod() {
	  try {
		  driver.findElement(By.linkText("SIGN-ON")).click();  
	  }catch(Exception e){
		  driver.findElement(By.linkText("SIGN-OFF")).click();
	  }
	  
	
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// Create an object to open any browser
		// WebDriver driver = new FirefoxDriver();
	    driver = new ChromeDriver();
		// Open your website under test using webdriver
		driver.get("http://newtours.demoaut.com/");

  }

  @AfterClass
  public void afterClass() {
		 driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
