package com.easyapply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Monster {
	

	 WebDriver driver;
	
	@Test
	public void launch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	//    driver = new ChromeDriver();
	    
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--user-agent=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
	    driver = new ChromeDriver(options);
		
	 //   options.se
		driver.get("https://www.monster.com/jobs");
	
		Thread.sleep(3000);
				
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='horizontal-input-one-undefined']")).click();
		driver.findElement(By.xpath("//input[@id='horizontal-input-one-undefined']")).sendKeys("sonicjobs");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='horizontal-input-two-undefined']")).click();
		driver.findElement(By.xpath("//input[@id='horizontal-input-two-undefined']")).sendKeys("new york");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sc-hfiVbt fYllvn']")).click();
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='quick-search']")).click();
	}

}
