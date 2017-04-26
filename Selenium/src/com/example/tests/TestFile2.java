package com.example.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFile2 
{
	
	WebDriver selenium = new FirefoxDriver();
	
    	 @Test
    	public void test()
    	 { 
    		selenium.get("https://grill-man.ru/catalog");
    				 
	    		List<WebElement> myList=selenium.findElements(By.cssSelector(".left-col"));
	   		    List<String> all_elements_text=new ArrayList<>();

   		    for(int i=0; i<myList.size(); i++)
   		    {
	    		all_elements_text.add(myList.get(i).getText());
	    		System.out.println(String.format("Блюдо: %s", myList.get(i).getText()));
	    		//System.out.println(all_elements_text);
   		    }			        

   		  
    				 
    				//List <WebElement> button = node.findElements(By.cssSelector
    				    //("input[class="form-submit ajax-processed"]"));
 
    		}
    	         
    	 	@After
    	 	public void tearDown() throws Exception 
    	 	{
    	    selenium.quit();
    	 	}
}
     
     