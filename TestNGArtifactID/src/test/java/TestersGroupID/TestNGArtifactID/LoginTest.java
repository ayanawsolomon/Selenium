package TestersGroupID.TestNGArtifactID;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class LoginTest {
@BeforeSuite
public void beforeSuite(){
	System.out.println("BSBSBSBSBSBSBSBSBSBSBSBBS This suite code reuns only one time at strating point");
}

@AfterSuite
public void afterSuite(){
	System.out.println("ASASASASASASASASASASAS This suite code reuns only one time after your suite");
}

@BeforeTest
public void beforeTest(){
	System.out.println("BTBTBTBTBTTBTBTTBTTBTBT  This part will run before any test runs in any java testNG class those defined in suite master");
}
@AfterTest
public void afterTest(){
	System.out.println("ATATATATATATATATATATATATAATATAT  This part will run after whole test from any testNG class defined in seuite master");
}
@BeforeClass
public void beforeClass(){
	System.out.println("BCBCBCBCBCBCBCBCBCBCBCBCB Befoer Class --- set webderiver, start firefox open url");
	
}

@AfterClass
public void afterClass(){
	 System.out.println("AFAFAFAFAFAFAFAFAFAFAFAF After class ----Close browser");
}

@BeforeMethod
public void setVariables(){
	System.out.println("BMBMBMBMBMBMBMBMBMBMMBMB Before each method runs ");
  
}
@AfterMethod
public void clearChookies(){
	System.out.println("AMAMAMAMAMMAMAMAMAMAMMAMAM After each method clear cookies ");

	
}
  @Test()
  public void loginTestWithCorrectCredencials() {
	  System.out.println(".......Type Correct user name =a");
	  System.out.println(".......Type Correct Password = a");
	  System.out.println(".......Click Sign in button");
	  System.out.println(".......Assert login is successfull");
	  System.out.println(".......Log out from newtours page");
	 
  }
  
  @Test
  public void loginTestWithWrongCredencials() {
	  System.out.println("------ Type Wrong user name =abc");
	  System.out.println("------Type Wrong Password = xxx");
	  System.out.println("------Click Sign in button");
	  System.out.println("------Assert login is not successfull");
	  
  }
 

}
