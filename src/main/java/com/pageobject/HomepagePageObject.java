package com.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomepagePageObject {

	
	private WebElement username = (WebElement) By.xpath("//input[@id ='name']");
	private WebElement email = (WebElement) By.xpath("//input[@id ='email']");
	private WebElement phone = (WebElement) By.xpath("//input[@id ='phone']");
	private WebElement address = (WebElement) By.xpath("//textarea[@id='textarea']");
	private WebElement gender = (WebElement) By.xpath("//input[@id='male' and @name='gender' and @type='radio']");
	
	private WebElement days = (WebElement) By.xpath("//input[@class='form-check-input' and @type='checkbox']");
          
	
}
