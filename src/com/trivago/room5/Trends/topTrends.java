package com.trivago.room5.Trends;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class topTrends {
	
	WebDriver driver;
	
	By cookies = By.className("Cookie__button");
	By cross = By.className("_hj-f5b2a1eb-9b07_widget_icon");
	By article = By.xpath("/html/body/div[1]/div[3]/div/div[4]/div/div/div[1]/a");
	 
	
	public topTrends(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void Trends() throws Throwable
	{
		driver.findElement(cookies).click();
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1430)");
		
		Thread.sleep(2000);
		driver.findElement(article).click();
	
		Thread.sleep(3000);
		
		driver.navigate().back();
	}

}
	