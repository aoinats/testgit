package com.example.tests.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testfile {
	
	WebDriver selenium = new FirefoxDriver();
	
    	 @Test
    		public void test(){ 
    		 
    			selenium.get("https://grill-man.ru/");
    			WebElement oneElement = selenium.findElement(By.cssSelector(".trimmed-text"));
    			oneElement = metod(oneElement);
    	 }
    			
    	 private static WebElement metod(WebElement oneElement ){
    			     
         PrintWriter zzz = null;
         try
         {
             zzz = new PrintWriter(new FileOutputStream("my_test_file.txt"));
         }
         catch(FileNotFoundException e)
         {
             System.out.println("Ошибка открытия файла my_test_file.txt");
             System.exit(0);
         }
         zzz.println(String.format("Блюдо: %s", oneElement.getText()));
         
         zzz.close();

         System.out.println("Программа завершена");
		return oneElement;
     }
}
     
     