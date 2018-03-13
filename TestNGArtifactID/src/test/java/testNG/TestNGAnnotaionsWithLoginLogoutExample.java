package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNG.Listner.class)

public class TestNGAnnotaionsWithLoginLogoutExample {
	WebDriver driver;
	@BeforeClass
	public void steChrome(){
		 System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
			
			// Create an object to open any browser
			// WebDriver driver = new FirefoxDriver();
			driver = new ChromeDriver();
			// Open your website under test using webdriver
			driver.get("http://newtours.demoaut.com/");
		
	}
	
	@BeforeMethod
	public void thisIsBeforeMethod(){
		System.out.println("--------------------this is before each tesdt case runs");
	}
  @Test
  public void logonLogoutTestFor1() {
	 
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();
		try{
			
			driver.findElement(By.linkText("SIGN-OFF")).click();
			Assert.assertTrue(1==1);
			

			}catch(Exception e){
				Assert.fail();
			}
	  
  }
  
  @Test
  public void logonLogoutTestFor2() {
	 
		driver.findElement(By.name("userName")).sendKeys("b");
		driver.findElement(By.name("password")).sendKeys("b");
		driver.findElement(By.name("login")).click();
		try{
			
			driver.findElement(By.linkText("SIGN-OFF")).click();
			Assert.assertTrue(1==1);
			

			}catch(Exception e){
				Assert.fail();
			}
	  
  }
  
  @Test
  public void logonLogoutTestFor3() {
	 
		driver.findElement(By.name("userName")).sendKeys("k");
		driver.findElement(By.name("password")).sendKeys("k");
		driver.findElement(By.name("login")).click();
		try{
			
			driver.findElement(By.linkText("SIGN-OFF")).click();
			Assert.assertTrue(1==1);
			

			}catch(Exception e){
				Assert.fail();
			}
	  
  }
  
  @Test
  public void logonLogoutTestFor4() {
	 
		driver.findElement(By.name("userName")).sendKeys("gfhfghcc");
		driver.findElement(By.name("password")).sendKeys("c");
		driver.findElement(By.name("login")).click();
		try{
			
			driver.findElement(By.linkText("SIGN-OFF")).click();
			Assert.assertTrue(1==1);
			

			}catch(Exception e){
				Assert.fail();
			}
	  
  }
  
  
  @Test
  public void logonLogoutTestFor5() {
	 
		driver.findElement(By.name("userName")).sendKeys("c");
		driver.findElement(By.name("password")).sendKeys("c");
		driver.findElement(By.name("login")).click();
		try{
			
			driver.findElement(By.linkText("SIGN-OFF")).click();
			Assert.assertTrue(1==1);
			

			}catch(Exception e){
				Assert.fail();
			}
	  
  }
  
  @Test
  public void logonLogoutTestFor6() {
	 
		driver.findElement(By.name("userName")).sendKeys("d");
		driver.findElement(By.name("password")).sendKeys("d");
		driver.findElement(By.name("login")).click();
		try{
			
			driver.findElement(By.linkText("SIGN-OFF")).click();
			Assert.assertTrue(1==1);
			

			}catch(Exception e){
				Assert.fail();
			}
	  
  }
  
  @AfterMethod
  public void runAfterEachMethod(){
		//Assert.assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());
		//driver.findElement(By.linkText("SIGN-OFF")).click();
	System.out.println("test case completed ------------------------------------");
  }
  
  
 @AfterClass
 public void thisIsAfterClass(){
	 driver.quit();
 }

 /*
  * @BeforeSuite
  * 	@BeforeClass
  * 		@BeforeGroup
  * 			@BeforeMethod
  * 				@Test
  * 				@Test
  * 				@Test
  * 				@Test
  * 				@Test
  * 				@Test
  * 				@Test
  * 			@AfterMethod
  * 		@AfterGroup
  * 	@AfterClass System.out.println("solomon")
  * @AfterSuite System.out.println("Hello")
  */

}
