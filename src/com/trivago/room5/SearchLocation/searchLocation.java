package com.trivago.room5.SearchLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class searchLocation {

	WebDriver driver;
	
	By cookies = By.className("Cookie__button");
	By icon = By.className("search-icon");
	//By search = By.className("input search-input"); 
	By search = By.xpath("/html/body/div[1]/div[1]/header/div/div/div[4]/div[1]/div[2]/input");
	
	
	public searchLocation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterLocation(String location)
	{
		driver.findElement(cookies).click();
		driver.findElement(icon).click();
		driver.findElement(search).sendKeys(location);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	}
}
