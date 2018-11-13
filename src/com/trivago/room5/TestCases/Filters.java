package com.trivago.room5.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.trivago.room5.Destination.navigDestinations;
import com.trivago.room5.FilterResults.filterResults;

public class Filters{

	@Test
	public void results() throws Throwable {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hassan\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://room5.trivago.com/");
	
		filterResults fr = new filterResults(driver);
		fr.checkingFilters();
	
		Thread.sleep(3000);
		driver.quit();
	}
}