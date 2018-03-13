package seleniumAdvance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlyingCookies		
{		
     static WebDriver driver;	

    public static void main(String[] args)					
    {		
System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
		
		WebDriver driver = new ChromeDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);				
			driver.get("http://newtours.demoaut.com/");

        // Input user name and pass for the travel portal
        driver.findElement(By.name("userName")).sendKeys("a");					
        driver.findElement(By.name("password")).sendKeys("a");					
        driver.findElement(By.name("login")).click();					
        		
        // create file named Cookies to store Login Information		
        File file = new File("Cookies.data");							
        try		
        {		
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {		
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();			
        }		
            Bwrite.flush();			
            Bwrite.close();			
            fileWrite.close();			
        }catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
    }		
}