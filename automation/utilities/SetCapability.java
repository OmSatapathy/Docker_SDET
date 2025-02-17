package utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetCapability {
	WebDriver driver;
	

//	@Test
	public void setcabapilty() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
		cap.setCapability(CapabilityType.BROWSER_VERSION, "130");
		cap.setCapability(CapabilityType.BROWSER_NAME, "CHROME");
		
		
		RemoteWebDriver rem = new RemoteWebDriver(new URL (""),cap);
	
		

		
	
		
	}
	@Test
	public void manageCokkies() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(opt);
		String url ="https://testingbot.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Set<Cookie> cookiesList =  driver.manage().getCookies();
        for (Cookie getcookies :cookiesList) {
            System.out.println(getcookies);
        }
        
        driver.manage().addCookie(new Cookie("_ga", "GA1.1.1866180364.1737356438"));
	}

}
