package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	WebDriver driver;
	public ContactPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		System.out.println("contuct page is under construction");
	}
	//@FindBy(linkText="SIGN-ON") public WebElement singIn;
	//@FindBy(linkText="REGISTER") public WebElement register;
	//@FindBy(linkText="SIGN-OFF") public WebElement signOff;
	

	
	
}
