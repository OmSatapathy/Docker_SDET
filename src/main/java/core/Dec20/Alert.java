package core.Dec20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Alert {

	static WebDriver driver;

	@Test
	public void launch() {

		driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/com.opencsv/opencsv/5.9");

		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		for (WebElement iframe : ele) {
			driver.switchTo().frame(iframe);
		}

	}

}
