package testCases;

import org.testng.annotations.Test;

import objectRepository.Browser;
import objectRepository.FlightFinderPage;
import objectRepository.HomePage;
import objectRepository.MenuPage;
import objectRepository.RegistrationPage;
import objectRepository.SignOnPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class LoginLogoutTest {
	WebDriver driver;
	HomePage homePage;
	MenuPage menuPage;
	SignOnPage signOnPage;
	RegistrationPage registraionPage;
	FlightFinderPage flightFinderPage;
	// comment 

	
	@BeforeClass
	public void beforeTest(){
		new Browser("Firefox");
		driver= Browser.driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://newtours.demoaut.com/";
		driver.get(url);
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.getTitle(driver),"Welcome: Mercury Tours");
		menuPage = new MenuPage(driver);
		
		
		
	}
	@AfterClass 
	public void afterClass(){
		driver.close();
	}
	@AfterMethod
	public void afterTest(){
		System.out.println("running -^^^^^^^^66-------------");
	
	}
	
// login test with correct user name and password	
  @Test(dataProvider = "correctCredencials")
  public void testingWithCorrectCredencials(String name, String password) {
	// write your code over here
	 signOnPage=homePage.signOn();
	  flightFinderPage=signOnPage.login(name, password);
	  try{
		  menuPage.signOff.click();
		  Assert.assertTrue(true);
	  }catch(Exception e){
		  Assert.fail();
	  }
  }
  
 
  // data providor for correct user name and password
  @DataProvider
  public Object[][] correctCredencials() {
    return new Object[][] {
      new Object[] { "a", "a" },
      new Object[] { "b", "b" },
    
    };
   
    
  }
  
  
//login test with Wrong user name and password	
 @Test(dataProvider = "wrongCredencials")
 public void testingWithWrongCredencials(String name, String password) throws InterruptedException {
	// write your code over here
	 signOnPage=homePage.signOn();
	  flightFinderPage=signOnPage.login(name, password);
	  try{
		  menuPage.signIn.click();
		  Assert.assertTrue(true);
	  }catch(Exception e){
		  menuPage.signOff.click();
		  Assert.fail();
	  }
 }

 // data providor for correct user name and password
 @DataProvider
 public Object[][] wrongCredencials() {
	 
   return new Object[][] {
     new Object[] { "1111166", "111111" },
     new Object[] { "####", "######" },
    
   };
  
   
 }
  
  
  
  
  
}
