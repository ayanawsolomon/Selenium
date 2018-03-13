package seleniumMidLevel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipelLinkClick {

	public static void main(String[] args) throws InterruptedException {
		// Selenium commands

		System.setProperty("webdriver.gecko.driver", utility.PathList.firefoxDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("http://newtours.demoaut.com/");

		List<WebElement> homePageLinks = driver.findElements(By.tagName("a"));
		String[] linkName = new String[homePageLinks.size()];
		int i = 0;
		for (WebElement link : homePageLinks) {
			linkName[i] = link.getText();
			i++;
		}
		for (i = 0; i < linkName.length; i++) {
			try{
				System.out.println("Clicking:" + linkName[i]);
				driver.findElement(By.linkText(linkName[i])).click();
			}catch(Exception e){
				// if link is inside the body of home page, not in either left or top menu,
				// then you should click home page again
				System.out.println(linkName[i] + "Link is in the body part of home page");

				driver.findElement(By.linkText("Home")).click();
				driver.findElement(By.linkText(linkName[i])).click();

			}
			Thread.sleep(3000);
		}

	}

}
