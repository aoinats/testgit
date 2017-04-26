package com.example.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class massive 
{
	
	WebDriver selenium = new FirefoxDriver();
	
    	 @Test
    	public void test()
    	 { 
    		selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		selenium.get("https://grill-man.ru/catalog");
    		
    		
    				 
	    		List<WebElement> myList=selenium.findElements(By.cssSelector
	    				("input[value=Заказать]"));
	    		
	    		List<String> all_elements_text=new ArrayList<>();
	    		
   		    for(int i=0; i<10; i++)
   		    {
   		    	all_elements_text.add(myList.get(i).getText());
   		    	myList.get(i).click();
   		    	System.out.println(String.format("Номер: %s",all_elements_text.size()));
   		    	
   		  
   		    }			        
   		    
   		    
   		    //39585
   		 // #content [class="node node-catalog node-promoted clearfix"] - ноды
   		 
   		 /*
			List<WebElement> myList2=selenium.findElements(By.linkText("+"));
			
			for(int i=0; i<myList2.size(); i++)
			{
				myList2.get(i).click();	
			}		
		
		*/	        
   		  
    				 
 
    		}
    	         
    	 	
}
     
     