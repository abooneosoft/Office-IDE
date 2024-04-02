package org.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Google {
	
	public WebDriver driver;
	public JavascriptExecutor js = (JavascriptExecutor)driver;
	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void google() {
		driver.get("https://www.amazon.in/");

	}
	@Test
	public void scroll() {
		js.executeScript("windows.scrollBy(0,500)");
		WebElement lastButton = driver.findElement(By.xpath("//span[@class='action-inner']"));
		js.executeScript("arguments[0].scrollIntoView(true)", lastButton);
	}

}
