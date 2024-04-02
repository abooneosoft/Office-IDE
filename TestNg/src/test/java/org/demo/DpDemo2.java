package org.demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DpDemo2 {
	WebDriver driver;
	

	public static void excelData() throws IOException {
		FileInputStream input = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\TestNg\\src\\test\\resources\\FbLogin.xlsx");
				
		
	}
	@Test(dataProvider ="loginData" )
	public void launchFb(String user,String pass) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys(user);
	WebElement pswd = driver.findElement(By.id("pass"));
	pswd.sendKeys(pass);
}


}
