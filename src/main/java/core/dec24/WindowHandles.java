package core.dec24;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	static WebDriver driver;

	@Test()
	public void windowhandler1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

		String parent = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> itr = allwindows.iterator();

		while (itr.hasNext()) {
			String singleWindow = itr.next();
			if (singleWindow != parent) {
				System.out.println(driver.switchTo().window(singleWindow).getTitle());
				driver.close();
			}

		}

		driver.quit();
	}

	@Test
	public void newTab() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 450)");
		
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		String parent = driver.getWindowHandle();

		Set<String> alltabs = driver.getWindowHandles();
		Iterator<String> itr = alltabs.iterator();
		while (itr.hasNext()) {
			String singleWindow = itr.next();
			if (singleWindow != parent) {
				System.out.println("opened tabs: "+ driver.switchTo().window(singleWindow).getTitle());
				driver.close();
			}

		}
		driver.quit();
	}
	
	@Test
	public void newTabsWindowsBtn() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1350)");
		
		driver.findElement(By.xpath("//button[@id='newTabsWindowsBtn']")).click();
		String parent = driver.getWindowHandle();

		Set<String> alltabs = driver.getWindowHandles();
		Iterator<String> itr = alltabs.iterator();
		while (itr.hasNext()) {
			String singleWindow = itr.next();
			if (singleWindow != parent) {
				System.out.println("opened tabs: "+ driver.switchTo().window(singleWindow).getTitle());
				driver.close();
			}

		}
		driver.quit();
	}
}
