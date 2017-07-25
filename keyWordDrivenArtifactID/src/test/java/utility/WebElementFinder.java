package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementFinder {

	public static WebElement findElement(WebDriver driver, String objectType, String object) throws Exception {
		// find element and return the element
		if(objectType.equalsIgnoreCase("id")){
			return driver.findElement(By.id(object));
		}else if(objectType.equalsIgnoreCase("name")){
			return driver.findElement(By.name(object));
		}if(objectType.equalsIgnoreCase("xpath")){
			return driver.findElement(By.xpath(object));
		}if(objectType.equalsIgnoreCase("link")){
			return driver.findElement(By.linkText(object));
		}if(objectType.equalsIgnoreCase("partialLink")){
			return driver.findElement(By.partialLinkText(object));
		}if(objectType.equalsIgnoreCase("CSS")){
			return driver.findElement(By.cssSelector(object));
		}if(objectType.equalsIgnoreCase("className")){
			return driver.findElement(By.className(object));
		}else{
			throw new Exception("Wrong object type");
		}
	}

}
