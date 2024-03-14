package org.sample;

import org.base.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ExecutionGet extends BaseClass {

	@Test
	private void tc01() {
		requestObject("https://reqres.in/");
		Response Response = createResponseObj("GET", "api/users/2");
		validateResponseCode("GET", Response);
		printResponseBody(Response);
		
	}
}
