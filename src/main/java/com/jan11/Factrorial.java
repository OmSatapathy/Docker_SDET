package com.jan11;

public class Factrorial {

	public static void main(String[] args) {

		int fact = 1;
		for (int i = 1; i < 6; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
		
		//fibonacii
		
		int n1=0,n3 = 0;
		int n2 =1;
		int num =10;
		
		for(int i =0 ; i< num; i++ ) {
			 n1= n2; 
			 n2= n3;
			 n3=n1+n2;
			 System.out.println(n3);
		}
		
		System.out.println();
		
		
		int num1 =3386;
		int rem;
		int sum=0;
		while(num1>0) {
			rem = num1%10;
			sum = sum*10+rem;
			num1= num1/10;
		}
		
		System.out.println(sum);
	}

}
