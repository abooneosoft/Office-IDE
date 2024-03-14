package org.sample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.base.BaseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ExecutionPut extends BaseClass{

	@Test
	private void tc01() throws IOException, ParseException {
		requestObject("https://reqres.in/");
		FileReader f = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\ApiAutomation\\src\\test\\resources\\SamplePut.json");
		JSONParser jp = new JSONParser();
		Object parse = jp.parse(f);
		//pendddddd**************
		
	}
}
