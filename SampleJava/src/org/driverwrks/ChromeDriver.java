package org.driverwrks;

public class ChromeDriver {

	public static void main(String[] args) {
		
		WebDriver driv = (WebDriver) new ChromeDriver();
		String close = driv.close();
		int sum = driv.sum(10, 28);
		
	}
}
