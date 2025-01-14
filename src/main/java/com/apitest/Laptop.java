package com.apitest;

public class Laptop {
	
	private int year;
	private double price;
	private String model;
	private String harddisk;
	
	
	@Override
	public String toString() {
		return "Laptop [year=" + year + ", price=" + price + ", model=" + model + ", harddisk=" + harddisk + "]";
	}
	public int getYear() {
		return year;
	}
	public double getPrice() {
		return price;
	}
	public String getModel() {
		return model;
	}
	public String getHarddisk() {
		return harddisk;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}
	
	

}
