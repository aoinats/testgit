package com.example.tests;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yandex 
{
	WebDriver selenium = new FirefoxDriver();

//sddgfgsgdf
	@Test
	public void test()
	{ 
		selenium.get("https://yandex.ru");	
	     
		WebElement news = selenium.findElement(By.cssSelector("#tabnews_newsc"));
		 List<WebElement> list = news.findElements(By.cssSelector("a"));
		 for (WebElement cycle : list) 
		 {
			
		 System.out.println(String.format("новость: %s", cycle.getText()));
		 
		 }   
	}	 
	 

}