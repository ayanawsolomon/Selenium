package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage {
	WebDriver driver ;
	// constructor that run by the time you call Home page class
	public SignOnPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,  this);
	}
	@FindBy(name="userName") public WebElement uName;
	
	@FindBy(name="password") public WebElement password;
	@FindBy(name="login") public WebElement signIn;
	// takes your driver and returns you the current title of the page
	public String getTitle(WebDriver driver){
		return driver.getTitle();
	}
	// method for filling login page 
	public FlightFinderPage login(String usrName, String pass){
		uName.sendKeys(usrName);
		password.sendKeys(pass);
		signIn.click();
		return new FlightFinderPage(driver);
		
	}

}
