package drivenTestApps;

import org.testng.annotations.Test;

import utility.ReadObject;
import utility.ReadingFromExcel;
import utility.WebElementFinder;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


 public class KeyWordDrivenTest {
	 String[][] dataFromExcel;
	 int testCaseNumber;
	 int testStep ;
	 WebDriver driver;
	 WebElement element;
	 Properties objects;
	 @BeforeTest
	  public void beforeTest() throws IOException {
		 dataFromExcel = ReadingFromExcel.readExcel(utility.PathList.excelPath, "testSteps", 3, 30, 1, 5);
		objects = ReadObject.getObjectRepository(utility.PathList.objectProperties);
		 System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try


	  }

	 
	 @Test
  public void test() throws Exception {
		 testCaseNumber=0;
		 for(int row=0; row < dataFromExcel.length; row++){
			 String testCase = dataFromExcel[row][0];
			 String keyWord = dataFromExcel[row][1];
			 String objectType = dataFromExcel[row][2];
			 String object = objects.getProperty(dataFromExcel[row][3]);
			 String value = dataFromExcel[row][4];
			 if(! testCase.isEmpty()){
				testCaseNumber++;
				System.out.println("Running Test Case " + testCaseNumber + " : " + testCase);
			    testStep = 0;
				continue; 
			 }
			 testStep++;
			 if(object ==null)
				 object=dataFromExcel[row][3];
			 System.out.println(";;;;;;;;;;;;;;;;;;;;;;" + object + "--------" + dataFromExcel[row][3]) ;
			 
			 if(keyWord.equalsIgnoreCase("Open")){
				 System.out.println("....Step " + testStep + " Opening " + value );
				 driver.get(value);
			 }else{
				 // call a method that will find element do acction
				 element = WebElementFinder.findElement(driver, objectType, object);
				 	if(keyWord.equalsIgnoreCase("Click")){
				 		System.out.println("....Step " + testStep + " Clicking " + object );
				 		element.click();
				 
				 	}else if(keyWord.equalsIgnoreCase("Type")){
				 		System.out.println("....Step " + testStep + " Typing on  " + object + " of Value = " + value );
				       element.sendKeys(value);
				 	}
			 }
		 }
  }
 
}
