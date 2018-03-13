package testNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@Listeners(testNG.Listner.class)

public class loginLogoutDataDriveTesintUsingTestNG {
	WebDriver driver;
	String title;
@BeforeClass
public void beforeClass(){
	System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
}

@BeforeMethod
public void beforeTest(){
//	  try {
//		  driver.findElement(By.linkText("SIGN-ON")).click();  
//	  }catch(Exception e){
//		  driver.findElement(By.linkText("SIGN-OFF")).click();
//	  }
	  
}
// the following test it to check loing is working with correct user name and pass
@Test(dataProvider ="dpCorrectPassword", enabled =true)
public void loginLogoutTestWithCorrectCredencials(String name, String password){
	
	//enter username and pasword
	driver.findElement(By.name("userName")).sendKeys(name);
	driver.findElement(By.name("password")).sendKeys(password);

	// click loign
	driver.findElement(By.name("login")).click();
	title = driver.getTitle();
	try{
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Assert.assertTrue(1==1);
	}catch(Exception e){
		Assert.fail();
	}

	// assert
}	
@DataProvider
  public Object[][] dpCorrectPassword() {
    return new Object[][] {
      new Object[] { "a", "a" },
      new Object[] { "b", "b" },
      new Object[] { "c", "c" },
      new Object[] { "d", "ddsf" },
      new Object[] { "e", "e" },
      new Object[] { "f", "f" },
    };
  }

@Test(dataProvider ="dpIncorrectCredencials")
public void loginLogoutTestWtihIncorrectCredencials(String name, String password){
	
	//enter username and pasword
	driver.findElement(By.name("userName")).sendKeys(name);
	driver.findElement(By.name("password")).sendKeys(password);

	// click loign
	driver.findElement(By.name("login")).click();
	// Assignment how to log out then a test case get login.
	// assert
	try{
	driver.findElement(By.linkText("SIGN-OFF")).click();
	Assert.fail();
	}catch(Exception e){
		Assert.assertTrue(1==1);
	}
		

}	
@DataProvider
  public Object[][] dpIncorrectCredencials() {
    return new Object[][] {
      new Object[] { "awerew", "a" },
      new Object[] { " ", "b" },
      new Object[] { "c", "c" },
      new Object[] { "d%^7rtyrty", "d" },
      new Object[] { "e13311", "e" },
      new Object[] { "f#$#$#", "f" },
    };
  }
	


@AfterClass
public void afterClass(){
	driver.quit();
}

}

 


