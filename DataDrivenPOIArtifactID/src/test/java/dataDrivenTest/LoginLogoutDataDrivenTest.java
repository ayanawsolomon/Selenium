package dataDrivenTest;

import org.testng.annotations.Test;

import readingFromFile.ReadDataFromExcelFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class LoginLogoutDataDrivenTest {
	WebDriver driver;
	@BeforeTest
	public void beforeTest(){
		// opening new tours webpage  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
			driver.get("http://newtours.demoaut.com"); // opening a website
	}
  @Test(dataProvider = "dp")
  public void f(String userName, String password) {
	  
	  
	//insert user name and password 
	  // click login
	  // assert wheter SIGN-OFF link is displayed 
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());
		driver.findElement(By.linkText("SIGN-OFF")).click();
	  
	  
	
  }
  
  @AfterTest
  public void afterTest(){
	  driver.quit();
  }

  @DataProvider
  public Object[][] dp() throws IOException {
	  
	  // call a method to read from excel file
	  // store the record to tow dimensional array
	  // return that array
		ReadDataFromExcelFile readExcelObject = new ReadDataFromExcelFile();
		String filePaht="C:\\Users\\solomon\\workspace\\DataDrivenPOIArtifactID\\src\\test\\java\\testData\\ExportExcel.xlsx";
		String[][] data =readExcelObject.readExcel(filePaht, "ExcelDemo");
	  return data;
    
  }
}
