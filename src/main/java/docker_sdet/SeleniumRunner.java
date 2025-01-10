package docker_sdet;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumRunner {
	
	static WebDriver driver;

 
	public static void main(String[] args) throws MalformedURLException {

  
		ChromeOptions opt = new ChromeOptions();
		 driver = new RemoteWebDriver(new URL("http://localhost:4444/"),opt);
		
		
		
		
		driver.get("https://github.com/");
		
		System.out.println(driver.getTitle());
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		alert.accept();
		
		Actions act = new Actions(driver);
		act.moveToElement(null, 0, 0);
		act.contextClick();
		act.contextClick(null);
		
		
		TakesScreenshot scn = (TakesScreenshot)driver;
        File fs = scn.getScreenshotAs(OutputType.FILE);
		
		ChromeOptions ops = new ChromeOptions();
		ops.setAcceptInsecureCerts(true);
		
		
	
	}
	


		

}
