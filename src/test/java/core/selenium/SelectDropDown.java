package core.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	WebDriver driver;

	@Test
	public void dropDown() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");

		WebElement ele = driver.findElement(By.xpath("(//*[@class=\"col-sm-10\"])[1]"));
		ele.click();

		WebElement drop = driver.findElement(By.xpath("(//*[@class=\"form-control gds-cr\"])[1]"));

		Select sel = new Select(drop);
		List<WebElement> alloptions = sel.getOptions();

		for (WebElement opt : alloptions) {

			System.out.println(opt.getText());
		}

		for (int i = 0; i < alloptions.size(); i++) {
			if (alloptions.get(i).isSelected() == false) {
				alloptions.get(i).click();
			}
		}

	}
}
