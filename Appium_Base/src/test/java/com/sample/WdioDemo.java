package com.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class WdioDemo {

	@Test
	public void launchApp() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Galaxy S20 5G");
		options.setApp("C:\\Users\\user\\Downloads\\APKFiles\\resources\\Android-NativeDemoApp-0.2.1.apk");
		
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url,options);
		
//		RemoteWebElement carousel = (RemoteWebElement) wait.until(presenceOfElementLocated(AppiumBy.accessibilityId("Carousel")));
//
//		driver.executeScript("gesture: swipe", Map.of("elementId", carousel.getId(), "percentage", 50, "direction", "left")); 
		}
}
