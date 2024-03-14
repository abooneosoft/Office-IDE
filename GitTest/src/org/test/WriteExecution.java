package org.task5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteExecution {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\JavaApiFramework\\src\\test\\resources\\JsonFiles\\TaskWritten.json");
		ObjectMapper o = new ObjectMapper();
		
		ArrayList<Batter> bt = new ArrayList<Batter>();
		Batter b = new Batter("101", "Java");
		bt.add(b);
		Batters bs = new Batters(bt);
		
		ArrayList<Topping> tp = new ArrayList<Topping>();
		Topping t = new Topping("102", "Python");
		tp.add(t);
		
		
		Sample s = new Sample("100", "Java", "Courses", 1.55, bs, tp);
		ArrayList<Sample> sam = new ArrayList<Sample>();
		sam.add(s);
		
		Root rt = new Root(sam);
		o.writeValue(f,rt);
	}
}
