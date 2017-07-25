package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multiply {
	WebDriver driver;
	String result;
	@Given("^I am in calculator page \"(.*?)\"$")
	public void i_am_in_calculator_page(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
	}

	@When("^I multiply two numbers \"(.*?)\"  and  \"(.*?)\"$")
	public void i_multiply_two_numbers_and(String n1, String n2) throws Throwable {
		driver.findElement(By.name(n1)).click();
		driver.findElement(By.name("*")).click();
		driver.findElement(By.name(n2)).click();
		driver.findElement(By.name("=")).click();
	}

	@Then("^I should get \"(.*?)\"$")
	public void i_should_get(String expResult) throws Throwable {
		result=driver.findElement(By.name("displayBoard")).getText();
		Assert.assertEquals(expResult, result);
		driver.close();
		
		
	}

	@When("^I multiply -(\\d+) by  -(\\d+)$")
	public void i_multiply_by(int n1, int n2) throws Throwable {
		driver.findElement(By.name(Integer.toString(n1))).click();
		driver.findElement(By.name("*")).click();
		driver.findElement(By.name(Integer.toString(n2))).click();
		driver.findElement(By.name("=")).click();
	}
	
	@Then("^I should get output= (\\d+)$")
	public void i_should_get_output(int expResult) throws Throwable {
		result=driver.findElement(By.name("displayBoard")).getText();
		Assert.assertEquals(Integer.toString(expResult), result);
		driver.close();
	}

	
	
	
	
	
	

}
