package com.feb11;

public class Laptop {

	private int year;
	private double price;
	private String cpu;
	private String hardDisk;

	public Laptop(int year, double price, String cpu, String hardDisk) {

		this.year = year;
		this.price = price;
		this.cpu = cpu;
		this.hardDisk = hardDisk;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public String getCpu() {
		return cpu;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	@Override
	public String toString() {
		return "Laptop [year=" + year + ", price=" + price + ", cpu=" + cpu + ", hardDisk=" + hardDisk + "]";
	}

}
