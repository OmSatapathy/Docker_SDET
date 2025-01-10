package com.easyapply;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Javascript {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)", "");
//		
//		js.executeAsyncScript("windows.resizeTo(1024,740)");
//		
	// Count uppercase letters in a string
		
		String s= "Om Prkash SataPathY";
		
		int upperCaseCount = 0;
		char character;
		
		for(int i=0; i< s.length(); i++) {
			
			character = s.charAt(i);
			//System.out.print(character); //
		    if(Character.isUpperCase(character)) {
		    	upperCaseCount++;
		    }
		}
		
		System.out.println("Uppercase characters: " + upperCaseCount);
	}

}
