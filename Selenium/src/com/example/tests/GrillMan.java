package com.example.tests;

import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Predicate;

public class GrillMan
{
	WebDriver selenium = new FirefoxDriver();
	
	@Test
	public void test() throws InterruptedException
	{ 
		//WebDriverWait wait = new WebDriverWait(selenium, 30, 500);
		//selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // test shodit s uma
		//selenium.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // ne rabotaet
		
		
		selenium.get("https://grill-man.ru/");	
		
			Thread.sleep(2000);
		WebElement Plus1 = (new WebDriverWait(selenium, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.linkText("+")));
		selenium.findElement(By.linkText("+")).click();
	 	 
		
			Thread.sleep(2000);
		WebElement button1 = (new WebDriverWait(selenium, 10))
			 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
					 ("form#commerce-cart-add-to-cart-form-177 input#edit-submit")));
		selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-177 input#edit-submit")).click();
	 
		
			Thread.sleep(2000);
		WebElement Plus2 = (new WebDriverWait(selenium, 10))
			 .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(),'+')])[2]")));
		selenium.findElement(By.xpath("(//a[contains(text(),'+')])[2]")).click();
	 
		
			Thread.sleep(2000);
		WebElement button2 = (new WebDriverWait(selenium, 10))
			 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
					 ("form#commerce-cart-add-to-cart-form-180 input#edit-submit--2")));
		selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-180 input#edit-submit--2")).click();
		
		
			Thread.sleep(2000);
		WebElement Plus3 = (new WebDriverWait(selenium, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(),'+')])[3]")));
		selenium.findElement(By.xpath("(//a[contains(text(),'+')])[3]")).click();
		
		
			Thread.sleep(2000);
		WebElement button3 = (new WebDriverWait(selenium, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
						 ("form#commerce-cart-add-to-cart-form-362 input#edit-submit--3")));
		 selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-362 input#edit-submit--3")).click();
		 
		 
		 	Thread.sleep(2000);
		 	WebElement zakazat = (new WebDriverWait(selenium, 10))
					 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
							 ("a.checkout-button")));
		 selenium.findElement(By.cssSelector("a.checkout-button")).click();
		 
		 	Thread.sleep(2000);
		 selenium.findElement(By.id("edit-customer-profile-billing-field-name-und-0-value")).clear();
		 	Thread.sleep(2000);
		 selenium.findElement(By.id("edit-customer-profile-billing-field-name-und-0-value")).sendKeys("name");
		 	Thread.sleep(2000);
		 selenium.findElement(By.id("edit-customer-profile-billing-field-phone-und-0-value")).clear();
		 	Thread.sleep(2000);
		 selenium.findElement(By.id("edit-customer-profile-billing-field-phone-und-0-value")).sendKeys("88005553535");
		 	Thread.sleep(2000);
		 selenium.findElement(By.id("edit-customer-profile-billing-field-address-und-0-value")).clear();
		 	Thread.sleep(2000);
		 selenium.findElement(By.id("edit-customer-profile-billing-field-address-und-0-value")).sendKeys("adress");
		 	Thread.sleep(2000);
		 selenium.findElement(By.cssSelector("#edit-continue")).click();
		 
		 
		 //selenium.findElement(By.cssSelector("a.checkout-button")).click(); //нажатие на кнопку "заказать"
		 
		 /*
		 кнопка 2
		 selenium.findElement(By.xpath("(//a[contains(text(),'+')])[2]")).click();
		 selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-180 input#edit-submit--2")).click();
		 
		  нопка 3 
		 selenium.findElement(By.xpath("(//a[contains(text(),'+')])[3]")).click();
		 selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-362 input#edit-submit--3")).click();
		 */
		 
		 
		 
		 
		  /* WebElement a;
		 a = selenium.findElement(By.cssSelector(".trimmed-text"));
		 assertTrue(selenium.findElement(By.cssSelector(".trimmed-text")).getText().contains("text"));
		 System.out.println(a);
		 
		 selenium.findElement(By.cssSelector("div#content")).findElements(By.cssSelector(".trimmed-text"));
		
		 
		 
		 List<WebElement> foods = selenium.findElement(By.cssSelector("div#content")).findElements(By.cssSelector(".trimmed-text"));
		 */
	 
	  
	 
	}

}
