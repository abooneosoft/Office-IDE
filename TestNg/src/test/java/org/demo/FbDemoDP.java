package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbDemoDP {
	WebDriver driver;
	
	String[][] data = {
			{"aboo","123432"},
			{"bob","124hrhff"},
			{"charle","434977"},
			{"david","4343232"}
			
	};
	
	@Test
	@DataProvider(name="loginData")
	public String[][] credentials() {
		return data;
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
