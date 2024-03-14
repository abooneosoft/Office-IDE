package org.task5;

import java.util.ArrayList;

public class Root {
	private ArrayList<Sample> sample;

	public ArrayList<Sample> getSample() {
		return sample;
	}

	public void setSample(ArrayList<Sample> sample) {
		this.sample = sample;
	}

	public Root(ArrayList<Sample> sample) {
		super();
		this.sample = sample;
	}
	

}
