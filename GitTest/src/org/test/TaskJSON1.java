package org.base;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TaskJSON1 {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\JavaApiFramework\\src\\test\\resources\\task1.json");
		JSONParser jp = new JSONParser();
		Object parse = jp.parse(f);
		JSONObject jsonObj= (JSONObject)parse;
		Object object = jsonObj.get("id");
		System.out.println(object);
		Object object2 = jsonObj.get("type");
		System.out.println(object2);
		Object object3 = jsonObj.get("name");
		Object object4 = jsonObj.get("ppu");
		System.out.println(object3+" ,ppu: "+object4);
		Object object5 = jsonObj.get("batters");
		JSONObject jsonObj2 = (JSONObject)object5;
//		System.out.println(jsonObj2);
		Object object6 = jsonObj2.get("batter");
		JSONArray jsonObj3 = (JSONArray)object6;
		Object object7 = jsonObj3.get(0);
//		System.out.println(object7);
		JSONObject jsonObj4 = (JSONObject)object7;
		Object object8 = jsonObj4.get("id");
		System.out.println(object8);
		Object object9 = jsonObj4.get("type");
		System.out.println(object9);
		Object object10 = jsonObj3.get(1);
		Object object11 = jsonObj3.get(2);
		Object object12 = jsonObj3.get(3);
		JSONObject jsonObjRandom = (JSONObject) object12;
		Object object13 = jsonObjRandom.get("id");
		Object object14 = jsonObjRandom.get("type");
		System.out.println(object10+"\n"+object11+"\n"+object13+"\n"+object14);
		Object object15 = jsonObj.get("topping");
		JSONArray jsonArray = (JSONArray)object15;
		for (int i = 0; i <jsonArray.size(); i++) {
			Object object16 = jsonArray.get(i);
			JSONObject jsonObjX = (JSONObject)object16;
			for (int j = 0; j < jsonObjX.size(); j++) {
				Object object17 = jsonObjX.get("id");
				Object object18 = jsonObjX.get("type");
				System.out.println(object17+"\n"+object18);
			}	
		}
	}
}
