package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Feature/AdactinSingleton.feature" }, glue = {
		"org.steps" }, dryRun = false, monochrome = true, 
				plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"json:target/cucumber.json",
				"html:C:\\Users\\user\\Desktop\\XLSXfiles\\Sample.html"})
public class TestRunner {

}
