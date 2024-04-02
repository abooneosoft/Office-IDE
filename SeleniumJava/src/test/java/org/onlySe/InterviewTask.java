package org.onlySe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InterviewTask {
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
	}
	@Test
	private void googleForm() {
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSemT4hGDQWHEAkUsM7HMB_d-nq87rI9W-5MqJrE4qO56p9frw/viewform");
		WebElement name = driver.findElement(By.xpath("//span[text()='Name']/ancestor::div[@jsmodel='CP1oW']/descendant::input[@type='text']"));//  <----This is the Own Xpath
		name.click();
		name.sendKeys("Aboobacker Siddiq");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		email.click();
		email.sendKeys("aboosoft@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/span/div/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[2]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("aboosof@gmail.com");
//		WebElement first = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[2]/div/span"));
//		first.click();
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[2]/div/span") ).click();
//		//driver.findElement(By.xpath("//div[@aria-label='Form title']")).sendKeys("Testing");
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[3]/div[1]/div[1]/div/span/span")).click();
	}
	@AfterTest
	private void validateMsg() {
		String text = driver.findElement(By.xpath("//div[@class='vHW8K']")).getText();
		System.out.println("Submitted Message: "+text);
		boolean enabled = driver.findElement(By.xpath("//a[text()='Submit another response']")).isEnabled();
		if (enabled==true) {
			System.out.println("Button for another form is clickable");
		}else {
			System.out.println("Button for another form is not clickable");
		}
	}
}
