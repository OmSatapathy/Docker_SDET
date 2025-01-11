package com.jan11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webautomation {
	WebDriver driver;

//	@Test
	public void verifyCountry() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement ele = driver.findElement(By.id("country"));

		Select sel = new Select(ele);
		sel.selectByVisibleText("France");

		List<WebElement> allanimals = driver.findElements(By.id("animals"));
		for (WebElement animal : allanimals) {
			System.out.println(animal.getText());
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();

	}

//	@Test
	public void softAssetExample() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		SoftAssert softAssert = new SoftAssert();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		String actualRersult = driver.getTitle();

		String expectedResult = "GeeksforGeeks ";

		softAssert.assertEquals(actualRersult, expectedResult, "Title is not Matching");

		driver.findElement(By.linkText("Java")).click();

		softAssert.assertAll();
		driver.close();
	}

	@Test
	public void framehandler() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://demoqa.com/frames");
	//	WebElement ele = driver.findElement(By.id("frame1"));

		driver.switchTo().frame(0);
		//System.out.println();

	}

}
