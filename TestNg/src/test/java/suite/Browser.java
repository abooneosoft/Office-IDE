package suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browser {
	WebDriver driver;
	long startTime;
	
	@BeforeSuite
	public void browserLaunch() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 startTime = System.currentTimeMillis();
		driver = new ChromeDriver();
		
	}

	@Test
	public void google() {
		driver.get("https://www.google.co.in/");

	}
	@Test
	public void yahoo() {
		driver.get("https://www.yahoo.co.in/");

	}
	
	@Test
	public void bing() {
			driver.get("https://www.bing.co.in/");
	}

	@AfterSuite
	public void totalTime() {
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = startTime+endTime;
		System.out.println("total milliseconds"+totalTime);
	}
}
