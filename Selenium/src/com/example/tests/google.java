package com.example.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.regex.Pattern;
import java.awt.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google {

	@Test
	public void test() {
		WebDriver webDriver = new FirefoxDriver();
		  webDriver.get("https://google.com/ncr");	
		  webDriver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		  //assertTrue(webDriver.findElement(By.cssSelector(".srg .g:nth-child(1)")).getText().contains("selenium")); 
		  Assert.assertThat(webDriver.findElement(By.cssSelector(".srg .g:nth-child(1)")).getText(), 
				  containsString("Selenium is a suite of tools to automate web browsers across many platforms")); //проверка наличия текста на странице
		  webDriver.findElement(By.name("q")).sendKeys("chemical element ", Keys.ENTER);
		  
//		 Assert.assertThat(webDriver.findElement(By.cssSelector(".srg .g:nth-child(1)")).getText(), 
//		  containsString("Selenium at Chemical Elements.com"));
		 
		  (new WebDriverWait(webDriver, 4)).until(ExpectedConditions.
				  textToBePresentInElementLocated(By.cssSelector(".srg .g:nth-child(1)"), 
						  "Selenium at Chemical Elements.com"));
		  
		  
		  
		
		
		  
	}

}
