package org.write;

public class WriteRoot {

	private String name;
	private String company;
	private String country;
	private int id;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public WriteRoot(String name, String company, String country, int id, int salary) {
		super();
		this.name = name;
		this.company = company;
		this.country = country;
		this.id = id;
		this.salary = salary;
	}
	
}
