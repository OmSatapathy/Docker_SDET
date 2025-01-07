import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstNotRepeatative {

	 static WebDriver driver;
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addArguments("--headless");
		driver= new ChromeDriver(opt);
		driver.get("https://toolsqa.com/selenium-webdriver/ssl-certificate-in-selenium/");
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File fs = sc.getScreenshotAs(OutputType.FILE);
		 File destFile = new File("/Users/om.satapthy/eclipse-workspace/JavaSprint/screenshot.png");
		FileUtils.copyFile(fs, destFile);
		
		
      
       
    }
}
