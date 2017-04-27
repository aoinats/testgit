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
		selenium.get("https://grill-man.ru/catalog");

		    //ноды
		//List<WebElement> nodes = selenium.findElements(By.cssSelector
			//("#content [class=node node-catalog node-promoted clearfix"));

			//Кнопки
		    	List<WebElement> myList=selenium.findElements(By.cssSelector("input[value=Заказать]"));
			//массив
		    	List<WebElement> all_elements=new ArrayList<WebElement>();
		    	//количество
		    	List<WebElement> kolichestvo=selenium.findElements(By.linkText("+"));
 				
		    		//нажатие каждой нечётной кнопки 
 				for(int i=0; i<kolichestvo.size(); i = i + 2)
 				{
 					kolichestvo.get(i).click();	
 					System.out.println(kolichestvo.get(i));
 				}		

			    for(int i=0; i<myList.size(); i++)
			    {
				Thread.sleep(2000);
				all_elements.add(myList.get(i)); // загрузка в массив 
				myList.get(i).click();
				System.out.println(all_elements);
			    }			

			 WebElement zakazat = selenium.findElement(By.cssSelector(".checkout-button"));
			 zakazat.click();

			 WebElement number = (new WebDriverWait(selenium, 10))
						 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
								 ("#edit-customer-profile-billing-field-phone-und-0-value")));
		    
		    	//тест по непонятным причинам не вводит номер и падает
			 selenium.findElement(By.id("#edit-customer-profile-billing-field-phone-und-0-value")).sendKeys("88005553535");
			
		    	 WebElement oformitZakaz = selenium.findElement(By.cssSelector("#edit-continue"));
			 oformitZakaz.click();
		    
		    	if(true) {
    		    	assertEquals("Вы дошли до первой «несгораемой суммы»"
        		    		,selenium.findElement(By.cssSelector("div.discount")).getText());
    	            		System.out.println("Скидка есть");
    	        	} else {
    	               		System.out.println("Скидки нет.");
    	                }
    		        
		    	selenium.navigate().back();
		    
		    
			 
    		    
    			
   		    
   		    //39585
   		 // #content [class="node node-catalog node-promoted clearfix"] - íîäû
   		 
   		         
   		  
    				 
 
    		}
    	         
    	 	
    	 }


     
     
