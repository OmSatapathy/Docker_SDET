package docker_sdet;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HomeOne {

	
	WebDriver driver;
	
	
	@Test
	public void runner() throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("/Users/om.satapthy/eclipse-workspace/docker_sdet/chromedriver"));
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("disable-infobars");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--headless");
//		options.addArguments("--ignore-certificate-errors");
//		options.setAcceptInsecureCerts(true);
//		options.setCapability("browserVersion", "118");
//	//	options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
//		
//		
//
//		
//		 driver = new RemoteWebDriver(new URL("http://localhost:4444/"),options);
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 
		 System.out.println(driver.getTitle());
	}
}
