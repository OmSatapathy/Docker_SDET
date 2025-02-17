package com.feb11;

public class PojoDetails {
	
	private String name;
	private Laptop data;
	
	
	public PojoDetails(String name, Laptop data) {

		this.name = name;
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public Laptop getData() {
		return data;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setData(Laptop data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "PojoDetails [name=" + name + ", data=" + data + "]";
	}
	

}
