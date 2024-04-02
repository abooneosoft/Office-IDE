package com.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class AppLaunch2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
//		DesiredCapabilities dc = new DesiredCapabilities();
		
		options.setDeviceName("Galaxy S20 5G");
		options.setApp("C:\\Users\\user\\Downloads\\APKFiles\\resources\\General-Store.apk");
		
		URL url = new URL("http://127.0.0.1:4723/");
		
		
		AndroidDriver driver = new AndroidDriver(url,options);
		Thread.sleep(5000);
		//driver.executeScript("plugin: setWaitPluginProperties", ImmutableMap.of("timeout", 60000 , "intervalBetweenAttempts", 11 ));
		driver.findElement(AppiumBy.id("btnLetsShop")).click();
		System.out.println("...inspecting Toast Message");
		String text = driver.findElement(By.xpath("/hierarchy/android.widget.Toast[1]")).getText();
		
		if (text.equalsIgnoreCase("Please enter your name")) {
			System.out.println("Toast Message: Please enter your name is Showing...!");
		}
		driver.findElement(AppiumBy.id("spinnerCountry")).click();
		WebElement findElement = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		driver.findElement(AppiumBy.id("nameField")).sendKeys("aboobacker");
		driver.findElement(AppiumBy.id("radioMale")).click();
		driver.findElement(AppiumBy.id("btnLetsShop")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\"));"));
		
		List<WebElement> listShoes = driver.findElements(By.id("productName"));
		for(int i=0; i<listShoes.size(); i++) {
			String text2 = listShoes.get(i).getText();
			if (text2.equalsIgnoreCase("Jordan Lift Off")) {
				driver.findElement(By.id("productAddCart")).click();
			}
		}
driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"));"));
		
		List<WebElement> listShoes1 = driver.findElements(By.id("productName"));

		for(int i=0; i<listShoes1.size(); i++) {
			String text2 = listShoes1.get(i).getText();
			if (text2.equalsIgnoreCase("Nike SFB Jungle")) {
				driver.findElement(By.id("productAddCart")).click();
			}
		}
		
		String productCount = driver.findElement(By.id("counterText")).getText();
		System.out.println("To check the number of Product selected: "+productCount );
		Thread.sleep(2000);
		driver.findElement(By.id("counterText")).click();
		Thread.sleep(2000);
		String totalCost = driver.findElement(By.id("totalAmountLbl")).getText();
		System.out.println("Total Amount of the product: "+totalCost );
		WebElement visitToButton = driver.findElement(By.id("btnProceed"));
		boolean enabled = visitToButton.isEnabled();
		
		if (enabled==true) {
			System.out.println("(Visit to the website to complete purchase) is Clickable");
		}else {
			System.out.println("(Visit to the website to complete purchase) is not Clickable");
		}
		
		WebElement termsButton = driver.findElement(By.id("termsButton"));
		boolean enabled2 = termsButton.isEnabled();
		
		
		if (enabled2==true) {
			System.out.println("(termsButton) is Clickable");
		}else {
			System.out.println("(termsButton) is NOT Clickable");
		}
		
		//termsButton.click();

		// Perform long press on the element
        TouchAction touchAction = new TouchAction(driver);
        LongPressOptions longPressOptions = new LongPressOptions();
        longPressOptions.withElement(ElementOption.element(termsButton))
                .withDuration(Duration.ofSeconds(2)); // Duration of the long press
        touchAction.longPress(longPressOptions).release().perform();
        Thread.sleep(2000);
		WebElement terms = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"));
		System.out.println("Terms Of Condtions");
		
		String text3 = terms.getText();
		
		
		StringTokenizer st = new StringTokenizer(text3,".||,");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		Thread.sleep(2000);

		WebElement termsClose = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
		if (termsClose.isEnabled()) {
			System.out.println("In terms [Close] is enable to Click");
			termsClose.click();
		}else {
			System.out.println("Click BACK button to close");
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
		}
		
		
		Thread.sleep(6000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		String text2 = driver.findElement(By.xpath("/hierarchy/android.widget.Toast[2]")).getText();
		System.out.println("....inspecting Toast 2");
		Thread.sleep(2000);
		if (text2.equalsIgnoreCase("Toast message")) {
			System.out.println("Toast message: (Press BACK again to exit) is shown");
		}
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']/parent::android.widget.LinearLayout/parent::android.widget.LinearLayout/child::android.widget.TextView[@text='Jordan 6 Rings']/following::android.widget.LinearLayout/child::android.widget.TextView[@text='ADD TO CART']")).click();
//		Dimension size = driver.manage().window().getSize();
//	Double ht = size.getWidth()*0.5;
//	int startX = ht.intValue();
//	int startY = size.getHeight()*3/4;
//	int endY =size.getHeight()/4;
//	TouchAction tc = new TouchAction(driver);
//	tc.press(PointOption.point(startX, startY))
//    .moveTo(PointOption.point(startX, endY))
//    .release()
//    .perform();
//	tc.press(PointOption.point(startX, startY))
//    .moveTo(PointOption.point(startX, endY))
//    .release()
//    .perform();
//	tc.press(PointOption.point(startX, endY))
//    .moveTo(PointOption.point(startX, startY))
//    .release()
//    .perform();
		
//			driver.pressKey(new KeyEvent(AndroidKey.CALL));//these are the default keys used
//			driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
}
