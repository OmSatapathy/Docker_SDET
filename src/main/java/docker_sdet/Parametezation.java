package docker_sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametezation {
	WebDriver driver;
	
	@Parameters("broswer")
	@Test
	public void setUp(String broswer) {
		if(broswer.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();

		}
		if(broswer.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://github.com/OmSatapathy");
		}
	}
	@Test(groups = "smoke")
	public void m1() {
		
	}
	@Test
	public void m12() {

	}
	@Test(groups = "smoke")
	public void m13() {

	}
	@Test(groups = "smoke")
	public void m14() {

	}
	@Test
	public void m15() {

	}
	@Test
	public void m16() {

	}
	@Test
	public void m17() {

	}
	@Test
	public void m18() {

	}

}
