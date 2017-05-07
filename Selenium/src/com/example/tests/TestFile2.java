package com.example.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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

import junit.framework.Assert;

public class TestFile 
{
	
	WebDriver selenium = new FirefoxDriver();
	
    	 @Test
    	public void test() throws InterruptedException
    	 { 
    		 
    		 PrintWriter zzz = null;
             try
             {
                 zzz = new PrintWriter(new FileOutputStream("combinations.txt"));
             }
             catch(FileNotFoundException e)
             {
                 System.out.println("Ошибка открытия файла combinations.txt");
                 System.exit(0);
             }
             
    		 
    		selenium.get("https://grill-man.ru/catalog");
    			
    		WebElement catalog = selenium.findElement(By.cssSelector("div#content"));
    		List<WebElement> list = catalog.findElements(By.cssSelector("div.node-catalog"));
    			 
    			 int maxnum=(int)(Math.random()*6);
    			 int num = 0;
    			 int last_price = 0;
    			 
    			 
    			 for (WebElement foods : list)  
    			 {
    				 WebElement name  = foods.findElement(By.cssSelector("div.left-col h2"));
    				 WebElement price = foods.findElement(By.cssSelector("div.field-name-commerce-price"));
    				 
    				 WebElement offer = foods.findElement(By.cssSelector("input.form-submit"));
    				 
    				 if(Math.random() > 0.8 && num < maxnum)
    				 {
    					 num++;
    					 offer.click();
    					 System.out.println(String.format("Блюдо: %d из %d\n", num, maxnum));
    					 System.out.println(String.format("Блюдо: %s\n по цене: %s", name.getText(), price.getText()));
    					 Thread.sleep(2000);
    					 
    					 //zzz.println(String.format("Блюдо: %s\n по цене: %s", name.getText(), price.getText()));
    					 //zzz.close();
    					
    					 
    					 /*
    						 WebElement last_last_price = selenium.findElement(By.cssSelector("div.final-price"));
    						 System.out.println(String.format("Итого: %s\n", last_last_price.getText()));
    						 while(last_price==(Integer.parseInt(last_last_price.getText()))){}
    						 last_price = Integer.parseInt(last_last_price.getText());
    						 
    					 */
    					 
    					 Thread.sleep(2000);
    					 
    				 }
    			
    			 }
    			 
    			 
    			 (new WebDriverWait(selenium, 4)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
    					 ("a.checkout-button")));
    			 
    			 WebElement basket = selenium.findElement(By.cssSelector("a.checkout-button"));
    			 	basket.click();
    			 	
    			 	
    			 	 (new WebDriverWait(selenium, 4)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
        					 ("input#edit-customer-profile-billing-field-phone-und-0-value")));
    			 
    			 	
    			 	selenium.findElement(By.cssSelector("input#edit-customer-profile-billing-field-phone-und-0-value")).clear();
    			    selenium.findElement(By.cssSelector("input#edit-customer-profile-billing-field-phone-und-0-value"))
    			    .sendKeys("8805553535");
    			    
    			    (new WebDriverWait(selenium, 4)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
       					 ("input#edit-continue")));
    			 	
    			 WebElement checkout = selenium.findElement(By.cssSelector("input#edit-continue"));
    			 	checkout.click();
    			 	
    			 	
    			 	
    			 	(new WebDriverWait(selenium, 4)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
          					 ("div.discount")));
    			 	
    			 	

    			 
    	         	
    	 }
    	 /*
    	 	@After
    	 	public void tearDown() throws Exception 
    	 	{
    	    //selenium.quit();
    	 	}
    	 	*/
}
     
     
