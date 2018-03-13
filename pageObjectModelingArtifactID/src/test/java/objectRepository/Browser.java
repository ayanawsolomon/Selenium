package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver driver;
	
	// this is comment 
	// additonal comment 
	// neges 
	public  Browser(String browserName){
		if(browserName=="Chrome"){
			System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
			driver= new ChromeDriver();

		}else if(browserName=="Firefox"){
			System.setProperty("webdriver.gecko.driver", utility.PathList.firefoxDriver);
			driver= new FirefoxDriver();

		} else{
			System.out.println("Chrome| Firfox");
		}
		
	}

}
