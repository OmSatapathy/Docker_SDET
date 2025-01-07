package com.designpattens;

public class Phone {

	private String model;
	private String os;
	private String processer;
	private double screensize;
	private int battery;
	
	public Phone(String model, String os, String processer, double screensize, int battery) {
	

		this.model = model;
		this.os = os;
		this.processer = processer;
		this.screensize = screensize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", os=" + os + ", processer=" + processer + ", screensize=" + screensize
				+ ", battery=" + battery + "]";
	}
	
	
	
}
