package docker_sdet;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Kuberntes {

	public static void main(String[] args) throws MalformedURLException {
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		
		//ChromeOptions chromeOptions = new ChromeOptions();

		//chromeOptions.setBrowserVersion("119");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4445"),dc);
		
	//	WebDriver driver = new FirefoxDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		
		
		System.out.println(driver.getTitle());

	}

}
