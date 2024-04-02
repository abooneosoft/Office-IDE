package org.onlySe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ptshpd {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.petersheppard.com.au/");
	driver.manage().window().maximize();
	WebElement shopButton = driver.findElement(By.xpath("//button[text()='SHOP THE SALE']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", shopButton);
	Thread.sleep(3000);
	WebElement home = driver.findElement(By.xpath("(//a[@title='Home'])[1]"));
	home.click();
	
}
}
