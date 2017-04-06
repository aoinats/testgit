package com.example.tests.test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Plus
{
	WebDriver selenium = new FirefoxDriver();
	
	@Test
	public void test()
	 { 
		selenium.get("https://grill-man.ru/");
		
		selenium.findElement(By.xpath(".//*[@id='commerce-cart-add-to-cart-form-177']/div/div[2]/span[2]/a")).click();
		WebElement Plus1 = (new WebDriverWait(selenium, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.xpath
						 (".//*[@id='commerce-cart-add-to-cart-form-177']/div/div[2]/span[2]/a")));
		
		
		selenium.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		WebElement button1 = (new WebDriverWait(selenium, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.xpath
						 (".//*[@id='edit-submit']")));
			
		
		selenium.findElement(By.xpath(".//*[@id='commerce-cart-add-to-cart-form-180']/div/div[2]/span[2]/a")).click();
		WebElement Plus2 = (new WebDriverWait(selenium, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.xpath
						 (".//*[@id='commerce-cart-add-to-cart-form-180']/div/div[2]/span[2]/a")));
		
		selenium.findElement(By.xpath(".//*[@id='edit-submit--2']")).click();
		WebElement button2 = (new WebDriverWait(selenium, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath
						 (".//*[@id='edit-submit--2']")));
			
		
	 }
}

	 
