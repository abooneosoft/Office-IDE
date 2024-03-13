package Rough;

import org.base.BaseClass;

import io.cucumber.java.Before;

public class HooksClass extends BaseClass{

	//@Before
	public void startUp() {
		launchBrowser("edge");
		loadUrl("https://adactinhotelapp.com/");
		maximizeWindow();
	}
}
