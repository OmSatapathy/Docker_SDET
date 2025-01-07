package core.dec24;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MutipleTry {

	static WebDriver driver;
	@Test(invocationCount = 3)
	public void testOne() {
		System.out.println("testOne");
	}
	@Test
	public void testtwo() {
		System.out.println("testtwo");
	}
    @Test
	public void testThree() {
		System.out.println("testThree");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		
		// disable images while executaion
		ChromeOptions options = new ChromeOptions();
        disableChromeImages(options);
        driver = new ChromeDriver(options);

        driver.get("https://www.amazon.com/");
		
	}


    public static void disableChromeImages(ChromeOptions options)
    {
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);

        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);

        options.setExperimentalOption("prefs", prefs);

    }

}
