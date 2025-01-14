package com.apitest;

import java.util.List;

public class Assert {
	
	private String name;
	private Laptop data;
	
	
	
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
		return "Assert [name=" + name + ", data=" + data + "]";
	}
	
	
}
