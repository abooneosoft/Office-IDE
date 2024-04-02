package org.onlySe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview2 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.screener.in/");
		WebElement search = driver.findElement(By.xpath("//div[@class='home-search']/child::div[@class='has-addon left-addon dropdown-typeahead']/child::i[@class='addon icon-search']/following::input[@aria-label='Search for a company']"));
		// short xpath using xpath axes --> //div[@class='home-search']/descendant::input[@aria-label='Search for a company']
		
		search.sendKeys("tcs");
		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
							
	}
}
