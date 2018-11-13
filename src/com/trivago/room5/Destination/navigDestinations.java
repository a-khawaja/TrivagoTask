package com.trivago.room5.Destination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class navigDestinations {

		WebDriver driver;
		
		By cookies = By.className("Cookie__button");
		By navButton = By.className("nav-icon");
		By des = By.xpath("//*[@id=\"menu\"]/div/div/div[1]/div[2]/div/div[1]/div[1]/a/div/div[2]");		
		
		public navigDestinations(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public void selectDestination() throws Throwable
		{
			driver.findElement(cookies).click();
			driver.findElement(navButton).click();
			Thread.sleep(2000);
			driver.findElement(des).click();
			
		}
		
}