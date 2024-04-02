package org.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class JavaScrptScroll1 {

	public void scrolDwn() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("http://moneyboats.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1560)");
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//*[text()='Here are some interesting links for you! Enjoy your stay :)']")).getText();
		System.out.println(text);
		
		WebElement home = driver.findElement(By.id("top"));
		WebElement element = driver.findElement(By.xpath("//*[text()='Customizable']"));
		js.executeScript("arguments[0].scrollIntoView();", home);
		System.out.println("Again Scrolled up and print "+element.getText());
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File paste = new File("C:\\Users\\user\\Desktop\\XLSXfiles\\ss1.png");
//		FileUtils.copyFile(screenshot, paste);
		//driver.quit();
	}
}
