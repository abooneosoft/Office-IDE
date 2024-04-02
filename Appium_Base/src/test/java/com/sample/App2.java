package com.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class App2 {

	@Test
	public void m1() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
		//DesiredCapabilities dc = new DesiredCapabilities();

		
		options.setDeviceName("Galaxy S20 5G");
		options.setApp("C:\\Users\\user\\Downloads\\APKFiles\\resources\\Android-NativeDemoApp-0.2.1.apk");

		URL url = new URL("http://127.0.0.1:4723/");


		AndroidDriver driver = new AndroidDriver(url,options);
		Thread.sleep(5000);
		
		WebElement swipeButton = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe\"]/android.view.ViewGroup/android.widget.TextView"));
		swipeButton.click();
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		RemoteWebElement swipeOp =(RemoteWebElement)wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[2]")));
		
		driver.executeScript("gesture: swipe", ImmutableMap.of("elementId",swipeOp.getId(),"percentage",50,"direction","left"));
		
		WebElement ytButton = driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[2]"));
		ytButton.click();
		Thread.sleep(5000);
		driver.close();
	}
}
