package seleniumMidLevel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAndMultipleSelection {

	public static void main(String[] args) {
		// Testing List box and List box with multiple selection /sdfdsf 
		
		System.setProperty("webdriver.gecko.driver", utility.PathList.firefoxDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
 
		driver.get("http://localhost/test/testpage.php"); // opening a website
       
		// using sendkeys abc
		driver.findElement(By.name("counfddfdfdftry")).sendKeys("Ethiopia");
		driver.findElement(By.xpath(".//select/option[@value='INDIA']")).click();
		driver.findElement(By.name("country")).findElement(By.cssSelector("option[value='ETHIOPIA']")).click();
		// multipel selection
		driver.findElement(By.xpath("html/body/form/select[2]/option[3]")).click();
		driver.findElement(By.xpath("html/body/form/select[2]/option[4]")).click();
		
		
// using Select class
		Select skill = new Select(driver.findElement(By.name("skill")));
		skill.deselectAll();
		skill.selectByIndex(1);
		skill.selectByValue("ba");
		skill.selectByVisibleText("Database");
		skill.selectByValue("qa");
		

		
		
		

	}

}
