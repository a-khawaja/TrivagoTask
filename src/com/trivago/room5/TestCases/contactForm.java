package com.trivago.room5.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.trivago.room5.ContactPage.contactPage;
import com.trivago.room5.SearchLocation.searchLocation;


public class contactForm {

	@Test
	public void contact() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hassan\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://room5.trivago.com/");
	
		contactPage cp = new contactPage(driver);
		cp.contactFormNavigation("This is a testing message for Trivago Task", " Herr Amjad", "hasan.silent91@gmail.com");

		Thread.sleep(5000);
		
		driver.quit();
	}

}