package docker_sdet;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jobcase {

	WebDriver driver;

	@Test
	public void launch() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.sonicjobs.com/us");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(text(),'Accept')]")).click();

		List<WebElement> totalcount = driver.findElements(By.tagName("a"));
		System.out.println(totalcount.size());

		for (Iterator<WebElement> iterator = totalcount.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());

			List<WebElement> popularSearch = driver.findElements(By
					.xpath("//a[@class='popular-job-item_search-option-wide__pCK29 popular-job-item_common__nz2pX']"));
			popularSearch.get(3).click();

		}

		Thread.sleep(4003);
		WebElement ele = driver
				.findElement(By.xpath("//*[contains(text(),'Anytime')]"));
		ele.click();
		
		WebElement ele1 = driver
				.findElement(By.xpath("//*[contains(text(),'Last 3 days')]"));
		ele1.click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		

	}

}