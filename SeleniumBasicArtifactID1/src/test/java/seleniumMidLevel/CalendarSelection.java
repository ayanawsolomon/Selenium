package seleniumMidLevel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelection {
	

	public static void main(String[] args) {
		// how to test calendar
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
 
		driver.get("https://www.google.com/flights/"); // opening a website
        driver.findElement(By.xpath(".//*[@id='root']/div[3]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/div/div[1]/div[5]/table/tbody/tr[2]/td[1]/div/div[1]/div[3]")).click();
     
        WebElement month= driver.findElement(By.xpath("html/body/div[3]/div/div/table/tbody/tr[1]/td/div/div[3]"));
     
	    WebElement next = driver.findElement(By.xpath("html/body/div[3]/div/div/table/tbody/tr[1]/td/div/div[2]"));
	    while(! month.getText().contains("June")){
	    	next.click();
	    }
	    driver.findElement(By.xpath("html/body/div[3]/div/div/table/tbody/tr[2]/td/div/table[1]/tbody/tr[4]/td[6]/div")).click();
	    driver.findElement(By.xpath("html/body/div[3]/div/div/table/tbody/tr[2]/td/div/table[1]/tbody/tr[4]/td[6]/div")).click();
        String record = driver.findElement(By.xpath(".//*[@id='root']/div[3]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/div/div[1]/div[5]/table/tbody/tr[2]/td[1]/div/div[1]/div[1]")).getText();
       if(record.contains("June 16")){
    	   System.out.println("Calandar worked Successfully");
       }
	}

}
