package core.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseofJavaScriptExectuor {

	WebDriver driver;
	JavascriptExecutor js;

	@Test
	public void enterValue() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://github.com/login");

		WebElement email = driver.findElement(By.xpath("//input[@id='login_field']"));

	    js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='omsatapathy7@gmail.com'", email);

	}
	
	@Test
	public void keyBoradAction() {
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		js.executeScript("arguments[0].value='my1234'", password);
	//	js.executeScript("arguments[0].click()", submit);
		
		password.sendKeys(Keys.TAB);
	
		
	}
}