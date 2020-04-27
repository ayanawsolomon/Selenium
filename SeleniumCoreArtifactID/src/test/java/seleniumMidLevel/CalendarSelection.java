package seleniumMidLevel;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CalendarSelection {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// how to test calendar

		System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // wait will be applied for any element not
																		// available for the first try

		amsalu(800, 480);
		driver.get("https://www.finn.no/"); // opening a website

		try {
			driver.findElement(By.xpath("//div/div[2]/button")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.xpath("//*[@id=\"frontpage-content\"]/main/div[2]/div[1]/nav/div[5]/a/span")).click(); // selecting
																														// the
																														// reise
																														// button

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div[1]/div/label[2]")).click();// selecting the
		// type of flight
		// one way
		driver.findElement(By.id("origin")).sendKeys("Oslo lufthavn Gardermoen (OSL), Oslo, Norge");
		driver.findElement(By.id("destination")).sendKeys("Addis Ababa (ADD), Addis Abeba, Etiopia");

		// select the flight ddmmyy Callender
		driver.findElement(By.id("departureDate")).click();
		driver.manage().window().maximize();
																																				// month
																																				// list
																																				// of
																																		// the
																																				// calender
		WebElement next = driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/div[2]/main/div/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]"));// creating

		// System.out.println(monthTxt);
		while (1 == 1) {
			WebElement month = driver.findElement(By.xpath("//div/div/div/div[2]/div[2]/div/div[3]/div"));// create

			String monthTxt = month.getText();
			System.out.println(monthTxt);

			if (monthTxt.contains("mars 2022")){
				break;
			}
			next.click();

		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[2]/div/div[3]/div/table/tbody/*/*"));

		int max = dates.size();
		for (int i = 0; i < max; i++) {
			WebElement date = dates.get(i);
			String dateText = date.getText();
			if (dateText.contains("14")) {
				date.click();
				break;
			}

		}

		//String Flightdate = driver.findElement(By.xpath("//*[@id=\"departureDate\"]")).getAttribute("value");// create
		//System.out.println(Flightdate);
		//if (Flightdate.contains("11.08.2020")) {
		//	System.out.println("ohhhhhh let me reserve my thicket it seems okey");
		//}

	}

	public static void amsalu(int x, int y) {
		Dimension d = new Dimension(x, y);
		// Resize current window to the set dimension
		driver.manage().window().setSize(d);
	}
}
