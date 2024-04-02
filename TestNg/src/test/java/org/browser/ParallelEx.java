package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelEx {
	
	@Test
	public void google() {
		FbGoogle.fbLogin1();
	}
	@Test
	public void yahoo() {
		FbYahoo.fbLogin2();
	}

	@Test
	public void bing() {
		FbBing.fbLogin3();
	}
}
