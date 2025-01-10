package com.easyapply;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisablilitySolution {
	
	 WebDriver driver;
	
	@Test
	public void launch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		driver.get("https://jobs.disabilitytalent.org/job/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='keywords']")).click();
		driver.findElement(By.xpath("//input[@id='keywords']")).sendKeys("sonicjobs");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='quick-search']")).click();
		
		
		System.out.println(driver.findElement(By.xpath("(//article/div/div[@class='media-heading listing-item__title'])[1]")).getText());
		
		//driver.findElement(By.xpath("(//article/div/div[@class='media-heading listing-item__title'])[1]")).click(); // will change
		
	//	driver.findElement(By.xpath("(//div[@class='media-heading listing-item__title'])[2]")).click();
		
		
		driver.findElement(By.xpath("//div[@class='section']/article[1]/div[1]]")).click();
		
	
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Quick Apply']")).click();
		
		Thread.sleep(10000);
		
	//	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		//iframe[contains(@id,’frame’)]
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='sj-overlay']/div/iframe")));
		

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.click();
		email.sendKeys("manoj667@yopmail.com");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@id='sq_101i']")).sendKeys("pqr");
		driver.findElement(By.xpath("//input[@id='sq_102i']")).sendKeys("sq_102i");
		
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,350)", "");
		
	//	driver.findElement(By.xpath("//span[text()='Select File']")).click();
		
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("/Users/om.satapthy/Downloads/Varun_Verma_CV.pdf");
		
		Thread.sleep(6000);
		
		System.out.println("uploaded !");
		
		jss.executeScript("window.scrollBy(0,550)", "");
		
		
		driver.findElement(By.xpath("//input[@title='Next']")).click();
		Thread.sleep(6000);
		
		
		driver.findElement(By.xpath("//input[@id='sq_105i']")).sendKeys("734499555");
		driver.findElement(By.xpath("//input[@id='sq_106i']")).sendKeys("USA");
		driver.findElement(By.xpath("//input[@id='sq_107i']")).sendKeys("California");
		
		jss.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//input[@id='sq_108i']")).sendKeys("Chaves County");
		driver.findElement(By.xpath("//input[@id='sq_109i']")).sendKeys("New york");
		driver.findElement(By.xpath("//input[@id='sq_110i']")).sendKeys("100034");
		jss.executeScript("window.scrollBy(0,550)", "");
		
		driver.findElement(By.xpath("//input[@id='sq_111i']")).sendKeys("2nd link road");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission']"))); 
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
		
		driver.findElement(By.xpath("//input[@id='sq_112i_0' and @type='radio'and @value='Yes']")).click();
		
		jss.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//input[@id='sq_113i_0']")).click();
		driver.findElement(By.xpath("//li[@id='sq_113i_listI do not want to answer']")).click();
		
		jss.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//input[@id='sq_114i_0']")).click();
		driver.findElement(By.xpath("(//input[@id='sq_115i_2'])[1]]")).click();
		jss.executeScript("window.scrollBy(0,350)", "");
		
		
//	List<WebElement>lstelement =driver.findElements(By.xpath("//input"));
		
	 //   WebElement ele=	driver.findElement(By.xpath("//div[@id='sj-overlay']/div/iframe"));
	//	driver.switchTo().frame(ele);
		
//		Thread.sleep(6000);
//		//*[@id="sv-file-choose-file"]
//		
//		
//		driver.findElement(By.xpath("//input[@id='sq_100i']")).click();
//		driver.findElement(By.xpath("//input[@id='sq_100i']")).sendKeys("manoj667@yopmail.com");
//		
	}

}
