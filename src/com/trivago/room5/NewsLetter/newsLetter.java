package com.trivago.room5.NewsLetter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class newsLetter {
	
		WebDriver driver;
		
		By cookies = By.className("Cookie__button");
		By cross = By.className("_hj-f5b2a1eb-9b07_widget_icon");
		By chkBox = By.id("confirm");
		//By Email = By.cssSelector("[name='email']");
		By Email = By.xpath("/html/body/div[1]/div[3]/div/div[7]/section/div/div/div[2]/div[3]/div[1]/input");
		By Inspire = By.className("submit");
		
		
		public newsLetter(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public void subscribe(String E) throws Throwable
		{
			Actions a = new Actions(driver);
			a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
			
			driver.findElement(cookies).click();
			driver.findElement(chkBox).click();
			driver.findElement(cross).click();
			driver.findElement(Email).sendKeys(E);
	
			Thread.sleep(3000);
	
			driver.findElement(Inspire).click();
		}
		

	}