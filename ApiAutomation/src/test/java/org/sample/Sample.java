package org.sample;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requested = RestAssured.given();
//	requested.queryParam("page", "2");
		Response request = requested.request(Method.GET,"api/users/2");
		int statusCode = request.getStatusCode();
		System.out.print(statusCode);
		if (statusCode ==200) {
			System.out.println("  Valid Response");
		} else {
			System.out.println("  Invalid Response");
		}
		String asPrettyString = request.getBody().asPrettyString();
		System.out.println(asPrettyString);
	}
}
