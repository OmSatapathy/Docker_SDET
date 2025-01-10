package com.corejava;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitMechanisim {
	WebDriver driver;

	@SuppressWarnings("unchecked")
	public void explictWait() {
	WebElement ele=	driver.findElement(By.xpath(""));
		Wait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.elementToBeSelected(ele));
	}
	
	
}
