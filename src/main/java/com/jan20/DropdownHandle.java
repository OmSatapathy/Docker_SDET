package com.jan20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {

	WebDriver driver;

	@Test
	public void handleDropdown() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement ele = driver.findElement(By.xpath("//select[@id='country']"));
		ele.click();

		//Select sel = new Select(ele);

		List<WebElement> allelements = driver.findElements(By.cssSelector("#country"));
		
		for(int i =0; i< allelements.size();i++) {
			allelements.get(i).click();
		}

	}
}
