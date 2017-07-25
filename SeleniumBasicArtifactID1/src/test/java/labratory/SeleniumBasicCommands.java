package labratory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommands {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open travel portal homepage
		// import selenium driver to your class
		// use webdriver get() method to open the page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// to wait all elements 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();
		boolean check =driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
		if(check ==true){
			System.out.println("ling successfull ");
		}else{
			System.out.println("login was not successfull");
		}
		String url =driver.getCurrentUrl();
		System.out.println(url);
		String title =driver.getTitle();
		if(title.contains("xyz")){
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	
		//driver.close();
	}

}
