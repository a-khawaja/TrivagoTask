package com.trivago.room5.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.trivago.room5.SearchLocation.searchLocation;

public class search {

	@Test
	public void locationSearch() throws Throwable
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hassan\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://room5.trivago.com/");
		
		
		searchLocation Loc = new searchLocation(driver);
		Loc.enterLocation("Panama");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
