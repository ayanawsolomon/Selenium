package TestersGroupID.TestNGArtifactID;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class LoginTestWithDataProvider {
	@BeforeTest
	public void thisIsBeforeTest(){
		System.out.println("BeforeTest---BeforeTest-----BeforeTest---BeforeTest------BeforeTest---BeforeTest");
	}
	 @BeforeClass
	  public void beforeClass() {
		 System.out.println("Before Class ++++++++++Before Class ++++++++++Before Class ++++++++++Before Class ++++++++++");
		 System.out.println("Step 1-set gicko, chrome , IE driver");
		 System.out.println("Step 2- define webdirve, WebDriver driver = new FirefoxDriver()");
		 System.out.println(" Step 3- Set waiting time driver.mange....");
		 System.out.println(" Step 4- Opne newtours website driver.get()");
	  }

	@BeforeMethod
	public void defineMyVariables(){
		System.out.println("Before Method----Define my variables for the current test");
	}
	
	
  @Test(dataProvider = "dpCorrectCredencial")
  public void correctCredencials(String name, String password) {
	  System.out.println(">>>>>>>>Step 5- Type user name = " + name + "  on user name box");
	  System.out.println(">>>>>>>>Step 6- Type password = " + password + " on passowrd box");
	  System.out.println(">>>>>>>>Step 7- click login  button");
	  System.out.println(">>>>>>>>>Step 8- Assert that login login is successfull");
  }

  @DataProvider
  public Object[][] dpCorrectCredencial() {
    return new Object[][] {
      new Object[] { "name1", "pass1" },
      new Object[] { "name2", "pass2" },
      new Object[] { "name3", "pass3" },
      new Object[] { "name4", "pass4" },
      new Object[] { "name5", "pass5" },
      new Object[] { "name6", "pass6" },
    };
  }
  
  
  @Test(dataProvider = "dpCorrectCredencial")
  public void wrongCredencials(String name, String password) {
	  System.out.println("Test login logout with incorrect credencials");
	  System.out.println(">>>>>>>>Step 5- Type user name = " + name + "  on user name box");
	  System.out.println(">>>>>>>>Step 6- Type password = " + password + " on passowrd box");
	  System.out.println(">>>>>>>>Step 7- click login  button");
	  System.out.println(">>>>>>>>>Step 8- Assert that login is not successfull");
  }
  
  @DataProvider
  public Object[][] dpWrongCredencial() {
    return new Object[][] {
      new Object[] { "name1", "pass1" },
      new Object[] { "name2", "pass2" },
      new Object[] { "name3", "pass3" },
      new Object[] { "name4", "pass4" },
      new Object[] { "name5", "pass5" },
      new Object[] { "name6", "pass6" },
    };
  }
  
  
  @Test()
  public void checkRegistrationPage(){
	  System.out.println("** This is Test ****This test case is to check registrioan page");
  }
  

 
	@AfterMethod
	public void clearMyVariables(){
		System.out.println("After Method ----Clear my current variable values");
	}
  
  @AfterClass
  public void afterClass() {
	  System.out.println("After Class ++++++++++After Class ++++++++++After Class ++++++++++After Class ++++++++++");
	  System.out.println("Step 9- close the dirver");
  }
  
  @AfterTest
  public void thisIsAfterTest(){
	  System.out.println("After test ----After test ----After test ----After test ----After test ----");
  }

}
