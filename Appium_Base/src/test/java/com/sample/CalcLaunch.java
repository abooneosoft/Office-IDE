package com.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CalcLaunch {
	
	
@Test
	private void openApp() throws MalformedURLException, InterruptedException {
	UiAutomator2Options options = new UiAutomator2Options();
	options.setDeviceName("Galaxy S20 5G");
	//options.setApp("C:\\Users\\user\\Downloads\\APKFiles\\resources\\General-Store.apk");
	options.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	options.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	
	URL url = new URL("http://127.0.0.1:4723/");
	
	AndroidDriver driver = new AndroidDriver(url,options);
	
	WebElement one = driver.findElement(AppiumBy.id("calc_keypad_btn_01"));
	one.click();
	driver.findElement(AppiumBy.id("calc_keypad_btn_add")).click();
	WebElement two = driver.findElement(AppiumBy.id("calc_keypad_btn_02"));
	two.click();
	driver.findElement(AppiumBy.id("calc_keypad_btn_equal")).click();
	Thread.sleep(5000);
	}
}
