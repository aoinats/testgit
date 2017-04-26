package com.example.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rnd 
{
	
	WebDriver selenium = new FirefoxDriver();
	
    @Test
    public void test() throws InterruptedException
    { 
    	selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	selenium.get("https://grill-man.ru/catalog");
     		
     	//List<WebElement> nodes = selenium.findElements(By.cssSelector
     		//	("#content [class=node node-catalog node-promoted clearfix"));
     				 
 	    		List<WebElement> myList=selenium.findElements(By.cssSelector
 	    				("input[value=Заказать]"));
 	    		
 	    		List<WebElement> all_elements=new ArrayList<WebElement>();
 	    		
    		    for(int i=0; i<myList.size(); i++)
    		    {
    		    	all_elements.add(myList.get(i));
    		    	myList.get(i).click();
    		    	System.out.println(all_elements);
    		    }			  
    		    
    			
   		    
   		    //39585
   		 // #content [class="node node-catalog node-promoted clearfix"] - íîäû
   		 
   		 /*
			List<WebElement> myList2=selenium.findElements(By.linkText("+"));
			
			for(int i=0; i<myList2.size(); i++)
			{
				myList2.get(i).click();	
			}		
		
		*/	        
   		  
    				 
 
    		}
    	         
    	 	
    	 }


     
     
