package TestersGroupID.TestNGArtifactID;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class PassingParameter {
 String gb;
 @Parameters({"browserName", "userName"})
  @BeforeTest
  public void SelectBrowser(@Optional("Firefox")String browser, @Optional("Alex")String name){
	  //String browser="IE";
	 gb=browser;
	 System.out.println("HI ********************************************************" + browser + "  " + name);
	  if(browser.contains("Firefox")){
		  System.out.println("Use fire fox ");
		//  driver = new FirefoxDriver(0);
	  
	  }else  if(browser.contains("IE")){
		  System.out.println("Use IE   ");
		 // driver = new IEDriver()
	  
	  }else  if(browser.contains("Chrome")){
		  System.out.println("Use Chrome ");
		//  driver = new chromeDrier()
	  }
	  
  }
  @Test
  public void myTestCase(){
	  System.out.println("-----test is running0000000000000000000000000000000000" + gb);
  }
  
}
