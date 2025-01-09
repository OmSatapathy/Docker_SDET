package com.jan7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Trycatch {

	public static void main(String[] args)  {
	
		try {
			
			int  s= 5/0;
			
		} finally  {
			System.out.println("occured");
		}

	}

}
