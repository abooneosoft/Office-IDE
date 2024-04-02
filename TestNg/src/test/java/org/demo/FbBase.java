package org.demo;

import java.awt.RenderingHints.Key;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class FbBase {

	WebDriver driver;
	
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.co.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
			driver.findElement(By.id("nav-search-submit-button")).click();
			String prntWindow = driver.getWindowHandle();
			Set<String>allWindows = driver.getWindowHandles();
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.switchTo().window(prntWindow);
	}
//	@Test
//	@Parameters({"username","password"})
//	public void launchFb(String user,String pass) {
//		
//		WebElement userName = driver.findElement(By.id("email"));
//		userName.sendKeys(user);
//		WebElement pswd = driver.findElement(By.id("pass"));
//		pswd.sendKeys(pass);
//	}
}
