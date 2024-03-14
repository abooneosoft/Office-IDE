package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
public static RequestSpecification requestSpecification;

	public static void requestObject(String baseUri) {
		RestAssured.baseURI= baseUri;
		requestSpecification = RestAssured.given();
	}
	public static void addQueryParameter(String parameterName, String parameterValue) {
		requestSpecification.queryParam(parameterName, parameterValue);
	}
	public static void addPathParameter(String parameterName,String parameterValue) {
		requestSpecification.pathParam(parameterName, parameterValue);
	}
	public static Response createResponseObj(String requestType, String resources) {
		if (requestType.equals("GET")) {
		return requestSpecification.request(Method.GET,resources);
		} else if (requestType.equals("POST")) {
			Response request = requestSpecification.request(Method.POST,resources);
			return request;
		}else if (requestType.equals("PUT")) {
			return requestSpecification.request(Method.PUT,resources);
		} else{
			Response request = requestSpecification.request(Method.DELETE,resources);
			return request;
		}
	}
	public static void validateResponseCode(String requestType, Response response) {
		if (requestType.equals("GET")|| requestType.equals("PUT")) {
			int statusCode = response.getStatusCode();
			Assert.assertEquals(statusCode, 200);
			System.out.println("Validation of Status Code is 200");
		} else if (requestType.equals("POST")) {
			int statusCode = response.getStatusCode();
			Assert.assertEquals(statusCode, 201);
			System.out.println("Validation of Status Code is 201");
		}else{
			int statusCode = response.getStatusCode();
			Assert.assertEquals(statusCode, 204);
			System.out.println("Validation of Status Code is 204(Deleted)");
		}
	}
	public static void printResponseBody(Response response) {
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);
	}
	public static String readDataFromExcel(int rownum,int cellnum) throws FileNotFoundException, IOException {
		Workbook w = new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\Admin\\eclipse-workspace\\ApiAutomation\\src\\test\\resources\\ApiAutomation.xlsx")));
		Sheet sheet = w.getSheet("Sheet1");
		String stringCellValue = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		return stringCellValue;
	}
	public static void readJson() {
		
		
	}
}
