package org.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MsEdge {

	@Test
	public void msEdgeBrowser() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		

	}
}
