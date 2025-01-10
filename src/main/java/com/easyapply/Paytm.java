package com.easyapply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paytm {

	 WebDriver driver;
	 
	 
	 @Test
	public void run() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		Thread.sleep(6000);
		
		
		driver.switchTo().frame(0);
		
		
		
	
		Thread.sleep(6000);
		
	WebElement ele=	driver.findElement(By.xpath("//div[@class='tabWrapper']"));
		
		System.out.println(ele.getText());
	}
}
