package Jan3;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	static WebDriver driver;

	@BeforeMethod
	public void browerInstace() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

//	@Test
	public void multiSelection() {
		WebElement states = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select sel = new Select(states);
		sel.selectByIndex(2);

	}

	// @Test
	public void radioButton() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		driver.findElement(By.xpath("//input[@value='radio1']")).click();

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("in");
		Thread.sleep(3000);
		List<WebElement> contire = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));

		System.out.println(contire.size());

		for (WebElement singleCon : contire) {

			System.out.println(singleCon.getText());
		}
	}

//	@Test
	public void windowHandle() {
		WebElement windowClick = driver.findElement(By.xpath("//*[@id='openwindow']"));
		windowClick.click();
		String parentwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();

		while (itr.hasNext()) {
			String ChildWindow = itr.next();

			if (!ChildWindow.equalsIgnoreCase(parentwindow)) {
				WebDriver chid = driver.switchTo().window(ChildWindow);
				System.out.println(chid.getTitle());
				// driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
	}

//	@Test
	public void switchtab() {
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		String parentWindow = driver.getWindowHandle();

		Set<String> allTabs = driver.getWindowHandles();

		Iterator<String> itr = allTabs.iterator();
		while (itr.hasNext()) {
			String childtab = itr.next();
			if (!childtab.equalsIgnoreCase(parentWindow)) {
				WebDriver tabs = driver.switchTo().window(childtab);
				System.out.println(tabs.getTitle());
				driver.close();

			}
		}

	}

//	@Test
	public void Handleiframe() {

		WebElement mainFrame = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));

		driver.switchTo().frame(mainFrame);

		List<WebElement> totalDetails = driver.findElements(By.xpath("//span[@class='count-text']"));
		for (WebElement ele : totalDetails) {
			System.out.println(ele.getText());
		}

	}

//	@Test
	public void mouseAction() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)");
		WebElement button = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions act = new Actions(driver);
		act.moveToElement(button).build().perform();

		WebElement top = driver.findElement(By.xpath("//a[normalize-space()='Top']"));
		top.click();

	}

//	@Test
	public void handleAlert() {
		WebElement altfield = driver.findElement(By.xpath("//input[@id= 'name']"));
		WebElement okbutton = driver.findElement(By.xpath("//input[@id= 'alertbtn']"));
		WebElement confirmButton = driver.findElement(By.xpath("//input[@id= 'confirmbtn']"));
		altfield.sendKeys("Kishro");
		okbutton.click();
		Alert alt = driver.switchTo().alert();

		System.out.println(alt.getText());
		alt.accept();

		altfield.sendKeys("Manas");
		confirmButton.click();
		driver.switchTo().alert();

		System.out.println(alt.getText());
		alt.dismiss();

	}

	@Test
	public void brokenLinks() {
	
		List<WebElement> links = driver.findElements(By.tagName("a"));
		String url=null;
		for (WebElement link : links) {
			url = link.getAttribute("herf");
		}

		
	try {
	
		URL link = new URL(url);
		HttpURLConnection con = (HttpURLConnection)link.openConnection();
		
		con.setConnectTimeout(5000);
		con.connect();
		if(con.getResponseCode()>400) {
			System.out.println("broken links"+ con.getResponseMessage() );
		}
		if(con.getResponseCode()==200) {
			System.out.println("valid links"+  link);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
