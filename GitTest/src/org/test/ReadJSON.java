package org.base;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {
	
	public static void main(String[] args) throws IOException, ParseException {
		//FileReader<--class
		FileReader f = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\JavaApiFramework\\src\\test\\resources\\sample.json");
		//JSONParser<--object
		JSONParser js = new JSONParser();
		Object parse = js.parse(f);//------*Object is the Supermost class in Java-----
		//so Typecasting between the Object and JSONobject
		JSONObject jsonObject= (JSONObject)parse;
		// to get the value by passing the key
		Object object = jsonObject.get("name");
		System.out.println(object);
		Object object2 = jsonObject.get("age");
		System.out.println(object2);
		Object object3 = jsonObject.get("status");
		System.out.println(object3);
		Object object4 = jsonObject.get("address");
		JSONObject jsonObject2 = (JSONObject)object4;
		Object object5 = jsonObject2.get("city");
		Object object6 = jsonObject2.get("state");
		Object object7 = jsonObject2.get("country");
		System.out.println(object5+","+object6+","+object7);
		
		Object object8 = jsonObject.get("courses");
		//Type casting between object and jsonArray
		JSONArray jsonArrray = (JSONArray)object8;
		Object object9 = jsonArrray.get(0);
		System.out.println("first index: "+object9);
		// to get all the values in the object
		for (int i = 0; i <jsonArrray.size(); i++) {
			Object object10 = jsonArrray.get(i);
			System.out.println(object10);
		}
	}
	
	

}
