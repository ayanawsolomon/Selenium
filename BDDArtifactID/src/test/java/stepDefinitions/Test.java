package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	WebDriver driver;
	@Given("^Open the test page \"(.*?)\"$")
	public void open_the_test_page(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		
	}

	@When("^I clikc female radio button$")
	public void i_clikc_female_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElements(By.name("gender")).get(0).click();
	}

	@Then("^the female readio should be selected$")
	public void the_female_readio_should_be_selected() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		Assert.assertTrue(driver.findElements(By.name("gender")).get(0).isSelected());
	}


	

}
