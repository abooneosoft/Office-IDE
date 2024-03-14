package org.sample;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.base.BaseClass;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ExecutionPost extends BaseClass{

	@Test(dataProvider = "SampleData" )
	private void tc0(String key1, String value1, String key2, String value2) {
		requestObject("https://reqres.in/");
		//attach the payload to the request
		JSONObject jsonObj = new JSONObject();
		jsonObj.put(key1, value1);
		jsonObj.put(key2, value2);
		requestSpecification.body(jsonObj.toJSONString());
		//response Object
		Response response = createResponseObj("POST","api/users");
		validateResponseCode("POST", response);
		printResponseBody(response);
	}
	@DataProvider(name ="SampleData")
	private Object[][] tc1() throws FileNotFoundException, IOException {
		Object[][] objref = new Object[][] {
			{readDataFromExcel(0, 0), readDataFromExcel(1, 0), readDataFromExcel(0, 1), readDataFromExcel(1, 1)},
			{readDataFromExcel(0, 0), readDataFromExcel(2, 0), readDataFromExcel(0, 1), readDataFromExcel(2, 1)},
			{readDataFromExcel(0, 0), readDataFromExcel(3, 0), readDataFromExcel(0, 1), readDataFromExcel(3, 1)},
			{readDataFromExcel(0, 0), readDataFromExcel(4, 0), readDataFromExcel(0, 1), readDataFromExcel(4, 1)}
		};
		return objref;
	}
	
	
	
}
