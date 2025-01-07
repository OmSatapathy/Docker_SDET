package core.dec24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAlertWindow {
	static WebDriver driver;

	@Test
	public void handleAlert() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("accepted");
		driver.quit();
	}

	@Test
	public void handleAlert2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Alert alt = driver.switchTo().alert();
		String mesaage = alt.getText();
		System.out.println(mesaage);
		alt.dismiss();
		String actualtext = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(actualtext);
		driver.quit();
	}

	@Test
	public void handleAlert3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");


		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		Alert alt = driver.switchTo().alert();
		String mesaage = alt.getText();
		System.out.println(mesaage);
		alt.sendKeys("i am promt alert");
		alt.accept();
		String actualtext = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		actualtext.contains("i am promt alert");
		driver.quit();
	}
}
