package docker_sdet;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newly {
	
	
	WebDriver driver;
	
	@Test
	public void runer() throws MalformedURLException {
		
	
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--no-sandbox");
		options.addArguments("--headless");
		options.addArguments("--ignore-certificate-errors");
		options.setAcceptInsecureCerts(true);
		options.setCapability("browserVersion", "118");
		options.setCapability("platformName", "Linux");
	//	options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		
		
		URL url = new URL("http://localhost:4444/wd/hub");
	
		ChromeOptions optionss = new ChromeOptions();
		options.addArguments("--headless");
		 driver = (RemoteWebDriver) WebDriverManager.chromedriver()                        
		                                   .capabilities(optionss)
		                                   .remoteAddress(url)
		                                   .create();

		
		driver.get("https://github.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
	

}
