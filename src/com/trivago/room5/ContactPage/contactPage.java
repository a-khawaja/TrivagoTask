package com.trivago.room5.ContactPage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class contactPage {
	
	WebDriver driver;
	
	By cookies = By.className("Cookie__button");
	By cont = By.xpath("/html/body/div[1]/footer/div[1]/div[2]/div/div[2]/a");	
	By msg = By.className("contact-msg");
	By cross = By.className("_hj-f5b2a1eb-9b07_widget_icon");
	By ContName = By.className("contact-input");
	By ContEmail = By.id("contact-email");
	By chkBox = By.id("confirm");
	By subButton = By.className("contact-submit");
	
	public contactPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void contactFormNavigation(String message, String Namee, String Email) throws Throwable
	{
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("ParentWindowHandle " + ParentWindowHandle);
		
		driver.findElement(cookies).click();
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(cross).click();
		
		driver.findElement(cont).click();
		
		Thread.sleep(2000);
		
		for (String childTab:driver.getWindowHandles())
		{
			driver.switchTo().window(childTab);
		}
		
		driver.findElement(msg).sendKeys(message);
		driver.findElement(ContName).sendKeys(Namee);	
		driver.findElement(ContEmail).sendKeys(Email);
		driver.findElement(chkBox).click();

		driver.findElement(subButton).click();
	}
}