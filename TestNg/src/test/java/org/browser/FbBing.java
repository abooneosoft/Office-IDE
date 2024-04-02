package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbBing {

	public static void fbLogin3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.co.in/");
		driver.navigate().to("https://www.facebook.com/login/");

	}
}
