package com.jan11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webautomation {
	WebDriver driver;

	@Test
	public void verifyCountry() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement ele =driver.findElement(By.id("country"));
		  
		  Select sel= new Select(ele);
		  sel.selectByVisibleText("France");
		  
		  
		List<WebElement> allanimals =  driver.findElements(By.id("animals"));
		for(WebElement animal : allanimals) {
			System.out.println(animal.getText());
		}
		  
		  
		  
		  
	}

}
