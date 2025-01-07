package com.designpattens;

public class Shop {

	public static void main(String[] args) {

		Phone ph = new PhoneBuilder().setBattery(3000).setModel("HTC").getphone();
		System.out.println(ph);

	}

}
