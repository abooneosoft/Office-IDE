package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browsers {
	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
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
	public void sshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\user\\Desktop\\XLSXfiles\\TestingSs\\DemoCrossBrowser.png");
		FileUtils.copyFile(src, des);
	}
}
