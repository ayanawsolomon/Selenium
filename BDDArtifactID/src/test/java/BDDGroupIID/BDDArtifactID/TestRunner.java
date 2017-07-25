package BDDGroupIID.BDDArtifactID;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/",
		glue = {"stepDefinitions"},
		//tags ={"@tag1"}
		// and tags can be done as 
		// tags ={"@tag1", "@tag2"}
		// or  tags can be done as
		//tags ={"@tag1, @tag2"}
		// execute all except the follwoing tag
		//tags={~@tag1}
		//
		dryRun =true
		)
public class TestRunner {
	// HOOKS
	// singlton method to instantiate the driver just one time only
    private static boolean initialized = false;
    private static WebDriver driver;

    @Before
    public void initialize(){
        if (!initialized){
            initialized = true;
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.get("http://newtours.demoaut.com/mercuryregister.php");
    		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
    		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");

        }
    }
    public static WebDriver getDriver(){
        return driver;
    }   
	
	// Teardown closeing browsr
	@After
	public void teardown(Scenario scenario){
		if(scenario.isFailed()){
			// write the code to take screen shoot
		}
		
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		
	}

}
