package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BDDGroupIID.BDDArtifactID.TestRunnerTest;
import BDDGroupIID.BDDArtifactID.TestRunnerTestNG;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest {
	WebDriver driver = TestRunnerTestNG.getDriver();
	@Given("^I am in newtours home page \"(.*?)\"$")
	public void i_am_in_newtours_home_page(String url) throws Throwable {
		
		driver.get(url);
		// we should optimize this code 
//		try{
//			driver.findElement(By.linkText("SIGN-ON")).click();
//	
//		}catch(Exception e){
//			driver.findElement(By.linkText("SIGN-OFF")).click();
//
//		}

	}
	@When("^I insert user name=\"(.*?)\" and password=\"(.*?)\"$")
	public void i_insert_user_name_and_password(String userName, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	
	@When("^I press Login button$")
	public void i_press_Login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("^\"(.*?)\" link should be seen on the top menue$")
	public void link_should_be_seen_on_the_top_menue(String singLink) throws Throwable {
		Assert.assertTrue(driver.findElement(By.linkText(singLink)).isDisplayed());
	}
	
	

}