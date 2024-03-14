package org.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.read.TaskRoot;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadPojoTask {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader f = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\JavaApiFramework\\src\\test\\resources\\TaskOfEg5.json");
		ObjectMapper o = new ObjectMapper();
		TaskRoot readValue = o.readValue(f, TaskRoot.class);
		int id = readValue.getId();
		System.out.println(id);
	}

}
