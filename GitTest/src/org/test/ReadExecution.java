package org.task5;

import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadExecution {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader f = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\JavaApiFramework\\src\\test\\resources\\TaskOfEg5.json");
		ObjectMapper o = new ObjectMapper();
		Root1 readValue = o.readValue(f, Root1.class);
		Sample1 sample = readValue.getSample();
		String id = sample.getId();
		System.out.println(id);
		
	}
}
