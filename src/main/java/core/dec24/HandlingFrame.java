package core.dec24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrame {
	static WebDriver driver;

	@Test
	public void frame1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));

		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i am inside iframe");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void frame2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.cssSelector(".analystic[href='#Multiple']")).click();

		List<WebElement> listFrames = driver.findElements(By.xpath("//div[@id='Multiple']"));
		System.out.println(listFrames.size());
	
		for (WebElement webElement : listFrames) {
			  System.out.println(webElement.getText());

			  
		}
		driver.switchTo().frame(0);
		driver.quit();
	}

}
