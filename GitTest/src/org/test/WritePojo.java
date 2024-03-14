package org.base;

import java.io.File;
import java.io.IOException;

import org.write.WriteRoot;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WritePojo {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\JavaApiFramework\\src\\test\\resources\\JsonFiles\\JsonWritten.json");
		ObjectMapper o = new ObjectMapper();
		WriteRoot write = new WriteRoot("Aboo","Tesla", "London", 34423, 3000000);
		o.writeValue(f, write);
	}

}
