package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNG.Listner.class)

public class ToursLoginLogout {
	WebDriver driver;
	@BeforeClass
	public void setWebDriver(){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		
	}
	@BeforeMethod
	public void beforemethod(){
		
	}
 
  @Test(dataProvider = "dpCorrectCredencials")
  public void loginTest3(String name, String password){
	 
	  driver.findElement(By.name("userName")).sendKeys(name);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("login")).click();
	  try{
			
		  driver.findElement(By.linkText("SIGN-OFF")).click();
	  }catch(Exception e){
		 Assert.fail();
	  }
	 
  }
  
  
  @DataProvider
  public Object[][] dpCorrectCredencials() {
    return new Object[][] {
      new Object[] { "a", "a" },
      new Object[] { "b", "b" },
      new Object[] { "c", "csdgsgfdfgdfg" },
      new Object[] { "d", "d" },
      new Object[] { "e", "e" },
    };
  }
  
  
  
  
  @AfterMethod
  public void aftermethod(){
	
	 
	  
  }
  
  @AfterClass
  public void afterclass(){
	  driver.quit();

  }
  
  
}
