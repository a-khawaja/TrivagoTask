package com.trivago.room5.FilterResults;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class filterResults {
	
	WebDriver driver;
	
	By cookies = By.className("Cookie__button");
	By navButton = By.className("nav-icon");
	By nxtButton = By.xpath("/html/body/div[1]/div[1]/header/div/div/div[3]/div/div/div[1]/div[2]/div/div[3]");
	By destin = By.xpath("/html/body/div[1]/div[1]/header/div/div/div[3]/div/div/div[1]/div[2]/div/div[1]/div[5]/a/div/div[2]");
	By theme = By.xpath("/html/body/div[1]/div[1]/header/div/div/div[3]/div/div/div[2]/div[1]/div/div");
	By themeOption = By.xpath("/html/body/div[1]/div[1]/header/div/div/div[3]/div/div/div[2]/div[2]/div/div[1]/div[4]/a/div/div");
	By article = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[1]/a/span/h2/span");
	
	public filterResults(WebDriver driver)
	{
		this.driver = driver;
	} 
	
	public void checkingFilters() throws Throwable
	{
		driver.findElement(cookies).click();
		driver.findElement(navButton).click();
		Thread.sleep(2000);
		
		driver.findElement(nxtButton).click();
		
		Thread.sleep(1500);
		
		driver.findElement(destin).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.findElement(navButton).click();	
		Thread.sleep(3000);
		driver.findElement(theme).click();
		driver.findElement(themeOption).click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1400)");
		
		Thread.sleep(3000);
		
		driver.findElement(article).click();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
	}

}
