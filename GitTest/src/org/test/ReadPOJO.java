package org.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.read.Address;
import org.read.ReadRoot;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadPOJO {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader f = new FileReader(
				"C:\\Users\\Admin\\eclipse-workspace\\JavaApiFramework\\src\\test\\resources\\sample.json");
		ObjectMapper o = new ObjectMapper();
		ReadRoot readValue = o.readValue(f, ReadRoot.class);
		String name = readValue.getName();
		System.out.println("name: " + name);
		int age = readValue.getAge();
		System.out.println("age: " + age);
		boolean status = readValue.isStatus();
		System.out.println("status: " + status);
		Address address = readValue.getAddress();
		String city = address.getCity();
		String state = address.getState();
		String country = address.getCountry();
		System.out.println("Address: " + city + "," + state + "," + country);
		ArrayList<String> courses = readValue.getCourses();
		for (int i = 0; i < courses.size(); i++) {
			String string = courses.get(i);
			System.out.println(string);
		}
	}
}
