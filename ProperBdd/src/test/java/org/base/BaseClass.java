package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser(String driverName) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
//		driver = new ChromeDriver();
		
		if (driverName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ProperBdd\\src\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
		}else if (driverName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement e, String value) {
		e.sendKeys(value);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
	}
	public static void quitBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
