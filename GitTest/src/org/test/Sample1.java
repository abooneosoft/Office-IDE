package org.task5;

import java.util.ArrayList;

public class Sample1 {

	private String id;
	private String type;
	private String name;
	private double ppu;
	private Batters1 batters;
	private ArrayList<Topping1> topping;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPpu() {
		return ppu;
	}
	public void setPpu(double ppu) {
		this.ppu = ppu;
	}
	public Batters1 getBatters() {
		return batters;
	}
	public void setBatters(Batters1 batters) {
		this.batters = batters;
	}
	public ArrayList<Topping1> getTopping() {
		return topping;
	}
	public void setTopping(ArrayList<Topping1> topping) {
		this.topping = topping;
	}
	
	
}
