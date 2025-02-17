package com.jan27;

public class Child extends Parent {

	public static void m1() {
		System.out.println("child !");
	}
	
	public  void m2() {
		System.out.println(" m2 child");
	}

	public static void main(String[] args) {

		Parent pt = new Child();
		pt.m1();
		
		pt.m2();

	}

}
