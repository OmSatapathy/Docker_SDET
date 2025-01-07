package com.designpattens;

public class PhoneBuilder {

	private String model;
	private String os;
	private String processer;
	private double screensize;
	private int battery;
	public String getModel() {
		return model;
	}

	public PhoneBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcesser(String processer) {
		this.processer = processer;
		return this;
	}
	public PhoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	
	public Phone getphone() {
		return new Phone(model, os, processer, screensize, battery);
		
	}
	
}
