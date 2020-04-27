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
/*
 * This test will open the finn.no and select a flight date from calendar date
 */
public class CalendarSelection {
	static WebDriver driver = new ChromeDriver();
	// test data
	static String departureCity = "Oslo lufthavn Gardermoen (OSL), Oslo, Norge";
	static String arrivalCity = "Addis Ababa (ADD), Addis Abeba, Etiopia";
	static String flightMonthAndYear = "september 2021";
	static String flightDate = "14";

	// element xpath
	static String url = "https://www.finn.no/";
	static String firstModal = "//div/div[2]/button";
	static String flightBtn = "//*[@id=\"frontpage-content\"]/main/div[2]/div[1]/nav/div[5]/a/span";
	static String oneWayBtn = "//*[@id=\"__next\"]/div[2]/main/div/div[1]/div/label[2]";
	static String nextBtn = "//*[@id=\"__next\"]/div[2]/main/div/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]";
	static String monthTxt = "//div/div/div/div[2]/div[2]/div/div[3]/div";
	static String dayBtn = "//div[2]/div/div[3]/div/table/tbody/*/*";

	public static void main(String[] args) throws InterruptedException {
		// how to test calendar

		System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // wait will be applied for any element not
																		// available for the first try
		// opening a website
		amsalu(800, 480);
		driver.get(url); 
		
		// click the popup box
		try {
			driver.findElement(By.xpath(firstModal)).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// goto flight page and select one way
		driver.findElement(By.xpath(flightBtn)).click(); 
		driver.findElement(By.xpath(oneWayBtn)).click();// selecting the

		// fill departuer, arrival 
		driver.findElement(By.id("origin")).sendKeys(departureCity);
		driver.findElement(By.id("destination")).sendKeys(arrivalCity);

		// select the flight ddmmyy Callender
		driver.findElement(By.id("departureDate")).click();
		driver.manage().window().maximize();
		// month
		// calender
		WebElement next = driver.findElement(By.xpath(nextBtn));// creating

		// System.out.println(monthTxt);
		while (1 == 1) {
			WebElement month = driver.findElement(By.xpath(monthTxt));// create

			String monthTxt = month.getText();
			System.out.println(monthTxt);

			if (monthTxt.contains(flightMonthAndYear)) {
				break;
			}
			next.click();

		}

		// select date 
		List<WebElement> dates = driver.findElements(By.xpath(dayBtn));

		int max = dates.size();
		for (int i = 0; i < max; i++) {
			WebElement date = dates.get(i);
			String dateText = date.getText();
			if (dateText.contains(flightDate)) {
				date.click();
				break;
			}

		}

	}

	public static void amsalu(int x, int y) {
		Dimension d = new Dimension(x, y);
		// Resize current window to the set dimension
		driver.manage().window().setSize(d);
	}
}
