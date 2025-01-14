package com.jan11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorHandle {

	WebDriver driver;

	@Test
	public void dropDown() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement ele = driver.findElement(By.xpath("//input[@id='comboBox']"));
		ele.click();

		List<WebElement> options = driver.findElements(By.xpath("//div[@class='option']"));
		
		for(int i =0; i< options.size();i++) {
			if(options.get(i).getText().equalsIgnoreCase("Item 12")) {
				options.get(i).click();
			}
		}

	}
}
