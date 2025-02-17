package com.feb11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtab {

	WebDriver driver;

	@Test
	public void openNewtab() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://github.com/OmSatapathy");

		((JavascriptExecutor) driver).executeScript("window.open();");

		for (String tab : driver.getWindowHandles()) {
			driver.switchTo().window(tab);
		}
		// driver.get("https://www.bing.com");
	}

	@Test
	public void openNewtab1() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com");

		// Open a new tab using Ctrl + t (Cmd + t for Mac)
		WebElement body = driver.findElement(By.tagName("body"));
		body.sendKeys(Keys.COMMAND + "t"); // Use Keys.COMMAND for Mac
		 driver.get("https://www.bing.com");
	}
}
