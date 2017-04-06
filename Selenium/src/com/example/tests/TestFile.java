package com.example.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFile 
{
	
	WebDriver selenium = new FirefoxDriver();
	
    	 @Test
    	public void test()
    	 { 
    		 PrintWriter zzz = null;
             try
             {
                 zzz = new PrintWriter(new FileOutputStream("Горячее2.txt"));
             }
             catch(FileNotFoundException e)
             {
                 System.out.println("Ошибка открытия файла Горячее.txt");
                 System.exit(0);
             }
    		 
    		selenium.get("https://grill-man.ru/");
    			
    		WebElement catalog = selenium.findElement(By.cssSelector("div#content"));
    			 List<WebElement> list = catalog.findElements(By.cssSelector(".trimmed-text"));
    			 
    			 for (WebElement foods : list)  
    			 {
    				 System.out.println(String.format("Блюдо: %s", foods.getText()));
    		         zzz.println(String.format("Блюдо: %s", foods.getText()));
    				 //foods.click();
    			 }
    	         	zzz.close();
    	 }
    	 	@After
    	 	public void tearDown() throws Exception 
    	 	{
    	    selenium.quit();
    	 	}
}
     
     