package com.test.sampleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class loginLogoutTest {

	public static void main(String[] args) throws InterruptedException {
		// our first selenium class
		// open the firefox driver
		// cup c = new tea();
		
		String[] userName ={"u1", "u2", "u3","u4"};
		String[] password= {"p1","p2", "p3", "u4"};
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		for(int abv = 0; abv <=3; abv++){
			driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(userName[abv]);
		driver.findElement(By.name("password")).sendKeys(password[abv]);
		
		driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()){
			System.out.println("Login was  successfull");
		}else{
			System.out.println("Logon was not successfull");
		}
	
		} 

	}

}
