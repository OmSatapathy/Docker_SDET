package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	static WebDriver driver;

	@Test
	public void dataPickerSelect() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.testim.io/");

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfAllElements(driver.findElement(By.xpath("//span[@class='theme__title___2Ue3-']"))));

		

		driver.findElement(By.xpath("//div[@class='theme__days___3kAIy']//div[9]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
	}

	public static String[] getMonthyear(String monthYearval) {
		return monthYearval.split(" ");
		
	}
	
	
	public static void selectDate(String exday, String exMonth, String exDay) throws InterruptedException {
		String monthyear = driver.findElement(By.xpath("//span[@class='theme__title___2Ue3-']")).getText();

		
		String currentmonth = monthyear.split(" ")[0].trim();
		String currentyear = monthyear.split(" ")[1].trim();

		while (!(currentmonth.equalsIgnoreCase("June") && currentyear.equalsIgnoreCase("2025"))) {
			driver.findElement(By.xpath("//button[@id='right']")).click();
			Thread.sleep(3000);
			System.out.println(monthyear);
			monthyear = driver.findElement(By.xpath("//span[@class='theme__title___2Ue3-']")).getText();
			currentmonth = monthyear.split(" ")[0].trim();
			currentyear = monthyear.split(" ")[1].trim();

		}
	}
}
